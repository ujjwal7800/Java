package com.aurionpro.model;

public class MahindraFactory implements ICarFactory {

	private static ICarFactory mahindraFactory;
	
	private MahindraFactory() {
		
	}
	public static ICarFactory getMahindrafactoryInstance() {
		if(mahindraFactory==null) {
			return new MahindraFactory();
		}
		return  mahindraFactory;
		
	}

	@Override
	public ICar makeCar() {
		return new Mahindra();
	}

	

	

}
