package com.neotech.lesson13;

public class LargestNumber {

	public static void main(String[] args) {
		
		//How to find the largest number in an array?
		
		
		
		int[] numbers = {25,130,2456,20,50,35,-10};
		
		int largest = numbers[0];
		
		for (int i =0; i<numbers.length; i++)
		{
			if (largest<numbers[i])
			{
				largest=numbers[i];   // if largest is smaller than next number, please update largest to new number
			}
		}
		System.out.println("largest " + largest);
		
		System.out.println("------------------------------");
		
		int smallest = numbers[0];
		
		for (int i = 0; i<numbers.length; i++)
		{
			if (smallest>numbers[i])
				smallest=numbers[i];
		}
System.out.println("smallest " + smallest);
	}

}
