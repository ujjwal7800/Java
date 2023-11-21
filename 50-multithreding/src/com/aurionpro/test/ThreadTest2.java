package com.aurionpro.test;

import com.aurionpro.model.PrintCharacter;

public class ThreadTest2
{
	public static void main(String[] args) {
		PrintCharacter printCharObj=new PrintCharacter();
		Thread t1=new Thread(printCharObj);
		t1.start();
		Thread t2=new Thread(printCharObj);
		t2.start();
		
	}

}
