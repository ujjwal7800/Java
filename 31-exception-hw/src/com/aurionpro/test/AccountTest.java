package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.InsufficientFundsException;

public class AccountTest 
{
	public static void main(String[] args) {
		Account acc = new Account(101, "ujjwal", 2000);
		try {
			acc.withdraw(4000000);
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}

	}

		
	}


