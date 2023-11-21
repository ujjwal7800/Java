package com.aurionpro.test;

public class ExceptionTest {
	public static void main(String[] args) 
	{
		try
		{
			int firstNumber=Integer.parseInt(args[0]);
			System.out.println("Statement 1");
			int secondNumber=Integer.parseInt(args[1]);
			System.out.println("Statement 2");
		
			int div=firstNumber/secondNumber;
			System.out.println("Division="+div);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Number can not be divided by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Access to invalid index position");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid conversion to type Integer");
		}
		finally
		{
			System.out.println("Inside Finally block");
		}
		System.out.println("Outside code ,end of code");
		
	}

}
