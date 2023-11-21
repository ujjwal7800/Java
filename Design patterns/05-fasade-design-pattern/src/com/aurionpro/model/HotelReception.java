package com.aurionpro.model;

public class HotelReception {
	public void getIndianMenu() {
		IHotel indHotel=new IndianHotel();
		IMenu indMenu=indHotel.getMenu();
		indMenu.ShowMEnu();
	}

	public void getItalianMenu() {
		IHotel itHotel=new ItalianHotel();
		IMenu itMenu=itHotel.getMenu();
		itMenu.ShowMEnu();
	}

}