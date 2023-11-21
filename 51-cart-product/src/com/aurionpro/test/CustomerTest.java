package com.aurionpro.test;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import com.aurionpro.model.Customer;
import com.aurionpro.model.LineItem;
import com.aurionpro.model.Order;
import com.aurionpro.model.Product;

public class CustomerTest 
{
	public static void main(String[] args) {
		List<Product> products=Arrays.asList(new Product(1,"Sugar", 100, 10),
				new Product(2,"rice", 500, 21),
		new Product(3,"daal", 689, 34),
		new Product(4,"cookies", 1000, 30)
		);
		
		
		List<LineItem> lineItems = Arrays.asList( 
	            new LineItem(1, 10, products.get(0)), 
	            new LineItem(2, 15, products.get(1)), 
	            new LineItem(3, 20, products.get(2)), 
	            new LineItem(4, 5, products.get(3)) 
	        ); 

		
		Order order= new Order(1,  new Date(0), lineItems);
		new Order(2,  new Date(0), lineItems);
		new Order(3,  new Date(0), lineItems);

		Customer customer = new Customer(1, "Ujjwal", Arrays.asList(order));
		new Customer(2, "Siddhi", Arrays.asList(order)); 
		new Customer(3, "Rohit", Arrays.asList(order)); 

		 
        double orderPrice = order.calculateOrderPrice(); 
        System.out.println("Order Price: " + orderPrice); 
 
        System.out.println(customer); 
    } 

		
		
		


	}


