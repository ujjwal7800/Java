package com.aurionpro.model;

import java.util.Arrays;
import java.util.Comparator;

public class Names {
	public static void main(String[] args) {
  // TODO Auto-generated method stub  String[] names= {"Jay", "Nimesh", "Mark", "Mahesh", "Ramesh"};
  // a. Print names of first 3 students sorted in ascending order  Arrays.stream(names)
  .limit(3)  .sorted()
  .forEach(System.out::println);  System.out.println("========================");
     // b. Print names of first 3 students sorted in ascending order if their names contain 'a'
    Arrays.stream(names)
  .limit(3)  .filter(name -> name.contains("a"))
  .sorted()  .forEach(System.out::println);
  System.out.println("========================");  
  Arrays.stream(names)        .sorted(Comparator.reverseOrder())
        .forEach(System.out::println);  System.out.println("========================");
     Arrays.stream(names)
         .map(name -> name.substring(0, Math.min(3, name.length())))         .forEach(System.out::println);
      System.out.println("========================");
      Arrays.stream(names)
   .filter(name-> name.length()<=4)   .forEach(System.out:: println);
 }
}
