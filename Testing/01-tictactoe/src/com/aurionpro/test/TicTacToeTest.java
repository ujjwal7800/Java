package com.aurionpro.test;

import java.util.Scanner;
import com.aurionpro.model.Board;
import com.aurionpro.model.CellAlreadyMarkedException;
import com.aurionpro.model.MarkType;
import com.aurionpro.model.ResultAnalyzer;
import com.aurionpro.model.ResultType;

public class TicTacToeTest {
	public static void main(String[] args) {
		Board board = new Board();
		ResultAnalyzer analyzer = new ResultAnalyzer(board);

		Scanner sc = new Scanner(System.in);
		int moveCount = 0;

		while (analyzer.analyzeResult() == ResultType.PROGRESS) {
			System.out.println("Current Board:");
			board.displayBoard();

			int move;
			MarkType currentPlayerMark;

			if (moveCount % 2 == 0) {
				currentPlayerMark = MarkType.X;
			} else {
				currentPlayerMark = MarkType.O;
			}

			System.out.print("Enter cell number (0-8) for player " + currentPlayerMark + ": ");
			move = sc.nextInt();

			try {
				board.setCellMark(move, currentPlayerMark);
				moveCount++;
			} catch (CellAlreadyMarkedException e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println("Final Board:");
		board.displayBoard();

		analyzer.analyzeResult();
		if (analyzer.getResult() == ResultType.WIN) {
			System.out.println("X won!");
		} else if (analyzer.getResult() == ResultType.LOSE) {
			System.out.println("O won!");
		} else if (analyzer.getResult() == ResultType.DRAW) {
			System.out.println("Draw");
		} else {
			System.out.println("Game in progress...");
		}
	}
}
