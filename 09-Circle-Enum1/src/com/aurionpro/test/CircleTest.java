package com.aurionpro.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.Color;
import com.aurionpro.model.Border;

public class CircleTest 
{

	public static void main(String[]args)
	{
		Circle circle=new Circle();
		
		// error isliye aa raha h qki vo public se hata diay isliye dusre package me access nhi kar pa raha h 
		//if same package me raha aur udhar private kiya to bhi error aayega hi
		
		circle.setRadius(5);
		circle.setBorder(Border.SOLID);
		circle.setColor(Color.BLUE);
		System.out.println("Area of Circle="+circle.calculateArea());
		
	}
}