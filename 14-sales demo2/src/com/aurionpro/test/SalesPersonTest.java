package com.aurionpro.test;
import com.aurionpro.module.CityType;

import com.aurionpro.module.SalesPerson;


public class SalesPersonTest 
{
	public static void main(String[]args)
	{
		SalesPerson[] persons=
			{
					new SalesPerson(1,"Ujjwal",4,4000,CityType.MUMBAI),
					new SalesPerson(2,"Aniket",2,6000,CityType.DELHI),
					new SalesPerson(3,"Rahul",14,1000,CityType.MUMBAI),
					new SalesPerson(4,"Shraddha",3,2000,CityType.PUNE),
					new SalesPerson(5,"Siddhi",7,8000,CityType.MUMBAI),
					new SalesPerson(6,"Anchal",15,9000,CityType.DELHI),
			};
				
		SalesPerson person = findSalesPersonWithHighestSales(persons);
		System.out.println(persons);

		double totalSales = findSalesAmountOfAll(persons);
		System.out.println("Total sales of all sales person " + totalSales);

		System.out.println("+++++++++++++++++++++++++++++++++");
		CityType[] cities = CityType.class.getEnumConstants();

		for (CityType c : cities) {
			double cityTotalSales = findSalesByCity(c, persons);
			System.out.println("Total Sale in city " + c + " is " + cityTotalSales);
		}

		for (CityType c : cities) {
			SalesPerson salesperson = findSalesPersonWithHighestSalesByCity(c, persons);
			System.out.println("Peron with highest sale in city " + c + " is " + salesperson);
		}

	}

	private static SalesPerson findSalesPersonWithHighestSalesByCity(CityType c, SalesPerson[] persons) {
		SalesPerson maxSalesPerson = null;

		for (int i = 0; i < persons.length; i++) {
			if (maxSalesPerson == null && persons[i].getCitytype().equals(c)) {
				maxSalesPerson = persons[i];
			}

			if (maxSalesPerson != null && persons[i].getCitytype().equals(c)) {
				if (maxSalesPerson.getSalesAmont() < persons[i].getSalesAmont()) {
					maxSalesPerson = persons[i];
				}
			}
		}
		return maxSalesPerson;
	}

	private static double findSalesByCity(CityType c, SalesPerson[] persons) {
		double salesSum = 0;

		for (SalesPerson s : persons) {
			if (s.getCitytype().equals(c)) {
				salesSum += s.getSalesAmont();
			}
		}

		return salesSum;
	}

	private static double findSalesAmountOfAll(SalesPerson[] persons) {
		double salesSum = 0;

		for (SalesPerson s : persons) {
			salesSum += s.getSalesAmont();
		}

		return salesSum;
	}

	private static SalesPerson findSalesPersonWithHighestSales(SalesPerson[] persons) {
		SalesPerson maxSalesPerson = persons[0];

		for (SalesPerson p : persons) {
			if (maxSalesPerson.getSalesAmont() < p.getSalesAmont()) {
				maxSalesPerson = p;
			}
		}
		return maxSalesPerson;
	}

}

