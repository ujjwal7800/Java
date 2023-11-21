package com.aurionpro.model;

import java.util.List;
import java.util.ArrayList;

public class ListTest 
{
	public static void main(String[] args) 
	{
		List numbers=new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		System.out.println(numbers.size());
		System.out.println(numbers);
		
		System.out.println(numbers.contains(30));
		
		numbers.remove(new Integer(10));
		numbers.remove(0);
		System.out.println(numbers);
		
		numbers.clear();
		
	}

}
