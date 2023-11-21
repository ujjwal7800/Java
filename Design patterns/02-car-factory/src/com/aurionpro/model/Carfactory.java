package com.aurionpro.model;

public class Carfactory {
	public ICar getCarInstance(CarType car) {
		if (car.equals(CarType.MARUTI)) {
			return new Maruti();

		}
		if (car.equals(CarType.TATA)) {
			return new Tata();
		}
		if (car.equals(CarType.MAHINDRA)) {
			return new Mahindra();

		}
		return null;

	}

}
