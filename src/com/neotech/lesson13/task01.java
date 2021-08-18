package com.neotech.lesson13;

public class task01 {

	public static void main(String[] args) {
		// Create a 2D array of integer type with 3 rows and 4 columns and print all values of the whole array.
	//	2.Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns. Develop a program which will identify/print the even numbers only.

		int[][] nums =  {
						{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12}
						};
		int rows = nums.length;
		int cols = nums[0].length;
		
		for (int i =0; i < nums.length;i++)
		{
			for (int j = 0; j<cols; j++)
			{
				System.out.println("Every number: " +nums[i][j]);
			}
		}
		
		for (int i =0; i < nums.length;i++)
		{
			for (int j = 0; j<cols; j++)
			{
				if (nums[i][j]%2==0)
				{
				System.out.println("Even number: " +nums[i][j]);
				}
			
			}
	}

}
}
