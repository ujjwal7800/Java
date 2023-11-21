package com.aurionpro.module;

public class SalesPerson 
{
	private int id;
	private String name;
	private int experience;
	private double salesAmont;
	private CityType citytype;
	public SalesPerson(int id, String name, int experience, double salesAmont, CityType citytype) {
		super();
		this.id = id;
		this.name = name;
		this.experience = experience;
		this.salesAmont = salesAmont;
		this.citytype = citytype;
	}
	public int getId() {
		return id;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getExperience() {
		return experience;
	}
	
	public double getSalesAmont() {
		return salesAmont;
	}
	
	public CityType getCitytype() {
		return citytype;
	}
	
	@Override
	public String toString() {
		return "SalesPerson [id=" + id + ", name=" + name + ", experience=" + experience + ", salesAmont=" + salesAmont
				+ ", citytype=" + citytype + "]";
	}
	public int getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	

}
