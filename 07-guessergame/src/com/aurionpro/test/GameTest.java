package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) {
		
	
		Scanner userin = new Scanner(System.in);
		String word;
		

		List<String> wordList = new ArrayList<String>();
		wordList.add("hello");
		wordList.add("world");
		wordList.add("java");
		wordList.add("python");
		wordList.add("javascript");

		String randomWord = randomWordGenrator(wordList);

		
		guessWord(randomWord);
	}

	private static void guessWord(String randomWord) {

		insertWordInBlanks(randomWord);
	}

	private static void insertWordInBlanks(String randomWord) {
		// TODO Auto-generated method stub
		int lives = 15;
		List<String> tempArray = new ArrayList<String>();
		for (int i = 0; i < randomWord.length(); i++) {
			tempArray.add("_");
		}
		System.out.println(tempArray);
		while(!isTempArrayFull(tempArray) && lives>0){
			System.out.print("Enter a letter to guess:");
			Scanner userin = new Scanner(System.in);
			String input =userin.next().toLowerCase();
			boolean guessedCorrectly = false;
			for (int i = 0; i < randomWord.length(); i++) {
				if(input.charAt(0) == randomWord.charAt(i)) {
					tempArray.set(i, input);
					guessedCorrectly = true;
				}
			}
			if(!guessedCorrectly) {
				lives--;
			}
			System.out.println(tempArray);
			System.out.println("Ramaining lives "+lives);
		}
		if(!isTempArrayFull(tempArray)) {
			System.out.println("You failed to guess the word");
			System.out.println(randomWord);
		}
		else {
			System.out.println("You guessed it correctly");
		}

	}

	private static boolean isTempArrayFull(List<String> tempArray) {
	
		for (int i = 0; i < tempArray.size(); i++) {
			if (tempArray.get(i)=="_") {
				return false;
			}
		}
		return true;
	}

	private static String randomWordGenrator(List<String> wordList) {
		int randomIndex = getRandomNumber();
		String randomWord = wordList.get(randomIndex);
		return randomWord;
	}
	public static int getRandomNumber() {
		return (int) ((Math.random() * (5 - 0)) + 0);
	}

}
