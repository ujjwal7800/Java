package com.aurionpro.test;

import com.aurionpro.model.Table;

public class ThreadTest4
{
	public static void main(String[] args) {
		Table tableObj = new Table(5);
		Thread t1=new Thread(tableObj);
		t1.start();
		
		Table tableObj2 = new Table(10);
		Thread t2=new Thread(tableObj);
		t2.start();

	}
	
}
