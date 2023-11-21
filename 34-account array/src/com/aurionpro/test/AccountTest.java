package com.aurionpro.test;

import java.util.List;

import com.aurionpro.model.Account;

import java.util.ArrayList;
import java.util.Iterator;

public class AccountTest 
{
	public static void main(String[] args) {
		List<Account> accounts=new ArrayList<>();
		
		accounts.add(new Account(1,"Ujjwal", 5000));
		accounts.add(new Account(2,"Vishal",4000));
		
		System.out.println(accounts);
		
		accounts.remove(0);
		System.out.println(accounts);
		
		for (Account account:accounts)
		{
			System.out.println(account.getName());
		}
		
		Iterator<Account>iterator=accounts.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		
	}

}
