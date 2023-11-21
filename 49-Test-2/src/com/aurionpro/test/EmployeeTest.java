package com.aurionpro.test;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.aurionpro.model.Employee;

public class EmployeeTest 
{
	private static final Readable inputData = null;
	public static void main1(String[] args) throws ParseException {
		
//		1) Find all employees in a department
        
        
        List<Employee> employeeList = new ArrayList<>();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");

        employeeList.add(new Employee(7698, "BLAKE", "MANAGER", 7839, dateFormat.parse("1-MAY-81"), 2850, 0, 30));
        employeeList.add(new Employee(7369, "SMITH", "CLERK", 7902, dateFormat.parse("17-DEC-80"), 800, 0, 20));
        employeeList.add(new Employee(7788, "SCOTT", "ANALYST", 7566, dateFormat.parse("09-DEC-82"), 3000, 0, 20));
        employeeList.add(new Employee(7698, "BLAKE", "MANAGER", 7839, dateFormat.parse("1-MAY-81"), 2850, 0, 30));
        employeeList.add(new Employee(7698, "BLAKE", "MANAGER", 7839, dateFormat.parse("1-MAY-81"), 2850, 0, 30));
        employeeList.add(new Employee(7698, "BLAKE", "MANAGER", 7839, dateFormat.parse("1-MAY-81"), 2850, 0, 30));
        int targetDepartmentId = 30; 
        List<Employee> employeesInDepartment = getEmployeesInDepartment(employeeList, targetDepartmentId);

        for (Employee employee : employeesInDepartment) {
            System.out.println("Employee Name: " + employee.getName() + ", Department ID: " + employee.getDepartmentId());
        }
    }
	public static List<Employee> getEmployeesInDepartment(List<Employee> employeeList, int departmentId) {
        List<Employee> employeesInDepartment = new ArrayList<>();

        for (Employee employee : employeeList) {
            if (employee.getDepartmentId() == departmentId) {
                employeesInDepartment.add(employee);
            }
        }

        return employeesInDepartment;
	}
	
	public static Map<Integer, Integer> countEmployeesPerDepartment(List<Employee> employeeList) {
        Map<Integer, Integer> departmentEmployeeCount = new HashMap<>();

        for (Employee employee : employeeList) {
            int departmentId = employee.getDepartmentId();
            departmentEmployeeCount.put(departmentId, departmentEmployeeCount.getOrDefault(departmentId, 0) + 1);
        }

        return departmentEmployeeCount;
    }
	
	public void addEmployee(Employee newEmployee) {
        Employee.add(newEmployee);
    }

    public boolean deleteEmployee(int[] employeeIdToDelete) {
        Employee employeeToRemove = null;
        for (Employee employee : employee) {
            if (employee.getEmployeeId() == employeeIdToDelete) {
                employeeToRemove = employee;
                break;
            }
        }
        if (employeeToRemove != null) {
            Employee.remove(employeeToRemove);
            return true;
        } else {
            return false;
        }
    }

    public void saveEmployeesToFile() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream()) {
            outputStream.writeObject(deleteEmployee(null));
            System.out.println("Employees saved to file.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error saving employees to file: " + e.getMessage());
        }
    }
    public static void main(String[] args) throws ParseException {
        // Create an instance of EmployeeTest and perform operations
        EmployeeTest employeeTest = new EmployeeTest();

        // ... Add employees to the list ...

        // Add a new employee
        DateFormat dateFormat = null;
		Employee newEmployee = new Employee(7698, "BLAKE", "MANAGER", 7839, dateFormat.parse("1-MAY-81"), 2850, 0, 30);
        employeeTest.addEmployee(newEmployee);
        
        // Delete an employee
        int[] employeeIdToDelete = null  ;
        boolean deleted = employeeTest.deleteEmployee(employeeIdToDelete);
        if (deleted) {
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found or couldn't be deleted.");
        }

        // Save the updated employee list to file
        employeeTest.saveEmployeesToFile();
    }
}

    






	
	
	
	
	

