package com.neotech.lesson13;

public class Array2DForEachLoopInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][] point =	{
							{90,67,88,56},
							{85, 45, 90},
							{100,99,55,87,65}
							};
		
		for (int[] row : point)
		{
			for (int cols: row)
			{
				System.out.print(cols+ " ");
			}
			System.out.println();
		}
	}

}
