package com.neotech.lesson12;

public class TwoDimensionalArrayLength {

	public static void main(String[] args) {
		
		
		String[][] months = {{"December", "January","February"}, {"March", "April", "May"}, {"June", "July", "August"},
				{"September", "October", "November"}};
		
		int rows = months.length;
		
		System.out.println("rows-->> "+rows);
		
		int lengthOfRowIndex1 = months[1].length;
		
		System.out.println("Length of Rows Index 1 >>" + lengthOfRowIndex1);
				
		
		
		
		String[][] groceries = {{"cucumber", "tomatoes", "potatoes", "carrot", "onion"}, {"mango", "apple", "banana"}};
		
		System.out.println(groceries.length); // length of rows , so will print 2, since there are two arrays.
		
		System.out.println(groceries[0].length); // length of columns, will print 5, since there are 5 elements in that array
		
		
		
	}

}
