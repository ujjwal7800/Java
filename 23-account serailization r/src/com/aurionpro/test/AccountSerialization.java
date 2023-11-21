
package com.aurionpro.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.aurionpro.model.AccountSerialization;

public class AccountSerialization {
 public static void main(String args[]){    
    try{  
    Account acc = new Account(1,"Ujjwal",200000) ;
    FileOutputStream file =new FileOutputStream("D:\\Software\\eclipseOxygen\\account serailization r\\serialize\\test1.txt");    
    ObjectOutputStream out=new ObjectOutputStream(file);  
    out.writeObject(acc); 
    out.close();    
    file.close();
    System.out.println("success");    
     }catch(Exception e){
      System.out.println(e);}    
    }    
    
    

}
