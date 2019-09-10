// Azizul Hakim     
// 1476313
// CEN 4025
// Module 2 Assignment

import java.util.*;

public class ToDoApp extends Tasks
{
	static Scanner input;
	public static Tasks task;
	ToDoApp app;
	
	public static void main(String[] args) 
	{
		task = new Tasks();
		System.out.println("Welcome to the To-Do App");
		boolean loop = true;
		
		while(loop)
		{
			System.out.println("What would you like to do?");
			System.out.println("1. Show list");
			System.out.println("2. Add a task to list");
			System.out.println("3. Delete a task from the list");
			System.out.println("4. Exit");
			
			input = new Scanner(System.in);
			String choice = input.nextLine();
			
			switch(choice)
			{
				case "1":
					showList();
					break;
				
				case "2":
					addTask(choice);
					break;
					
				case "3":
					deleteTask(choice);
					break;
					
				case "4":
					System.out.println("Goodbye");
					loop = false;
					break;
			}
		}
	}
	
	public ToDoApp() 
	{
		
	}

	public static void addTask(String task)
	{
		System.out.println("Enter a new task");
		task = input.nextLine();
		Tasks.tasksArray.add(task);
		System.out.println("New task added");
		System.out.println();
	}
	
	
	public static void deleteTask(String task)
	{
		System.out.println("Enter a task to delete");
		task = input.nextLine();
		Tasks.tasksArray.remove(task);
		System.out.println("Task deleted");
		System.out.println();
	}
	
	public static void showList()
	{
		Iterator iterator = tasksArray.iterator();
		
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		if(tasksArray.isEmpty())
			System.out.println("You have no tasks");
		
		System.out.println();
	}
	
}


