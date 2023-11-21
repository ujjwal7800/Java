package com.aurionpro.model;

public class MathUtil {
	public double addNumbers(double num1, double num2) {
		return num1 + num2;

	}

	public int factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}

	public int divideNumbers(int num1, int num2) {
		return num2 / num1;
	}

	public int[] addNumbersToArray(int[] numArray) {
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] += 10;
		}
		return numArray;
	}

//	public int[] addNumbersToArray(int[] numArray) {
//		for (int i = 0; i < numArray.length; i++) {
//			numArray[i] += 10;
//		}
//		return numArray;
//	}
	public int[] incrementArrayValuesByTen(int[] numArray) {
		  for (int i = 0; i < numArray.length; i++) {
		   numArray[i] += 10;
		  }
		  return numArray;
		 }


}
