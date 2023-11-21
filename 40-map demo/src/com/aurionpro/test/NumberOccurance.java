package com.aurionpro.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOccurance 
{
	public static void main(String[] args) {
		List<Integer>NumberList=Arrays.asList(10,20,10,10,10,30,40,50);
		Map<Integer, Integer>countMap=new HashMap<Integer, Integer>();
//		for (Integer x:NumberList){
//			System.out.println(x);
//		}
//		NumberList.forEach((x)->{
//			System.out.println(x);
//			
//		});
		for (Integer x:NumberList){
			if(!countMap.containsKey(x)) {
				countMap.put(x, 1);
		}
		else {
			countMap.put(x,countMap.get(x)+1);
		}
		
	}
	countMap.forEach((key,value)->{
		System.out.println(key+"  "+value);
	});
}
}
