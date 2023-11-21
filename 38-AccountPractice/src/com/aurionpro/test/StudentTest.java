package com.aurionpro.test; 
 
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Comparator; 
import java.util.Iterator; 
import java.util.List; 
 
import com.aurionpro.model.Student; 
 
public class StudentTest { 
 public static void main(String[] args) { 
  List<Student> students = new ArrayList<>(); 
   
  students.add(new Student(1, "Ujjwal", 90)); 
  students.add(new Student(2, "Clair", 80)); 
  students.add(new Student(3, "Rosie", 85)); 
  students.add(new Student(4, "Daisy", 70)); 
  students.add(new Student(5, "Tim", 75)); 
   
  System.out.println(students); 
   
  // Find the student with the maximum percentage 
        Student maxPercentageStudent = students.get(0); // Assume the first student has the maximum percentage initially 
 
        for (Student student : students) { 
            if (student.percentage > maxPercentageStudent.percentage) { 
                maxPercentageStudent = student; 
            } 
        } 
 
        // Print the student with the maximum percentage 
        System.out.println("Student with the maximum percentage:"); 
        System.out.println("ID: " + maxPercentageStudent.id); 
        System.out.println("Name: " + maxPercentageStudent.name); 
        System.out.println("Percentage: " + maxPercentageStudent.percentage); 
         
     // Find the student with the least percentage 
        Student minPercentageStudent = students.get(0); // Assume the first student has the maximum percentage initially 
 
        for (Student student : students) { 
            if (student.percentage < minPercentageStudent.percentage) { 
             minPercentageStudent = student; 
            } 
        } 
 
        // Print the student with the maximum percentage 
        System.out.println("Student with the maximum percentage:"); 
        System.out.println("ID: " + minPercentageStudent.id); 
        System.out.println("Name: " + minPercentageStudent.getName()); 
        System.out.println("Percentage: " + minPercentageStudent.percentage); 
         
        // Sort students by percentage in ascending order        
        Collections.sort(students, Comparator.comparingDouble(Student::getPercentage)); 
        // Print the sorted list 
        System.out.println("Students sorted by percentage in ascending order:");         
        for (Student student : students) { 
         System.out.println(student);         
        } 
         
     // Sort students by percentage in ascending order        
        Collections.sort(students, Comparator.comparing(Student::getName)); 
        // Print the sorted list 
        System.out.println("Students sorted by name in ascending order:");         
        for (Student student : students) { 
         System.out.println(student);         
        } 
         
    } 
}
