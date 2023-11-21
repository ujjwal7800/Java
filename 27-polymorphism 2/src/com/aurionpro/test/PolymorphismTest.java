package com.aurionpro.test;

import com.aurionpro.model.Bike;
import com.aurionpro.model.Bus;
import com.aurionpro.model.Car;
import com.aurionpro.model.IMovable;
import com.aurionpro.model.Vehical;

public class PolymorphismTest {
	public static void main(String[] args) {
		IMovable[] movable = { new Car(), new Bike(), new Bus()

		};
		for(IMovable x:movable)
		{
			startMoving(x);
			
		}

	}

	private static void startMoving(IMovable movable) 
	{
		movable.move();
		
	}

}
