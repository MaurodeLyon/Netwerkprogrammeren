package controller.Game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardGame implements KeyListener {

	private ControllerGame controllerGame;

	public KeyboardGame(ControllerGame controllerGame) {
		this.controllerGame = controllerGame;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			System.out.println("SPACE");
			controllerGame.switchPaneltoLobby();
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
