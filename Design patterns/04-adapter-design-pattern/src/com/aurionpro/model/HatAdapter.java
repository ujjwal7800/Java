package com.aurionpro.model;

public class HatAdapter implements IItems
{
	private Hat hat;
	
	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public String getIteamName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getIteamPrice() {
		return hat.getBasicPrice()+hat.getBasicPrice()*hat.getTax()/100;
	}
	

}
