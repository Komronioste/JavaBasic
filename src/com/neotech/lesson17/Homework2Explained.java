package com.neotech.lesson17;

public class Homework2Explained {

	public static void main(String[] args) {
		
		
		String str = "Today is Saturday and we have a Java Class!!!";
		
		//1. make it possible to acces each word by an index, ie .split()
		//2. reverse each word and print
		
		String[] strArray = str.split(" ");
		
		for (String el: strArray)
		{
			for( int i = el.length()-1; i>=0; i--)
			{
				System.out.print(el.charAt(i));
			}
			System.out.print(" ");
		}
		
		System.out.println(" ");
		
//		Homework2Explained h2 = new Homework2Explained();
//		
//		String a = "Today is Saturday and it's cool";
//		
//		
//		String reverseStr = h2.reverseString();

	}
	
	String reverseString(String str)
	{
		String resultStr = "";
		
		char[] charArray = str.toCharArray();
		
		for (int i = charArray.length-1; i>=0; i--)
			
		{
			resultStr +=charArray[i];
		}
		return resultStr;
	}

}
