package com.aurionpro.model;

public class Distance
{
	private int feet;
	private int inch;
	
	public Distance(int feet, int inch) 
	{
		super();
		this.feet = feet;
		this.inch = inch;
	}

	public Distance() {
		
	}

	public int getFeet() {
		return feet;
	}

	public void setFeet(int feet) {
		this.feet = feet;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	@Override
	public String toString() {
		return "Distance [feet=" + feet + ", inch=" + inch + "]";
	}
	
	

}
