package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.aurionpro.model.Employee;


public class EmployeeTest 
{
	public static void main(String[] args) 
	{
		 List<Employee> employeesList = Arrays.asList( 
				  new Employee(1,"Ujjwal","CashManagement",50000), 
				  new Employee(1,"Rohit","CashManagement",60000), 
				  new Employee(1,"siddhi","Payment",40000), 
				  new Employee(1,"Rahul","consultant",90000), 
				  new Employee(1,"Rohit","CashManagement",70000),
				  new Employee(1,"suswar","HR",98000), 
				  new Employee(1,"yash","payment",54000)
				  );
		Map<String,List<Employee>> collect =employeesList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		
		collect.forEach((key,value)->{
			System.out.println(key+" : "+value);
		});
		
		double totalSalary = employeesList.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
        
        System.out.println("Total Salary: " + totalSalary);
       
		
		 
		
	}

}
