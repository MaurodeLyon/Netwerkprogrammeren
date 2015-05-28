package controller.Game;

import java.awt.event.KeyListener;

import wiiusej.wiiusejevents.utils.WiimoteListener;
import model.Model;

public class ControllerGame {

	private Model model;
	private KeyboardGame keyboardGame;
	private WiiMoteGame wiimoteGame;

	public ControllerGame(Model model) {
		this.model = model;
		keyboardGame = new KeyboardGame(this);
		wiimoteGame = new WiiMoteGame(this);
	}
	
	public WiimoteListener getWiimoteLobby(){
		return wiimoteGame;
	}
	public KeyListener getKeyboardGame() {
		return keyboardGame;
	}

	public void switchPaneltoLobby() {
		model.switchToLobby();
	}
}
