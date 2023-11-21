package com.aurionpro.model;

public class Car extends Vehical implements IMovable
{

	@Override
	public void move() {
		System.out.println("car is moving");
		
	}

	@Override
	public void showToSpeed() {
		System.out.println("car speed is 200kphr");
		
	}
	

}
