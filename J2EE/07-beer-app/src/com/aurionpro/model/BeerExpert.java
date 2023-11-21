package com.aurionpro.model;

import java.util.List;
import java.util.ArrayList;

public class BeerExpert {

	public List<String> getBrands(String color) {
		List<String> brands = new ArrayList<String>();
		if ("amber".equals(color)) {
			brands.add("Jack Amber");
			brands.add("Red Moose");
		} else {
			brands.add("Jail Pale Ale");
			brands.add("Gout Stout");
			// You can handle other cases here or provide a default action.
		}
		return brands;
	}
}
