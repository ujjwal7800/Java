package com.aurionpro.test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;
import com.techlabs.model.SavingAccount;


public class ReflectionTest 
{
	private static Object tempClass;

	public static void main(String[] args) throws ClassNotFoundException,NoSuchMethodException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the class name");
		String className=sc.nextLine();
		System.out.println(className);
		
		Class<?> tempClass = Class.forName(className);
		System.out.println("..................");
		
		Field[] declareField=tempClass.getDeclaredFields();
		
		for (Field f:declareField)
		{
			System.out.println(f);
		}
		System.out.println(".....Constructor......");
		Constructor<?> declareConstructor=tempClass.getConstructor();
		
		for (Constructor<?> c:declareConstructor)
		{
			System.out.println(c);
		}
		
		System.out.println(".....Method....");
		Method method=((Class) tempClass).getMethods();
		
		for(Method m:method)
		{
			System.out.println(m);
			
			
		}
		class<? super savingAccount> superclass=savingAccount.classgetSuperclass();
		System.out.println(superclass.getSimpleName);
		
		
	}
}
