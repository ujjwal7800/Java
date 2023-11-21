package com.auriponpro.test;

public class CheckedExceptionTest
{
	public static void main(String[] args) 
	{
		System.out.println("main start");
		function1();
		System.out.println("main end");
		
	}

	private static void function1()
	{
		System.out.println("function1 start");
		try {
			function2();
		} catch (Exception e) {
		//	e.printStackTrace();
			System.out.println("Handled.. in function 1");
		}
		System.out.println("function1 end");
		
	}

	private static void function2() throws Exception 
	{
		System.out.println("function2 start");
		function3();
		System.out.println("function2 end");
		
		
	}

	private static void function3() throws Exception 
	{
		System.out.println("function3 start");
		throw new Exception();
		
		
	}

}
