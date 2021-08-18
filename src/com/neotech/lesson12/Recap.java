package com.neotech.lesson12;

public class Recap {

	public static void main(String[] args) {
		
		
		int[] grades = {100, 85, 87, 99, 93};
		
		int total = (grades[0]+grades[1]+grades[2]+grades[3]+grades[4]);  //sum of values
		System.out.println("sum of grades is: " + total);

		int average = (grades[0]+grades[1]+grades[2]+grades[3]+grades[4])/5;  //average of values
		System.out.println(average);
		
		
		//we can use for loop to get sum and average
		
		int sum =0;
		for (int i = 0; i < grades.length; i++)
		{
			sum+=grades[i];
		}
		System.out.println("sum is "+ sum);
		System.out.println("average is " + sum/grades.length);
		
		
		
		System.out.println("-------------------------------------");
	
	String[] cities = {"Tirana", "Ankara", "Dushanbe", "DC", "Moscow"};
	int length = cities.length;
	
	System.out.println("The last city in the array is "+ cities[length-1]);
	
	System.out.println("----------------------------");
	
	//to print all values of an array, we should run for loop from 0 to .length.
	
	for (int j = 0; j<cities.length; j++)
	{
		System.out.println(cities[j]);
				
	}
	
	
	// To print in reverse we have to run the loop from length to 0.
	// in reverse we should do index = .length-1 because if we do just .length without -1, it will be out of bound.
	
	for (int j = cities.length-1; j>=0; j--)
	{
		System.out.println(cities[j]);
	}
	
	
	
	
	
	
	
	}
	
	

}
