package com.aurionpro.model;

public class StringUtil {
	public static String trancateInFirst2Position(String str) {
		if (str == null || str.length() < 4) {
			return str;
		} else {
			return str.substring(2, 4);
		}
	}

	public static boolean areFirstAndLastTwoCharactersSame(String input) {
		if (input == null || input.length() < 2) {
			return false;
		}
		String firstTwoChars = input.substring(0, 2);
		String lastTwoChars = input.substring(input.length() - 2);
		return firstTwoChars.equals(lastTwoChars);
		
	}
}
