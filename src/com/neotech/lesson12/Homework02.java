package com.neotech.lesson12;

public class Homework02 {

	public static void main(String[] args) {
	
		
		String[][] students = {{"John", "Kate", "Anne", "Peter"}, {"A","C","B","F"}}; 
		
		
		// if we do students.length  ---> it will give us number of rows.
		// length of a specific rows: students[1].length ---> number of columns
		
		
		for ( int i = 0; i<students[0].length; i++)

		{
			if (students[1][i].equals("A") || students[1][i].equals("B"))
			
			{	
			System.out.println(students[0][i]);
			}
		}
		
		
	}

}
