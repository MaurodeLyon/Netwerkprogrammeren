package model;

import controller.Controller;
import view.View;

public class Model {

	private Controller controller;
	private GameState gameState;

	public Model(View view) {
		controller = new Controller(this);
		gameState = new GameState(view, controller);
	}

	public GameState getGameState() {
		return gameState;
	}
}
