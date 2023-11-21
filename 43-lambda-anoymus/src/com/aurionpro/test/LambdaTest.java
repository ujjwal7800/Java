package com.aurionpro.test;

import com.aurionpro.model.IGreatable;
import com.aurionpro.model.WelcomeGreating;

public class LambdaTest
{
	public static void main(String[] args) {
		IGreatable obj= new WelcomeGreating();
		obj.printGreating();
		
		IGreatable byObj= new IGreatable() {

			@Override
			public void printGreating() {
				System.out.println("Thankx for coming");
				
			}
			
		};
		byObj.printGreating();
		
		IGreatable GoodDayObj=()->System.out.println("OK BYE");
		
		GoodDayObj.printGreating();
	}
	

}
