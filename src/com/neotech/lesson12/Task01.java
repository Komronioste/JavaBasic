package com.neotech.lesson12;

public class Task01 {

	public static void main(String[] args) {
	
		
		int num[] = {4,3,2};
		int sum = 0;
		for (int i = 0; i<num.length; i++)
		{
			sum+=num[i];
		}
			System.out.println(sum);
			
			int total = 0;
			for (int a: num)
			{
			total+=a;
			}
		
		System.out.println("total is " + total);
		
	}

}
