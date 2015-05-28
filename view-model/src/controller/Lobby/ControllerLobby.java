package controller.Lobby;

import java.awt.event.KeyListener;

import model.Model;
import wiiusej.wiiusejevents.utils.WiimoteListener;

public class ControllerLobby {

	private Model model;
	private KeyboardLobby keyboardLobby;
	private WiiMoteLobby wiimoteLobby;

	public ControllerLobby(Model model) {
		this.model = model;
		keyboardLobby = new KeyboardLobby(this);
		wiimoteLobby = new WiiMoteLobby(this);

	}
	
	public WiimoteListener getWiimoteLobby(){
		return wiimoteLobby;
	}

	public KeyListener getKeyboardLobby() {
		return keyboardLobby;
	}

	public void switchPaneltoGame() {
		model.getGameState().switchtoGame();
	}
}
