package com.neotech.lesson10;

public class Homework01 {

	public static void main(String[] args) {
		

		
		// Write a program using while loop that calculates the sum of even numbers between 0-10.
		
		int sum = 0;
	
		int num=0;
		
		while (num<=10)
		{
			sum+=num;
			num+=2;
			
		}
		
		System.out.println(sum);
		
		///////////////////////////// OR ///////////////////////////////////////////////
		
		int j =0;
		int add= 0;
		
		while (j<=10)
		{
			j++;
			if (j%2==0)
			{add+=j;}
			
		}
		
		System.out.println(add);
	}

}
