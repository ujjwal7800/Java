package com.aurionpro.test;
import java.util.HashSet; 
import java.util.Set; 
 
public class SetExample { 
 
    public static void main(String[] args) { 
 
        // Create a HashSet 
        Set<String> stringSet = new HashSet<>(); 
 
        // Add elements to the set 
        stringSet.add("Apple"); 
        stringSet.add("Banana"); 
        stringSet.add("Orange"); 
        stringSet.add("Grapes"); 
        stringSet.add("Apple"); // Adding duplicate element (no effect) 
 
        // Print the set 
        System.out.println("Set elements: " + stringSet); 
 
        // Check if an element exists in the set 
        boolean containsBanana = stringSet.contains("Banana"); 
        System.out.println("Contains 'Banana': " + containsBanana); 
 
        // Remove an element from the set 
        boolean removedApple = stringSet.remove("Apple"); 
        System.out.println("Removed 'Apple': " + removedApple); 
 
        // Size of the set 
        int size = stringSet.size(); 
        System.out.println("Size of the set: " + size); 
 
        // Clear the set 
        stringSet.clear(); 
        System.out.println("Set after clearing: " + stringSet); 
 
        // Check if the set is empty 
        boolean isEmpty = stringSet.isEmpty(); 
        System.out.println("Is set empty? " + isEmpty); 
    } 
}

