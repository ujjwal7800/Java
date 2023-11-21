package com.aurionpro.test;

public class PassByReferenceArray 
{
	public static void main(String[] args) 
	{
		int[] number = { 10, 20, 30 };
		System.out.println("number=" + number);
		incrementNumberByOne(number);
		System.out.println(number);
		for (int x : number)
		{
			System.out.println(x);
		}

	}

	private static void incrementNumberByOne(int[] number)
	{
		for (int x : number)
		{
			x = x + 1;

		}
		System.out.println(number);
	}
}



