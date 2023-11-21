package com.aurionpro.model;

public class GoldenHat  extends HatDecorator{

	public GoldenHat(IHat hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getName() {
		return super.getName()+" : Golden Hat" ;
	}

	@Override
	public double getPrice() {
		return 500+ super.getPrice();
	}

	@Override
	public String getDescription() {
		return super.getDescription()+" : Golden Shadess ";
	}
}
