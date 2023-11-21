package com.aurionpro.test;

import com.aurionpro.model.Internet;
import com.aurionpro.model.ProxyInternet;

public class InternetTest {
 public static void main(String[] args) {
  Internet proxyInternet=new ProxyInternet();
  proxyInternet.connectTo("www.flipkart.com");
  System.out.println("-----------------------");
  proxyInternet.connectTo("www.geeksforgeeks.com");
  
  
 }
}
