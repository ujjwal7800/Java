package com.aurionpro.test;

import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Color;
import java.util.Scanner;

import com.aurionpro.model.Color;

public class RectangleTest 
{
    Rectangle rectangle=new Rectangle();
	public static void main(String[]args)
	{
		Rectangle rectangle1 = new Rectangle();
		setRectangle(rectangle1);
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter the value of heights");
		//rectangle.setHeight(sc.nextDouble());
		//System.out.println("enter the value of width");
		//rectangle.setWidth(sc.nextDouble());
		//System.out.println("enter the value of color red/blue/green");
		Rectangle rectangle2=new Rectangle();
		setRectangle(rectangle2);
	}
	private static void setRectangle(Rectangle rectangle)
	{
		System.out.println("Enter height, width, color: ");
		Scanner userin = new Scanner(System.in);
		rectangle.setHeight(userin.nextInt());
		rectangle.setWidth(userin.nextInt());
		try
		{
			rectangle.setColor(Color.valueOf(userin.next().toUpperCase()));
		}
		catch(IllegalArgumentException e) 
		{
			rectangle.setColor(Color.RED);
		}
		rectangle.calculateArea();
		System.out.println("The area of rectangle with height: " + rectangle.getHeight() + " and "
				+ rectangle.getWidth() + " is " + rectangle.calculateArea());
		System.out.println("The color of rectangle is:" + rectangle.getcolor());
	//	private static void setRectangle(Rectangle rectangle2) 
	//	{
		
	//}
		//{
			//rectangle.setColor(Color.valueOf(sc.next().toUpperCase()));
		//}
		//catch(IllegalArgumentException e)
		//{
			//rectangle.setColor(Color.RED);
		//}
		
		// error isliye aa raha h qki vo public se hata diay isliye dusre package me access nhi kar pa raha h 
		//if same package me raha aur udhar private kiya to bhi error aayega hi
		
//		rectangle.setHeight(-100);
//		rectangle.setWidth(200);
//		rectangle.setColor(Color.BLUE);
		//double area=rectangle.calculateArea();
		//System.out.println("Area of Recrangle with height "+rectangle.getHeight()+"and width "+rectangle.getWidth()+"is" +area);
		//System.out.println("The color of rectangle is:" +rectangle.getcolor());
	}
}