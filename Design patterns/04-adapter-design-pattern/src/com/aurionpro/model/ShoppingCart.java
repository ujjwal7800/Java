package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart 
{
	private List<IItems>cartItems;

	public ShoppingCart() {
		super();
		this.cartItems=new ArrayList<>();
	}
	
	public void addItemToCart(IItems item) {
		this.cartItems.add(item);
		
		
	}
	public List<IItems>getCartItems(){
		return cartItems;
		
	}
	public double getTotalPrice() {  double total = 0;
	  for (IItems i : cartItems) {   total = total + i.getIteamPrice();
	  }  return total;

		
	}

	@Override
	public String toString() {
		return "ShoppingCart [cartItems=" + cartItems + "]";
	}
	
	
	
	

}
