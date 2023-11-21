package com.aurionpro.test; 
 
import java.util.ArrayList; 
import java.util.Arrays; 
import java.util.Comparator; 
import java.util.List; 
import java.util.stream.Collectors; 
import java.util.stream.Stream; 
 
import com.aurionpro.model.Account; 
import com.aurionpro.model.Gender; 
 
public class AccountTest { 
 public static void main(String args[]) { 
   List<Account> accounts2 = new ArrayList<>(); 
   accounts2.add(new Account(1, "Ujjwal", Gender.Male, 200000)); 
   accounts2.add(new Account(2, "Umaid", Gender.Male, 150000)); 
   accounts2.add(new Account(3, "Tanish", Gender.Male, 250000)); 
   accounts2.add(new Account(4, "Siddhi", Gender.Female, 300000)); 
   accounts2.add(new Account(5, "Rasika", Gender.Female, 100000)); 
   accounts2.add(new Account(6, "Tanuja", Gender.Female, 90000)); 
   accounts2.add(new Account(7, "Sarvesh", Gender.Male, 80000)); 
   accounts2.add(new Account(8, "Rohan", Gender.Male, 90000)); 
   accounts2.add(new Account(9, "Rohit", Gender.Male, 50000)); 
   accounts2.add(new Account(10, "Rahul", Gender.Male, 60000)); 
   accounts2.add(new Account(11, "Suswar", Gender.Male, 200000)); 
   accounts2.add(new Account(12, "Aniket", Gender.Male, 250000)); 
    
 
  Account[] accounts = {  
    new Account(1, "Sahil", Gender.Male, 200000), 
    new Account(2, "Umaid", Gender.Male, 150000),  
    new Account(3, "Tanish", Gender.Male, 250000), 
    new Account(4, "Siddhi", Gender.Female, 300000),  
    new Account(5, "Rasika", Gender.Female, 100000), 
    new Account(6, "Tanuja", Gender.Female, 90000),  
    new Account(7, "Sarvesh", Gender.Male, 80000), 
    new Account(8, "Rohan", Gender.Male, 90000),  
    new Account(9, "Rohit", Gender.Male, 50000), 
    new Account(10, "Rahul", Gender.Male, 60000),  
    new Account(11, "Suswar", Gender.Male, 200000), 
    new Account(12, "Aniket", Gender.Male, 250000)  
    }; 
 
  System.out.println("**************MALE*****************"); 
 
  List<Account> collectMale = Arrays.stream(accounts).filter((acc) -> (acc.getAccGender() == Gender.Male)) 
    .collect(Collectors.toList()); 
 
  collectMale.forEach((acc) -> System.out.println(acc)); 
 
  System.out.println("*****************FEMALE*******************"); 
 
  List<Account> collectFemale = Arrays.stream(accounts).filter((acc) -> (acc.getAccGender() == Gender.Female)) 
    .collect(Collectors.toList()); 
 
  collectFemale.forEach((acc) -> System.out.println(acc)); 
 
  System.out.println("**************BALANCE****************"); 
 
  List<Account> collectBalance = Arrays.stream(accounts).filter((acc) -> (acc.getBalance() >= 100000)) 
    .collect(Collectors.toList()); 
 
  collectBalance.forEach((acc) -> System.out.println(acc)); 
 
  System.out.println("***********************************"); 
   
  System.out.println("**************MALE*****************"); 
   
  List<Account> collectMale2 = accounts2.stream().filter((acc) -> (acc.getAccGender().equals(Gender.Male))) 
    .collect(Collectors.toList()); 
 
  collectMale2.forEach((acc) -> System.out.println(acc)); 
   
   
  System.out.println("*****************FEMALE*******************"); 
 
  List<Account> collectFemale2 = accounts2.stream().filter((acc) -> (acc.getAccGender().equals(Gender.Female))) 
    .collect(Collectors.toList()); 
   
  collectFemale2.forEach((acc) -> System.out.println(acc)); 
   
  System.out.println("**************BALANCE****************"); 
 
  List<Account> collectBalance2 = accounts2.stream().filter((acc) -> (acc.getBalance() >= 100000)) 
    .collect(Collectors.toList()); 
 
  collectBalance2.forEach((acc) -> System.out.println(acc)); 
  collectBalance2.forEach(System.out::println); 
   
  System.out.println("***********************************"); 
   
  List<Integer> balanceList = accounts2.stream().map((acc) -> acc.getBalance()).collect(Collectors.toList()); 
  System.out.println(balanceList); 
   
  List<Account> sortedByBalance =accounts2.stream().sorted(Comparator.comparingDouble(Account::getBalance).reversed()).limit(3) 
		    .collect(Collectors.toList()); 
  
		  sortedByBalance.forEach(System.out::println); 
		   
		  List<String> sortedByBalancegetName = accounts2.stream().sorted(Comparator.comparingDouble(Account::getBalance).reversed()).limit(3) 
		    .map((acc) -> acc.getAccName()) 
		    .collect(Collectors.toList()); 
		   
		  sortedByBalancegetName.forEach(System.out::println); 
		 } 
		 
		}

