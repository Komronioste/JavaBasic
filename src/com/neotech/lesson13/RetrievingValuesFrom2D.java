package com.neotech.lesson13;

public class RetrievingValuesFrom2D {
	
	public static void main(String[] args) {
		
		
		String[][] animals = 	{
				
								{"cat","dog","bird"},
								{"tiger", "wolf", "lion", "bear"},
								{"salmon", "shrimp", "crab"}
								};
		
		for (int i = 0 ; i < animals.length; i++)
		{
			for (int j = 0; j<animals[i].length; j++)
			{
				System.out.print(animals[i][j] + ", ");
			}
		}
	
		
		//FOR-EACH LOOP
		
		for (String[] row: animals)  // this looks up number of arrays in the array. {}, {}, {},  && converting first from 2D to 1D
		{
			for (String col: row) // this one looks into the arrays which is row {}.  Extracting elements from 1D.
			{
				System.out.println(col+ " ");
			}
			
						}
	}

}
