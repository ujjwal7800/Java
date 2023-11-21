package com.aurionpro.test;

import java.util.Arrays;
import java.util.Scanner;

public class Statistics {

	public static void main(String args[]) {
		int[] newArray = new int[args.length];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = Integer.parseInt(args[i]);
		}
		median(newArray);
		average(args);
		sum(args);
		minMax(args);
		System.out.println("Frequency");
		int size = newArray.length;
		countFrequency(newArray, size);
	}

	static void average(String args[]) {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum = sum + Integer.parseInt(args[i]);
		}
		double average = sum / args.length;
		System.out.println("Average :" + average);

	}

	static void median(int[] newArray) {
		Arrays.sort(newArray);
		if (newArray.length % 2 != 0) {
			System.out.println("Median :" + newArray[newArray.length / 2]);
		} else {
			System.out.println("Median : " + (newArray[newArray.length / 2] + newArray[newArray.length / 2 - 1]) / 2.0);
		}

	}

	static void sum(String args[]) {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum = sum + Integer.parseInt(args[i]);
		}
		System.out.println("Sum :" + sum);

	}

	static void minMax(String args[]) {
		int maxvalue = Integer.parseInt(args[0]);
		int minvalue = Integer.parseInt(args[0]);
		for (int i = 0; i < args.length; i++) {
			if (minvalue > Integer.parseInt(args[i])) {
				minvalue = Integer.parseInt(args[i]);
			}
			if (maxvalue < Integer.parseInt(args[i])) {
				maxvalue = Integer.parseInt(args[i]);
			}
		}

		System.out.println("Min :" + minvalue);
		System.out.println("Max :" + maxvalue);
	}

	static void countFrequency(int[] newArray, int n) {

		Arrays.sort(newArray);
		for (int i = 0; i < n; i++) {
			int count = 1;

			while (i < n - 1 && newArray[i] == newArray[i + 1]) {
				i++;
				count++;
			}
			System.out.println(newArray[i] + ": " + count);

			count++;

		}

	}
}
