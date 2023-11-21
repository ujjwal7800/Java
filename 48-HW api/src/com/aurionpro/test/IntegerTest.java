package com.aurionpro.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IntegerTest {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 25, 35, 45);

		int minNumber = Collections.min(numbers);
		int maxNumber = Collections.max(numbers);

		System.out.println("Numbers: " + numbers);
		System.out.println("Minimum number: " + minNumber);
		System.out.println("Maximum number: " + maxNumber);
	}

}
