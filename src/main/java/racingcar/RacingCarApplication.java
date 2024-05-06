package racingcar;

import racingcar.controller.GameManager;

public class RacingCarApplication {
	public static GameManager gameManager;
	public static void main(String[] args) {
		gameManager = new GameManager();
		gameManager.startGame();
	}
}