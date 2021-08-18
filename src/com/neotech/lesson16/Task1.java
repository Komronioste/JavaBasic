package com.neotech.lesson16;

public class Task1 {

	public static void main(String[] args) {
	//create a string and print it in reverse.
		
		String day = "Sunday";
		
		for ( int i = day.length()-1; i >= 0; i--)
		{
			
			System.out.print(day.charAt(i));
		}
	}
}
