package com.neotech.lesson09;

public class Task01 {

	public static void main(String[] args) {
		
//		1. Print numbers from 1 to 100 in 1 line with space
//		Print numbers from 100 to 1
//		Print even numbers from 20 to 1 (2 ways)
//		Print odd numbers between 20 and 50 (2 ways)
//		2. Write a program that the user to declare a positive integer.
//		It should then print the multiplication table of that number.

		for (int i = 1; i<=100; i++)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for (int j = 100; j>=1; j--)
		{
			System.out.print(j + " ");
		}
		
		System.out.println();
		for (int k = 21; k >=1; k--)
		
		{
			k--;
			System.out.print(k + " ");
		}
			
	}

}
