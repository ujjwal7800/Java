package com.aurionpro.model;

public class Biscuit implements IItems
{
	private String name;
	private double mrp;
	@Override
	public String getIteamName() {
		return name;
		
	}
	
	public Biscuit(String name, double mrp) {
		super();
		this.name = name;
		this.mrp = mrp;
	}

	@Override
	public double getIteamPrice() {
		
		return mrp;
	}
	
	

}
