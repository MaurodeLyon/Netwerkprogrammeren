package model;

import java.awt.event.KeyListener;

import javax.swing.JPanel;

import view.View;
import wiiusej.WiiUseApiManager;
import wiiusej.Wiimote;
import wiiusej.wiiusejevents.utils.WiimoteListener;
import controller.Controller;

public class GameState {
	private View view;
	private Controller controller;

	private Wiimote wiimote;

	private ActModel actModel = new ActModel();
	private LobbyModel lobbyModel = new LobbyModel();

	public GameState(View view, Controller controller) {
		this.view = view;
		this.controller = controller;
		connectWiimote();

		view.setContentPane(lobbyModel.getLobbyPanel());
		view.addKeyListener(controller.getControllerLobby().getKeyboardLobby());
		wiimote.addWiiMoteEventListeners(controller.getControllerLobby().getWiimoteLobby());
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

	public void switchPanel(JPanel toRemove, JPanel toAdd,
			WiimoteListener wiiListener, KeyListener keyListener) {
		// change Panel
		view.remove(toRemove);
		view.setContentPane(toAdd);

		// change wiimote listener
		WiimoteListener[] wiiListenerList = wiimote.getWiiMoteEventListeners();
		wiimote.removeWiiMoteEventListeners(wiiListenerList[0]);
		wiimote.addWiiMoteEventListeners(wiiListener);

		// change window listener
		KeyListener[] keyListenerList = view.getKeyListeners();
		view.removeKeyListener(keyListenerList[0]);
		view.addKeyListener(keyListener);

		view.pack();
	}

	public void switchToLobby() {
		switchPanel(actModel.getActPanel(), lobbyModel.getLobbyPanel(),controller.getControllerLobby().getWiimoteLobby(), controller.getControllerLobby().getKeyboardLobby());
	}

	public void switchtoGame() {
		switchPanel(lobbyModel.getLobbyPanel(), actModel.getActPanel(),controller.getControllerGame().getWiimoteLobby(), controller.getControllerGame().getKeyboardGame());
	}
}
