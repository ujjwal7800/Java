package com.aurionpro.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		Map<Integer, String> nameMap = new HashMap<>();
		
		nameMap.put(1, "ujjwal");
		nameMap.put(2, "roshan");
		nameMap.put(3, "ayush");
		System.out.println("enter the name" + nameMap);
		
		Scanner sc = new Scanner(System.in);  System.out.print("Enter a name to add/delete: ");
		  String inputName = sc.nextLine();
		  if (nameMap.containsValue(inputName)) {   nameMap.values().removeIf(value -> value.equals(inputName));
		   System.out.println("Name removed from the map.");  } else {
		   int newKey = nameMap.keySet().stream().mapToInt(Integer::intValue).max().orElse(0) + 1;   nameMap.put(newKey, inputName);
		   System.out.println("Name added to the map.");  }
		  nameMap.forEach((key, value) -> {
		   System.out.println(key + " " + value);  });
		  sc.close();


//		Set<Entry<Integer, String>> entrySet = nameMap.entrySet();
//		for (Entry x : entrySet) {
//			System.out.println(x.getKey() + "  " + x.getValue());
//		}
//		nameMap.forEach((key, value) -> {
//			System.out.println(key + " " + value);
//		});
//		System.out.println(nameMap.containsValue("Ujjwal"));
//		System.out.println(nameMap.remove(2));

	}

}
