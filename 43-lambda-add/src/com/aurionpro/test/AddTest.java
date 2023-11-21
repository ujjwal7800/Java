package com.aurionpro.test;

import com.aurionpro.model.IAddable;
import com.aurionpro.model.WelcomeAdding;

public class AddTest {
	public static void main(String[] args) {
		IAddable obj= new WelcomeAdding();
		System.out.println("addition of two numbers");
		
	obj.printGreating(0, 0);
		
	IAddable byObj= new IAddable() {

//			@Override
//			public void printGreating() {
//				System.out.println("Thankx for coming");
//				
//			}
//
//			@Override
//			public void printGreating(int x, int y) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//		};
//		byObj.printGreating();
//		
//		IAddable GoodDayObj=()->System.out.println("OK BYE");  //lambda function
//			GoodDayObj.printGreating();
		
		
		IAddable addObj = (int num , int num1) -> num + num1;
		
		addObj.addObj(10,20);
	}

	private static int num(int i, int num) {
		// TODO Auto-generated method stub
		return 0;
	}

}
