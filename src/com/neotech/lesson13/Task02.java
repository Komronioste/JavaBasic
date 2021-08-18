package com.neotech.lesson13;

public class Task02 {

	public static void main(String[] args) {
	
		
		
		
		// Task 3. Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.
	//		Use for loops and enhanced for loops

		int[][]nums = 	{
						{1,2,3},
						{4,5,6},
						{7,8,9}
						};
int sum = 0;
		for ( int i = 0; i<nums.length; i++)
		{
			for (int j = 0; j < nums.length;j++)
				sum+=nums[i][j];
		}
		
		System.out.println("Sum is " +sum);
		
		System.out.println("-----------------------------");
		
		int total = 0;
		for (int[] num: nums)
		{
			for (int num1: num)
			{
				total+=num1;
			}
			
		}
		System.out.println("Total is " + total);
	}

}
