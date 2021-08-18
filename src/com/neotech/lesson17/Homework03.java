package com.neotech.lesson17;

public class Homework03 {

	public static void main(String[] args) {

		String sen = "Today is Tuesday and we have a Java Class!!!";

		String [] split = sen.split(" ");
		

		for (String part : split)
		{
			char[] reverse = part.toCharArray();
			
			for (int i = reverse.length-1; i >=0; i--)
			{
				System.out.print(reverse[i] + "");
			}
			System.out.print(" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

