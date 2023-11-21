package com.aurionpro.test;

import java.util.Scanner;
public class WaterBill
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of units : ");
		int units=sc.nextInt();
		int METER_CHARGE=75;
		int charge=0;
		if(units<0)
		{
			System.out.println("INVALID INPUT");
		}
		else
		{
			if(units<=100)
			{
				charge=units*5;
			}
			else
			{
				if(units<=250)
				{
					charge=units*10;
				}
				else
				{
					charge=units*20;
				}
			}
			
			int total_water_bill=charge+METER_CHARGE;
		    System.out.println("Total water bill = "+total_water_bill);
		}
	}
}
