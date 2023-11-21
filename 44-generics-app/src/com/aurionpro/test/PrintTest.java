package com.aurionpro.test;


import com.aurionpro.model.PrintValue;
import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Shape;

public class PrintTest extends Shape{
	
	public static void main(String[] args) {
//		PrintValue<Integer>printObj1=new PrintValue<Integer>(10);
//		printObj1.print();
//		
//		PrintValue<Double>printObj2=new PrintValue<Double>(10.5);
//		printObj2.print();
//		
//		PrintValue<Float>printObj5=new PrintValue<Float>(10.2f);
//		printObj5.print();
//		
//		PrintValue<String>printObj3=new PrintValue<String>("Ujjwal");
//		printObj3.print();
		
//		PrintValue<Rectangle>printObj4=new PrintValue<Rectangle>(new Rectangle(10,20));
//		printObj4.print();
		
		
		printValues(10,"Ujjwal");
		printValues(10.5,"true");
		printValues("siddhi",2.5f);
		
		
		
	}

	private static<T,S> void printValues(T value1,S value2) {
		System.out.println(value1);
		System.out.println(value2);
		
	}
	


}
