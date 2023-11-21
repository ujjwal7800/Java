package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.Infant;
import com.aurionpro.model.Kid;
import com.aurionpro.model.Man;

public class InheritanceTest
{

	public static void main(String[]args)
	{
		case1();
		System.out.println(".........");
		case2();
		System.out.println(".........");
		case3();
		System.out.println(".........");
		case4();
		System.out.println(".........");
		case5();
		System.out.println("..........");
		case6();
		System.out.println("...........");
		
	}

	private static void case6() { //6
		Object obj=new Object();
		obj=10;
		System.out.println(obj.getClass().getSimpleName());
		obj="Ujjwal";
		System.out.println(obj.getClass().getSimpleName());
		obj=10>23;
		System.out.println(obj.getClass().getSimpleName());
	
	
	}
	
	
	

	private static void case5()  //5
	{
		playAtPark(new Man());
		playAtPark(new Boy());
		playAtPark(new Kid());
		playAtPark(new Infant());
		
		
		
		
	}

	private static void playAtPark(Man man) {
		// TODO Auto-generated method stub
		
	}

	private static void case4() //4
	{
		Man man=new Boy();
		man.read();
	//	man.eat(); we can call only parent methods
		man.play();
		
		
	
		
	}

	private static void case3() {  //3
		Man man;
		man=new Infant();
		man.play();
		man.read();
		man.sleep();
		
		
	}

	private static void case2() {    //2
		Boy boy;
		boy=new Boy();
		boy.eat();
		boy.read();
		
		
		
	}

	private static void case1() { //1
		Man man;
		man=new Man();
		man.read();
		man.play();
		
		
	}

}
