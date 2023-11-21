package com.aurionpro.model;

public class Consultant implements IRole {

	@Override
	public String description() {
		return "I am concultant";
	}

	@Override
	public String responsiblity() {
		return "responsibility to write code";
	}

}
