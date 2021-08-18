package com.neotech.lesson20;

public class ThisKeyword {
	
	int a, b;

	public ThisKeyword(int a, int b)
	{
		this.a = a;
		this.b = b;
	
	}

	void sum()
	{
		int sum = a+b;
		
		System.out.println("The sum is: " + sum);
	}
	
	public static void main(String[] args) {
		
		ThisKeyword obj = new ThisKeyword(4,3);
		obj.sum();
		
	

	}

}
