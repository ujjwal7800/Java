package com.aurionpro.test;


import java.util.Scanner;
import java.lang.Math;

class BookCricket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter 1 To Start The Game And 0 For Exit : ");
		int start = sc.nextInt();
		while (start == 1) {
			game();

			System.out.print("Enter 1 To Start The Game And 0 For Exit : ");
			start = sc.nextInt();
		}

	}

	static int game() {
		String playerOne;
		String playerTwo;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Player 1 Name : ");
		playerOne = sc.next();
		System.out.print("Enter Player 2 Name : ");
		playerTwo = sc.next();
		int pointOne = 0;
		int prompt;
		int roundOne = 0;
		System.out.println("Player : " + playerOne + "\n");
		System.out.print("Enter 1 to Open Book : ");
		prompt = sc.nextInt();
		while (prompt == 1 && roundOne <12) {
			roundOne++;
			int pn = getRandomto300();
			int cp = pn % 7;
			System.out.println("Page Number " + pn + " \tPoint : " + cp + "\tScore : " + (pointOne + cp) + " ");
			if (cp == 0) {
				break;
			} else {
				pointOne += cp;
			}
			System.out.print("Enter 1 to Open Book : ");
			prompt = sc.nextInt();
		}
		System.out.println(playerOne + " Total Score : " + pointOne + "\n");
		System.out.println(playerOne + " Takes " + roundOne + " Rounds");

		int PointTwo = 0;
		int roundTwo = 0;

		System.out.println(playerTwo + " Needs " + (pointOne + 1) + " in 12 Rounds To WIN MATCH");
		System.out.println("Player : " + playerTwo + "\n");
		System.out.print("Enter 1 to Open Book : ");
		prompt = sc.nextInt();
		int roundThree = 12;
		while (prompt == 1 && roundThree > 0) {
			roundTwo++;
			int pn = getRandomto300();
			int cp = pn % 7;

			roundThree--;
			System.out.println("Page Number " + pn + " \tPoint : " + cp + "\tScore : " + (PointTwo + cp)+ "\tRound Left :" + roundThree + " ");
			if (cp == 0) {
				break;
			} else {
				PointTwo += cp;
			}

			if (PointTwo > pointOne) {
				System.out.println(playerTwo + " Win Match !!\n");
				return 2;
			}
			System.out.print("Enter 1 to Open Book : ");
			prompt = sc.nextInt();
		}
		if (pointOne == PointTwo) {
			System.out.println("Match Draw");
			return 0;
		}

		System.out.println(playerOne + " Win Match !!\n");
		return 1;

	}

	static int getRandomto300() {
		int random = (int) (Math.random() * 299) + 1;
		return random;
	}
}


