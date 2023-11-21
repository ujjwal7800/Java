<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> 
<%@ page import="java.util.Arrays" %> 
 
<!DOCTYPE html> 
<html> 
<head> 
    <meta charset="UTF-8"> 
    <title>Todos Response</title> 
</head> 
<body> 
    <h2>Todos Response</h2> 
     
    <%-- Get the current task from the request --%> 
    <% 
        String[] newTasks = request.getParameterValues("task"); 
         
        // Check if the session already has a task list attribute 
        String[] taskList = (String[]) session.getAttribute("todosTask"); 
         
        // If not, create a new empty array 
        if (taskList == null) { 
            taskList = new String[0]; 
        } 
         
        // Add the new tasks to the list (concatenating arrays) 
        if (newTasks != null && newTasks.length > 0) { 
            taskList = Arrays.copyOf(taskList, taskList.length + newTasks.length); 
            System.arraycopy(newTasks, 0, taskList, taskList.length - newTasks.length, newTasks.length); 
        } 
         
        // Set the updated task list in the session attribute 
        session.setAttribute("todosTask", taskList); 
    %> 
     
    <h3>Tasks:</h3> 
    <ul> 
        <%-- Display the tasks from the session attribute --%> 
        <% 
            if (taskList != null && taskList.length > 0) { 
                for (String task : taskList) { 
        %> 
        <li><%= task %></li> 
        <% 
                } 
            } else { 
        %> 
        <li>No tasks added yet.</li> 
        <% 
            } 
        %> 
    </ul> 
     
    <p><a href="session-todos.jsp">Back to Add Tasks</a></p> 
</body> 
</html>
