package com.neotech.lesson11;

public class ArrayLength {

	public static void main(String[] args) {
		
		
		
		String[] students = new String[6]; //default value for strings is null and for integers is 0.
		
		students[0] = "Maryam";
		students[1] = "Ozel";
		students[2] = "Sahin";
		students[3] = "Ivonne";
//		students[4] = 
//		students[5] = 
		
		System.out.println(students[1]);
		
		// how to get length of the array
		
		int lengthOfStudentsArray = students.length;
		
		System.out.println("The length of the array is: " + lengthOfStudentsArray);
		
		//another way to declare arrays
		int[] scores = {50, 55, 89, 90, 67};  // length of array is 5.
		System.out.println(scores[2]);
		
		
		int a = scores.length;
		System.out.println(a);
		
	}
}
