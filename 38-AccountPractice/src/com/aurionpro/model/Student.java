package com.aurionpro.model;

public class Student 
{
	public int id;
	private String Name;
	private double percentange;
	public int percentage;
	
	public Student(int id, String name, double percentange) {
		super();
		this.id = id;
		Name = name;
		this.percentange = percentange;
	}
	public Student(int id2, String name2, int percentange2) {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPercentange() {
		return percentange;
	}
	public void setPercentange(double percentange) {
		this.percentange = percentange;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", percentange=" + percentange + "]";
	}
	
	
	


}
