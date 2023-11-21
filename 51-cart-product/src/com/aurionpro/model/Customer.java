package com.aurionpro.model;

import java.util.List;

public class Customer 
{
	private int id;
	private String name;
	private List<Order> Orders;
	public Customer(int id, String name, List<Order> orders) {
		super();
		this.id = id;
		this.name = name;
		Orders = orders;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Order> getOrders() {
		return Orders;
	}
	public void setOrders(List<Order> orders) {
		Orders = orders;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", Orders=" + Orders + "]";
	}
	

}
