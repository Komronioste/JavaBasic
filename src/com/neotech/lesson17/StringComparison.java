package com.neotech.lesson17;

public class StringComparison {

	public static void main(String[] args) {
		
		
		String str1 = "Hello";   //String literal saved to string pool (faster option)
		String str2 = new String ("Hello"); //String with new keyword creates a new object.
		
		if (str1.equals(str2))  // equal
		{
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings not equal");
		}

		if (str1==(str2))   // not equal
		{
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings not equal");
		}
	}

}
