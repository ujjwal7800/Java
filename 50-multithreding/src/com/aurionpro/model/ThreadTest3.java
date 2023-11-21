package com.aurionpro.model; 
 
public class ThreadTest3 { 
 public static void main(String[] args) { 
  Thread t1= new Thread(new InnerClass(), "staticThread"); 
  t1.start(); 
   
  Runnable runObj = new Runnable() { 
   @Override 
   public void run() { 
    System.out.println(Thread.currentThread().getName()+ "Anonymus class"); 
   } 
  }; 
  Thread t2= new Thread(runObj, "anonymusThread"); 
  t2.start(); 
   
  Runnable runObj2=()->{ 
   System.out.println(Thread.currentThread().getName()+ "Lambda Function"); 
  }; 
  Thread t3 = new Thread(runObj2, "lambdaThread"); 
  t3.start(); 
 } 
  
 private static class InnerClass implements Runnable{ 
  @Override 
  public void run() { 
   System.out.println(Thread.currentThread().getName()+" static Inner class"); 
  } 
 } 
 
}
