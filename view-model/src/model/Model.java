package model;
 
import view.View;
import view.Panels.Act;
import view.Panels.Lobby;
import wiiusej.WiiUseApiManager;
import wiiusej.Wiimote;
import wiiusej.wiiusejevents.utils.WiimoteListener;
import controller.Game.ControllerGame;
import controller.Game.WiiMoteGame;
import controller.Lobby.ControllerLobby;
import controller.Lobby.WiiMoteLobby;

public class Model {

	private View view;
	private Act act;
	private Lobby lobby;
	private Wiimote wiimote;
	private ControllerGame controllerGame = new ControllerGame(this);
	private ControllerLobby controllerLobby = new ControllerLobby(this);

	public Model(View view) {
		this.view = view;
		connectWiimote();
		
		act = new Act();
		act.addKeyListener(controllerGame.getKeyboardGame());

		lobby = new Lobby();
		lobby.addKeyListener(controllerLobby.getKeyboardLobby());

		view.setContentPane(getAct());
		wiimote.addWiiMoteEventListeners(new WiiMoteGame(controllerGame));
		view.pack();
		view.setLocationRelativeTo(null);
		view.setVisible(true);
	}

	private void connectWiimote() {
		Wiimote[] wiimotes = WiiUseApiManager.getWiimotes(1, true);
		wiimote = wiimotes[0];
		wiimote.setLeds(true, true, true, true);
		wiimote.activateMotionSensing();
	}

	public Act getAct() {
		return act;
	}

	public Lobby getLobby() {
		return lobby;
	}
	
	public void switchToLobby(){
		view.remove(act);
		view.setContentPane(lobby);
		WiimoteListener[] listener = wiimote.getWiiMoteEventListeners();
		wiimote.removeWiiMoteEventListeners(listener[0]);
		wiimote.addWiiMoteEventListeners(controllerLobby.getWiimoteLobby());
		view.pack();
		lobby.requestFocus();
	}
	
	public void switchPaneltoGame() {
		view.remove(lobby);
		view.setContentPane(act);	
		WiimoteListener[] listener = wiimote.getWiiMoteEventListeners();
		wiimote.removeWiiMoteEventListeners(listener[0]);
		wiimote.addWiiMoteEventListeners(controllerGame.getWiimoteLobby());
		view.pack();
		act.requestFocus();
	}
}
