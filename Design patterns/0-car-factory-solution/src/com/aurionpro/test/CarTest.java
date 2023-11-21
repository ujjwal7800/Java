package com.aurionpro.test;

import com.aurionpro.model.Carfactory;
import com.aurionpro.model.CarType;
import com.aurionpro.model.ICar;

public class CarTest {
	public static void main(String[] args) {
		Carfactory obj = new Carfactory();
		ICar mahindra = obj.getCarInstance(CarType.MAHINDRA);
	    mahindra.start();
		mahindra.stop();
		ICar maruti = obj.getCarInstance(CarType.MARUTI);
		maruti.start();
		maruti.stop();
		ICar tata = obj.getCarInstance(CarType.TATA);
		tata.start();
		tata.stop();
	}

	private ICar getCarInstance(CarType maruti) {
		// TODO Auto-generated method stub
		return null;
	}

}


