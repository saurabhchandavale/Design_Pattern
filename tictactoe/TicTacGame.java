package com.tictactoe;

import java.util.Deque;
import java.util.Scanner;
import java.util.LinkedList;

public class TicTacGame {
	Deque<Player> players;
	Board gameBoard;

	public void initializeGame() {
		// creating 2 players
		players = new LinkedList<>();
		PlayingPieceX crossPiece = new PlayingPieceX();
		Player player1 = new Player("Player1", crossPiece);

		PlayingPieceO noughtsPiece = new PlayingPieceO();
		Player player2 = new Player("Player2", noughtsPiece);

		players.add(player1);
		players.add(player2);

		gameBoard = new Board(3);

	}

	public String startGame() {
		boolean noWinner = true;
		while (noWinner) {
			// take out the player whose turn is and also put the player in the list back
			Player playerTurn = players.removeFirst();

			// get the free space from the board

			gameBoard.printBoard();

			// read the user input
			System.out.println("Player " + playerTurn.getName() + " enter row , column : ");
			Scanner scn = new Scanner(System.in);
			String s = scn.nextLine();
			String[] values = s.split(",");
			int inputRow = Integer.valueOf(values[0]);
			int inputColumn = Integer.valueOf(values[1]);

			// place the piece
			boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow, inputColumn, playerTurn.getPlayingPiece());
			if (!pieceAddedSuccessfully) {
				// player can not insert the piece into this cell, player has to choose another
				// cell
				System.out.println("Incorredt possition chosen, try again");
				players.addFirst(playerTurn);
				continue;
			}
			players.addLast(playerTurn);

			boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.getPlayingPiece().pieceType);
			if (winner) {
				return playerTurn.getName();
			}
			
			 if (isBoardFull()) {
		            gameBoard.printBoard();
		            return "It's a tie!";
		        }
		}
		return "tie";
	}

	public boolean isThereWinner(int row, int column, PieceType pieceType) {
		boolean rowMatch = true;
		boolean columnMatch = true;
		boolean diagonalMatch = true;
		boolean antiDiagonalMatch = true;

		// need to check in row
		for (int i = 0; i < gameBoard.size; i++) {

			if (gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType) {
				rowMatch = false;
			}
		}

		// need to check in column
		for (int i = 0; i < gameBoard.size; i++) {

			if (gameBoard.board[i][column] == null || gameBoard.board[i][column].pieceType != pieceType) {
				columnMatch = false;
			}
		}

		// need to check diagonals
		for (int i = 0, j = 0; i < gameBoard.size; i++, j++) {
			if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
				diagonalMatch = false;
			}
		}

		// need to check anti-diagonals
		for (int i = 0, j = gameBoard.size - 1; i < gameBoard.size; i++, j--) {
			if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
				antiDiagonalMatch = false;
			}
		}

		return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;

	}
	
	public boolean isBoardFull() {
	    for (int i = 0; i < gameBoard.size; i++) {
	        for (int j = 0; j < gameBoard.size; j++) {
	            if (gameBoard.board[i][j] == null) {
	                return false; // If there's an empty cell, board is not full
	            }
	        }
	    }
	    return true; // No empty cells, board is full
	}

}
