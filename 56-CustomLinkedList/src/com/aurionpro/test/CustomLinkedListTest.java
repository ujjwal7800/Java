package com.aurionpro.test;

import com.aurionpro.model.CustomLinkedList;

public class CustomLinkedListTest {
	
	    public static void main(String[] args) {
	        CustomLinkedList list = new CustomLinkedList();
	        list.add(23);
	        list.add(34);
	        list.remove(36);
	        list.add(56);
	        list.remove(98);
	        list.display();

	        for (int item : list) {
	            System.out.println(item);
	        }
	    }
	}



