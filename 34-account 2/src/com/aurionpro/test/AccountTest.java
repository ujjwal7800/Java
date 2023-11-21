package com.aurionpro.test;

import java.util.List;

import com.aurionpro.model.Account;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class AccountTest 
{
	public static void main(String[] args) {
		HashSet<Account> accountSet=new HashSet<>();
		
		accountSet.add(new Account(1,"Ujjwal", 5000));
		accountSet.add(new Account(2,"Vishal",4000));
		accountSet.add(new Account(3,"akash", 2000));
		accountSet.add(new Account(4,"vikas", 6000));
		accountSet.add(new Account(5,"sohan", 8000));
		accountSet.add(new Account(5,"sohan", 8000));
		
		System.out.println(accountSet);
		
		accountSet.remove(0);
		System.out.println(accountSet);
		
		for (Account account:accountSet)
		{
			System.out.println(account.getName());
		}
		
		Iterator<Account>iterator=accountSet.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		
	}

}
