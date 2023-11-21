package com.aurionpro.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.CircleShapeFactory;
import com.aurionpro.model.IShape;

public class FlyWeightTest {
	private static String colors[] = { "Red", "Green", "Green", "Red", "Yellow" };

	public static void main(String[] args) {
		CircleShapeFactory factory = new CircleShapeFactory();
		for (String color : colors) {
			IShape circle = factory.getCircle(color);
			circle.draw();
		}
	}

}
