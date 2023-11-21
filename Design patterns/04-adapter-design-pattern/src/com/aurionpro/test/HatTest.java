package com.aurionpro.test;

import com.aurionpro.model.Biscuit;
import com.aurionpro.model.Hat;
import com.aurionpro.model.HatAdapter;
import com.aurionpro.model.IItems;
import com.aurionpro.model.ShoppingCart;

public class HatTest 
{
	public static void main(String[] args) {
		ShoppingCart cart=new ShoppingCart();
		Hat hat =new Hat("hst", "hhhhhhhhh", 500.0,3.0);
		IItems biscuit=new Biscuit("parleG",300);
		
		cart.addItemToCart(biscuit);
		IItems hatadapter=new HatAdapter(hat);
		
		System.out.println(cart.getTotalPrice());
		System.out.println(cart.getCartItems());
	}

}
 