package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest 
{

	public static void main(String[]args)
	{
		Rectangle rectangle=new Rectangle();
		
		// error isliye aa raha h qki vo public se hata diay isliye dusre package me access nhi kar pa raha h 
		//if same package me raha aur udhar private kiya to bhi error aayega hi
		
		rectangle.setHeight(-100);
		rectangle.setWidth(200);
		rectangle.setColor("blue");
		double area=rectangle.calculateArea();
		System.out.println("Area of Recrangle with height "+rectangle.getHeight()+"and width "+rectangle.getWidth()+"is" +area);
		System.out.println("The color of rectangle is:" +rectangle.getcolor());
	}
}