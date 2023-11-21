package com.aurionpro.test;

import com.aurionpro.model.Distance;

public class DistanceTest {
	public static void main(String[] args) {
		Distance distance1 = new Distance(3, 10);
		Distance distance2 = new Distance(7, 8);
	//	Distance distance3=new distance1.

		Distance sumDistance = addDistanceObjects(distance1, distance2);
		System.out.println(sumDistance);
	}

	private static Distance addDistanceObjects(Distance distance1, Distance distance2) {
		Distance tempDistance = new Distance();

		tempDistance.setInch(distance1.getInch() + distance2.getInch());
		tempDistance.setFeet(distance1.getFeet() + distance2.getFeet());
		correctDistance(tempDistance);
		return tempDistance;

	}

	private static void correctDistance(Distance tempDistance) 
	{
		correctInch1(tempDistance);
		
	}

	private static void correctInch1(Distance tempDistance) 
	{
		while(tempDistance.getInch()>12) {
			tempDistance.setInch(tempDistance.getInch()-12);
			tempDistance.setInch(tempDistance.getFeet()+1);
		}
	}

		

	private static void correctInch(Distance tempDistance) {
		
	}

}
