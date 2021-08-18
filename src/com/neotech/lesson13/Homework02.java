package com.neotech.lesson13;

public class Homework02 {

	public static void main(String[] args) {

		int[] num = { 1, 2000, 9, 100, 10, 700, 4200,3000, -999,0, -8230 };

		int smallest = num[0];
		int largest = num[0];
		int secondLargest = num[0];

		for (int i = 0; i < num.length; i++) {
			
			 if (largest < num[i]) {
				 secondLargest = largest;
				 largest = num[i];
					
				}
			 else if (num[i]>secondLargest && num[i] != largest)
				{
					secondLargest = num[i];
				}
			
			if (smallest > num[i]) {
				smallest = num[i];
			}
			

		

		}
		
//		for (int i = 0; i < num.length; i++)
//			
//			if (secondLargest < num[i] && num[i] < largest)
//			{
//				secondLargest = num[i];
//			}	
	

		System.out.println("smallest number is: " + smallest);
		System.out.println("largest number is: " + largest);
		System.out.println("second largest number is: " + secondLargest);

	}

}
