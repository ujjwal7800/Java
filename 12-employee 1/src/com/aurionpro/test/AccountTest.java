package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.AccountType;

public class AccountTest {
	private static Object type;

	public static void main(String[] args) {
		Account[] accounts = { 
				new Account(1, "Ujjwal", 5000, AccountType.SAVING),
				new Account(2, "Rahul", 6000, AccountType.CURRENT), 
				new Account(3, "Nihal", 3000, AccountType.SAVING),
				new Account(4, "Pranav", 2000, AccountType.CURRENT), 
				new Account(5, "Janhvi", 5000, AccountType.SAVING),
				new Account(6, "Siddhi", 500, AccountType.CURRENT), 
				new Account(7, "Umaid", 3245, AccountType.SAVING),
				new Account(8, "Yash", 200, AccountType.CURRENT), 
				new Account(9, "Prem", 1324, AccountType.SAVING),
				new Account(10, "Yashu", 1250, AccountType.CURRENT)
				};
//		for(Account acc :accounts)
//		{
//			System.out.println(acc);
//		}
		
		Account highestBalanceAccount =findHighestBalanceAccount(accounts);
		System.out.println("Account with the Highest Balanace :"+highestBalanceAccount);
		
		Account highestCurrentBalanceAccount =findHighestCurrentBalanceAccount(accounts,AccountType.SAVING);
		System.out.println("Account with the Highest Balanace :"+highestCurrentBalanceAccount);
		
		Account highestSavingBalanceAccount =findHighestCurrentBalanceAccount(accounts,AccountType.CURRENT);
		System.out.println("Account with the Highest Balanace :"+highestSavingBalanceAccount);
		
		

	}

	private static Account findHighestCurrentBalanceAccount(Account[] accounts, AccountType saving)
	{
		Account maxAccount=null;
		for(int i=0; i<accounts.length;i++)
		{
			if(maxAccount==null && accounts[i].getAccounttype().equals(type))
			{
				System.out.println();
			}
			if (accounts[i].getBalance()>maxAccount.getBalance())
			{
				maxAccount=accounts[i];
			}
		}
		return maxAccount;
	}

	private static Account findHighestBalanceAccount(Account[] accounts)
	{
         Account maxAccount=accounts[0];
         for(int i=0; i<accounts.length;i++)
         {
        	 if(accounts[i].getBalance()>maxAccount.getBalance())
        	 {
        		 maxAccount=accounts[i];
        	 }
         }
		return maxAccount;
	}
	
	public static void sortAccountsArrayBySalary(Account[] accounts)
	{
		Account temp=null;
		for(int i=0;i<accounts.length;i++)
		{
			for(int j=0;j<accounts.length-1;j++)
			{
				if(accounts[i].getBalance()>accounts[j].getBalance())
				{
					temp=accounts[j];
					accounts[j]=temp;
				}
			}
		}
	}
	
	public static double findSumOfAccountBalance(Account[] accounts)
	{
		double sum=0;
		for(int i=0;i< accounts.length;i++)
		{
			sum+=accounts[i].getBalance();
		}
		return sum;
		
		
	}
}


