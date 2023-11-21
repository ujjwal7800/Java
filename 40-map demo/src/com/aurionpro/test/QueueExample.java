package com.aurionpro.test;
import java.util.LinkedList; 
import java.util.Queue; 
 
public class QueueExample { 
 
    public static void main(String[] args) { 
 
        // Create a LinkedList as a Queue 
        Queue<String> queue = new LinkedList<>(); 
 
        // Add elements to the queue 
        queue.offer("Apple"); 
        queue.offer("Banana"); 
        queue.offer("Orange"); 
 
        // Print the queue 
        System.out.println("Queue elements: " + queue); 
 
        // Peek at the first element without removing it 
        String peekedElement = queue.peek(); 
        System.out.println("Peeked element: " + peekedElement); 
 
        // Remove and return the first element 
        String removedElement = queue.poll(); 
        System.out.println("Removed element: " + removedElement); 
 
        // Print the updated queue 
        System.out.println("Updated queue elements: " + queue); 
 
        // Check if the queue contains a specific element 
        boolean containsBanana = queue.contains("Banana"); 
        System.out.println("Contains 'Banana': " + containsBanana); 
 
        // Get the size of the queue 
        int size = queue.size(); 
        System.out.println("Size of the queue: " + size); 
 
        // Check if the queue is empty 
        boolean isEmpty = queue.isEmpty(); 
        System.out.println("Is queue empty? " + isEmpty); 
    } 
}
