package com.aurionpro.model;

import java.util.Scanner;

public class NumberGuessGame{
	private int turn = 1;

	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}

	public int randomNumberByComputer() {
		int random = (int) (Math.random() * 101);
		return random;
	}

	public void increamentTurn() {
		turn++;
	}

	public int getUserGuessedNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please guess the number between (1-100) : ");
		return sc.nextInt();

	}

}