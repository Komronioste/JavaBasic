package com.neotech.lesson12;

public class RetrieveElements {

	public static void main(String[] args) {
		
		
		
		char[] grades = {'A', 'B', 'F', 'D', 'C'};
		
		//retrieve values using for loop
		
		for ( int i = 0; i < grades.length; i++)
		{
			System.out.print(grades[i]+ ", ");
			
		}
		
		System.out.println(" ---------------------- ");
		//retrieve using enhanced for loop / advanced for loop/ for-each loop
		
		for (char element: grades) 
		
		{
		System.out.print(element + ", ");
		}
		
		System.out.println();
		System.out.println("-------------------------");
		
		String[] fruits = {"Apple", "Orange", "Plum", "Kiwi", "Passion Fruit", "Cherry"};
		
		for (int i = 0; i < fruits.length; i++) 
		{
			System.out.println(fruits[i]);
		}
		
		for (String a: fruits)   //Limitations of for-each loop: cannot run from middle or run reverse
		{
			
			if (a.equals("Cherry"))
			{
				System.out.println(a + " is my favorite");
				
			}
			else {
			
			System.out.print(a + ", ");
			}
		}
		
		

	}

}
