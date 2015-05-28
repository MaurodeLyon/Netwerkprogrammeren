package controller.Lobby;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardLobby implements KeyListener {

	private ControllerLobby controllerLobby;

	public KeyboardLobby(ControllerLobby controllerLobby) {
		this.controllerLobby = controllerLobby;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_S) {
			System.out.println("S");
			controllerLobby.switchPaneltoGame();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
