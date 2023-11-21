package com.aurionpro.model;

public class Rectangle 
{
	private double height;
	private double width;
	private String color;

	public void setHeight(double height) 
	{
		this.height =height;
		if (height < 1) 
		{
			this.height = 1;
		} 
		else if (height > 100)
		{
			this.height = 100;
		}
	}

	public void setWidth(double width)
	{
		this.width= width;
		if(width<1)
    	{
    		this.width=1;
    	}
    	else if(width>100)
    	{
    		this.width=100;
	    }
	}
	public void setColor(String color)
	{
		if (color.equalsIgnoreCase("red"))
		{
			this.color ="red";
		}
		if(color.equalsIgnoreCase("blue"))
		{
			this.color="blue";
		}
		if(color.equalsIgnoreCase("green"))
		{
			this.color="green";
		}
		else
		{
			this.color="red";
		}
	}

	public double getHeight()
	{
		return height;
	}

	public double getWidth()
	{
		return width;
	}
	public String getcolor()
	{
		return color;
	}

	public double calculateArea()

	{
		// int height=30;
		// if this.height likha to hi vo instant vaiable lega
		return height * width;
	}
	

}
