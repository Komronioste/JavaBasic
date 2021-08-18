package com.neotech.lesson11;

public class Lesson11Homework02 {

	public static void main(String[] args) {
		
		
		int num[] = {5,23,7,15,10,27};
		int sum = 0;
		int a = num.length;
		
		for (int i = 0; i<a; i++)
			
		{
			sum+=num[i];
		}
		
		System.out.println("Sum of all digits in the array is: " + sum + "!");
	}

}
