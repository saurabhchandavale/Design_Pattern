package com.tictactoe;

public class TestImpl {

	public static void main(String[] args) {
		TicTacGame game = new TicTacGame();
        game.initializeGame();
        System.out.println("game winner is: " + game.startGame());

	}

}
