package com.neotech.lesson06;

public class LogicalAnd {
	
	
	public static void main(String[] args) {
		
		
		//Declare a number
		//if 1-10 - small
		//11-100 - medium
		// 101- 1000 - large
		
		int num = 1001;
		
		if (num >=1 && num <= 10)
		{System.out.println(num + " is small. ");
			
		}
		else if (num>10 && num <=100)
		{
			System.out.println(num + " is medium");
		}
		else if (num >100 && num <=1000) 
		{
			System.out.println(num + " is large");
		}
		
		else {System.out.println(num + " is out of range"); }
	}

}
