package com.aurionpro.test;

import com.aurionpro.model.*;

public class HatDecoratorTest {

	public static void main(String[] args) {
		StandardHat st = new StandardHat();
		GoldenHat gd = new GoldenHat(st);
		RibonelHat rt = new RibonelHat(gd);
		System.out.println(rt.getName());
		System.out.println(rt.getPrice());
		System.out.println(rt.getDescription());
//		System.out.println("-------------------------------");
//		PremiumHat pt = new PremiumHat();
//		RibonelHat rt1 = new RibonelHat(pt);
//		System.out.println(rt1.getName());
//		System.out.println(rt1.getPrice());
//		System.out.println(rt1.getDescription());

	}

}