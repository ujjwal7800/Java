package com.aurionpro.test; 
 
import java.util.Arrays; 
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.aurionpro.model.Student; 
 
public class StudentTest { 
 
 public static void main(String[] args) { 
 
  List<Student> students = Arrays.asList( 
  new Student(1,"Rohit",90.00,Arrays.asList("Cricket","chess")), 
  new Student(2,"Akash",80.00,Arrays.asList("vollyball","ludo")), 
  new Student(3,"Rahul",70.00,Arrays.asList("basketball","cricket")), 
  new Student(4,"Siddhi",70.00,Arrays.asList("basketball","cricket"))
  );
 }
  List<String> collectHobbies1 = Student.stream() 
		//  .map((student)->student.getHobbies()) 
		        .flatMap((student) -> student.getHobbies().stream()) 
		        .distinct()  
		        .collect(Collectors.toList()); 
		         
		  System.out.println(collectHobbies);
		  
		  List<String> collectHobbies = Student.stream() 
				  .map((student)->student.getHobbies()) 
				        .flatMap((student) -> student.stream()) 
				        .map((student)->student.toLowerCase()) 
				        .distinct()  
				        .collect(Collectors.toList()); 
		  System.out.println(collectHobbies);

		  
				         



}
