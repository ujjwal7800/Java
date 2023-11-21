package com.aurionpro.model;

public class OilChange extends CarServiceDecorator implements ICarService {
	public OilChange(ICarService carObj) {
		super(carObj);
	}

	@Override
	public double getCost() { // TODO Auto-generated method stub
		return 500 + super.getCost();
	}
}
