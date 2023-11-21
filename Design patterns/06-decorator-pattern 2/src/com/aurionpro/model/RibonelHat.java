package com.aurionpro.model;

public class  RibonelHat extends HatDecorator {

	public RibonelHat(IHat hat) {
		super(hat);
	}
	@Override
	public String getName() {
		return super.getName()+" : Ribonel Hat  ";
	}

	@Override
	public double getPrice() {
		return 1000+ super.getPrice();
	}

	@Override
	public String getDescription() {
		return super.getDescription()+" : High Class Hat";
	}

}
