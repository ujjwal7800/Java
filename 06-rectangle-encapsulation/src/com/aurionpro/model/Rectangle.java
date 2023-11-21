package com.aurionpro.model;

public class Rectangle {
	double height;
	double width;

	public void setHeight(double height) {
		if (height < 1) {
			this.height = 1;
		} else if (height > 100) {
			this.height = 100;
		}
		this.height = +height;
	}

	public void setWidth(double width)
	{
		if(width<1)
    	{
    		this.width=1;
    	}
    	else if(width>100)
    	{
    		this.width=100;
	    }
		this.width= +width;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	{

	}

	public double calculateArea()

	{
		// int height=30;
		// if this.height likha to hi vo instant vaiable lega
		return height * width;
	}

}
