package com.neotech.lesson11;

public class PrintArrays {

	public static void main(String[] args) {
		
		
		int[] a = {90, 46,98,67,43,56,100,89};

		
		
		//printing one
		System.out.println(a[0]);
		
		int length = a.length;     // need to declare length of the array as name.length;
		
		//to print all values in a array, the loop must start at 0 and must end at length -1.
		for ( int i = 0; i < length; i++)   				  //either < length, or <= length-1;
								// since i is 0, we first print index 0
								// if i is 1, we print index 1
		{
			System.out.print(a[i] + " ");
		}
		
		
		
		// get the sum of all elements in an array
		// get average of all elements in an array
		
	}

}
