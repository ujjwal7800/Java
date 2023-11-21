package com.aurionpro.model;

import java.util.Scanner;

public class NumberMethods {
	NumberGuessGame guess = new NumberGuessGame();

	public void start() {
		System.out.print("Press 1 to start game 0 to end Game :");
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		while (start == 1) {
			startGame();
			if (start == 0)
				break;
			System.out.print("Press 1 to start game 0 to end Game :");
			start = sc.nextInt();
		}
	}

	public void startGame() {
		int computerNumber = guess.randomNumberByComputer();
		while (true) {
			System.out.println("Turn :" + guess.getTurn());
			System.out.println("-------------------------");
			int userNumber = guess.getUserGuessedNumber();
			numberCamparison(userNumber, computerNumber);
			if (userNumber == computerNumber)
				break;
			youLooseGame(userNumber, computerNumber);
			guess.increamentTurn();
		}
	}

	private void youLooseGame(int userNumber, int computerNumber) {
		if ((userNumber != computerNumber) && (guess.getTurn() == 6))
			System.out.println("You loose game!!");

	}

	private void numberCamparison(int userNumber, int computerNumber) {
		if (userNumber > computerNumber)
			System.out.println("Sorry, the number you guessed is too High\n");
		else if (userNumber < computerNumber)
			System.out.println("Sorry, the number you guessed is too Low\n");
		ifCorrectNumberGuessed(userNumber, computerNumber);
	}

	private void ifCorrectNumberGuessed(int userNumber, int computerNumber) {
		boolean isUserGuessCorrect = false;
		if (userNumber == computerNumber) {
			System.out.println("Congratulations! Your guess is correct!");
			System.out.println("You won in : " + guess.getTurn() + " Turns");
			isUserGuessCorrect = true;
		}

	}

}