package com.aurionpro.model;

public class WelcomeAdding implements IAddable
{

	@Override
	public int printGreating(int a, int b) 
	{
		System.out.println("Addition of two numbers");
		
		return a+b;
		
	}
	

}
