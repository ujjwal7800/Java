package com.aurionpro.test;
import com.aurionpro.module.CityType;
import com.aurionpro.module.SalesPerson;


public class SalesPersonTest 
{
	public static void main(String[]args)
	{
		SalesPerson[] salesperson=
			{
					new SalesPerson(1,"Ujjwal",4,4000,CityType.MUMBAI),
					new SalesPerson(2,"Aniket",2,6000,CityType.DELHI),
					new SalesPerson(3,"Rahul",14,1000,CityType.MUMBAI),
					new SalesPerson(4,"Shraddha",3,2000,CityType.PUNE),
					new SalesPerson(5,"Siddhi",7,8000,CityType.MUMBAI),
					new SalesPerson(6,"Anchal",15,9000,CityType.DELHI),
			};
				
					
//				for(SalesPerson sale: sale)
//				{
//					System.out.println();
//				}
		SalesPerson highestSalesAmount=findHighestSalesAmount(salesperson);
		{
			System.out.println("Sales with the highest Sales Amount:"+highestSalesAmount);
		}
		
	}

	private static SalesPerson findHighestSalesAmount(SalesPerson[] persons)
	{
		SalesPerson maxsales=persons[0];
		{
			for (int j = 0; j < persons.length; j++) 
			{	
				if(maxsales==null && persons[j].getCitytype().equals())
				{
					System.out.println();
				}
				if (persons[j].getBalance()>maxsales.getBalance())
				{
					maxsales=persons[j];
				}
			}
		}
	
		return maxsales;
	}

	
	

}
