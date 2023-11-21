package com.aurionpro.model;

public class Circle 
{
	private double radius;
	private Color color;
	private Border border;

	public void setRadius(double Radius) 
	{
		this.radius =radius;
		if (radius < 1) 
		{
			this.radius = 1;
		} 
		else if (radius > 100)
		{
			this.radius = 100;
		}
	}

	
//	public void setColor(Color color)
//	{
//		if (color.equalsIgnoreCase("red"))
//		{
//			this.color ="red";
//		}
//		if(color.equalsIgnoreCase("blue"))
//		{
//			this.color="blue";
//		}
//		if(color.equalsIgnoreCase("green"))
//		{
//			this.color="green";
//		}
//		else
//		{
//			this.color="red";
//		}
//	}
	public void setColor(Color color)
	{
		this.color=color;
	}
	public void setBorder(Border border)
	{
		this.border=border;
	}

	public double getRadius()
	{
		return radius;
	}

	public Color getcolor()
	{
		return color;
	}
	public Border getborder()
	{
		return border;
	}

	public double calculateArea()

	{
		// int height=30;
		// if this.height likha to hi vo instant vaiable lega
		return this.radius*this.radius*Math.PI;
	}
	

}
