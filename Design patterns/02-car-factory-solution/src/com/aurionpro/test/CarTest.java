//package com.aurionpro.test;
//
//import com.aurionpro.model.Carfactory;
//import com.aurionpro.model.CarType;
//import com.aurionpro.model.ICar;
//
//public class CarTest {
//	public static void main(String[] args) {
//		Carfactory obj = new Carfactory();
//		ICar mahindra = obj.getCarInstance(CarType.MAHINDRA);
//	    mahindra.start();
//		mahindra.stop();
//		ICar maruti = obj.getCarInstance(CarType.MARUTI);
//		maruti.start();
//		maruti.stop();
//		ICar tata = obj.getCarInstance(CarType.TATA);
//		tata.start();
//		tata.stop();
//	}
//
//	private ICar getCarInstance(CarType maruti) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}
package com.aurionpro.test;

import com.aurionpro.model.Carfactory;
import com.aurionpro.model.ICar;
import com.aurionpro.model.MarutiFactory;
import com.aurionpro.model.TataFactory;
import com.aurionpro.model.MahindraFactory;
import com.aurionpro.model.ICarFactory;

public class CarTest {
	public static void main(String[] args) {


ICarFactory carFactory1=MarutiFactory.getMarutifactoryInstance();
ICar maruti=carFactory1.makeCar();
maruti.start();
maruti.stop();

ICarFactory carFactory2=MahindraFactory.getMahindrafactoryInstance();
ICar mahindra=carFactory2.makeCar();
mahindra.start();
mahindra.stop();
}
}
