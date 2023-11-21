package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;

import com.aurionpro.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		List<Account> accounts = Arrays.asList(new Account(1, "vikas", 100000), new Account(2, "rahul", 200000),
				new Account(3, "aman", 300000), new Account(4, "yash", 400000), new Account(5, "gaurav", 500000));

		Double minSalary = accounts.stream().mapToDouble(Account::getSalary).min().orElse(0);
		System.out.println("1) Minimum Salary: " + minSalary);

		Double maxSalary = accounts.stream().mapToDouble(Account::getSalary).max().orElse(0);
		System.out.println("2) maximum Salary: " + maxSalary);

		Double totalSalary = accounts.stream().mapToDouble(Account::getSalary).sum();
		System.out.println("3) maximum Salary: " + totalSalary);

		accounts.stream().filter(account -> account.getName().length() > 6)
				.forEach(account -> System.out.println("4)Account with name > 6 characters: " + account.getName()));
	}

}
