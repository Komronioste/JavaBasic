package com.neotech.lesson17;

public class Homework01 {

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("Sunday");
		System.out.println(str.reverse());
		
		String str1 = "Sunday";
		char[] str2 = str1.toCharArray();
		
		for (int i = str2.length-1; i>=0; i--)
		{
			System.out.print(str2[i]);
		}
		System.out.println();
		
		for (int i = str1.length()-1; i>=0; i--)
		{
			System.out.print(str1.charAt(i));
		}
		System.out.println();
		System.out.println("------------------");
	
	

		
		
 }
		
		}
	


