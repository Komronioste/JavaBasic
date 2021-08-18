package com.neotech.lesson19;

public class Task01 {

	
	
	 int sumMethod (int[] array)
	{
		int sum = 0; 
		for ( int b : array)
		{
			sum+=b;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Task01 task = new Task01();
		
		int[] arr = {4,3,2,1,4,5};
		
		System.out.println("The sum of all elements in the array is: " + task.sumMethod(arr));
		
		
		
		

	}

}
