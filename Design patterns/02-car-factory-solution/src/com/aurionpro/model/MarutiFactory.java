package com.aurionpro.model;

public class MarutiFactory implements ICarFactory 
{
private static ICarFactory marutiFactory;
	
	private MarutiFactory() {
		
	}
	public static ICarFactory getMarutifactoryInstance() {
		if(marutiFactory==null) {
			return new MarutiFactory();
		}
		return  marutiFactory;
		
	}

	@Override
	public ICar makeCar() {
		return new Maruti();
	}


}
