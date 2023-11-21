package com.aurionpro.model;

public class TataFactory implements ICarFactory 
{
private static ICarFactory tataFactory;
	
	private TataFactory() {
		
	}
	public static ICarFactory getTatafactoryInstance() {
		if(tataFactory == null) {
			return new TataFactory();
		}
		return  tataFactory;
		
	}

	@Override
	public ICar makeCar() {
		return new Tata();
	}


		
	}


