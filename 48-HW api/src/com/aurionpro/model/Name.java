package com.aurionpro.model;

import java.util.Arrays;
import java.util.stream.Stream;

public class Name {
	public static void main(String[] args) {
		// TODO Auto-generated method stub String[] names=
		// {"jayesh","Nimeh","mahesh","Ramesh"};
		Stream.of(names).forEach(name -> System.out.println(name));
		System.out.println("=========================");
		Arrays.asList(names).forEach(name -> System.out.println(name));
		System.out.println("=========================");
		Arrays.asList(names).forEach(System.out::println);

	}
}
