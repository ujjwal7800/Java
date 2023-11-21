package com.aurionpro.test;

import com.aurionpro.model.IGadget;
import com.aurionpro.model.Laptop;
import com.aurionpro.model.LaptopBuilder;

public class LaptopTest {
	public static void main(String[] args) {
		LaptopBuilder builder = new LaptopBuilder();
		builder.addId(101).addBrand("Dell");
		builder.addTouchscreen(true);
		builder.addHdd("Segate 512GB").addRam("128GB").addProcessor("Intel Core 17");
		IGadget laptop = builder.getLaptop();
		System.out.println(laptop);
	}

}
