package com.aurionpro.test;

import java.util.Scanner;
import com.aurionpro.model.Color;
import com.aurionpro.model.Rectangle;

public class RectangleTest
{
	public static void main(String[] args) 
	{
		Rectangle[] rectangles = new Rectangle[3];
		for (int i = 0; i < rectangles.length; i++) 
		{
			rectangles[i] = new Rectangle();
			setRectangleValuesFromUser(rectangles[i]);
		}
		for (int i = 0; i < rectangles.length; i++)
		{
			printRectangleDetails(rectangles[i]);
		}
	}

	public static void setRectangleValuesFromUser(Rectangle rectangle) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of height:");
		rectangle.setHeight(sc.nextDouble());

		System.out.println("Enter the value of width:");
		rectangle.setWidth(sc.nextDouble());
		System.out.println("Enter the colour Red,blue,green:");
		try 
		{
			rectangle.setColor(Color.valueOf(sc.next().toUpperCase()));
		} 
		catch (IllegalArgumentException e)
		{
			rectangle.setColor(Color.RED);
		}

	}

	public static void printRectangleDetails(Rectangle rectangle) {
		System.out.println("height is " + rectangle.getHeight() + " Width is " + rectangle.getWidth() + " Area is "
				+ rectangle.getHeight() * rectangle.getWidth());
		System.out.println(rectangle.getcolor());
	}
}