package com.aurionpro.model;

public class MultiplyOperation implements Strategy{

	@Override
	public int doOperation(int a, int b) {
		return a*b;
	}

}
