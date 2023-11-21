package com.aurionpro.test;

import com.aurionpro.model.CarInspection;
import com.aurionpro.model.ICarService;
import com.aurionpro.model.OilChange;
import com.aurionpro.model.WheelAlign;

public class CarTest {
	public static void main(String args[]) {
		ICarService car = new CarInspection();
		OilChange oil = new OilChange(car);
		WheelAlign align = new WheelAlign(oil);  
		System.out.println(align.getCost());
	}

}
