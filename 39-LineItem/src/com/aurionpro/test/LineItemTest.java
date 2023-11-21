package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.model.LineItem;


public class LineItemTest 
{
	public static void main(String[] args) {
		List<LineItem> lineitems = new ArrayList<>(); 
		List<LineItem> item;
		lineitems.add(new LineItem(1, "parleG", 90, 10)); 
		lineitems.add(new LineItem(1, "Gudde", 70, 30)); 
		lineitems.add(new LineItem(1, "happyhappy", 45, 40)); 
		lineitems.add(new LineItem(1, "s", 40, 60)); 
		lineitems.add(new LineItem(1, "aman", 30, 90)); 
		double sum=0;
		
		for(LineItem x:lineitems) {
		sum+=x.getUnitPrice();
		System.out.println(x);
		}
		System.out.println("total cost of the cart:"+sum);
	}

}
