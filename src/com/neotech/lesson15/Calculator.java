package com.neotech.lesson15;

public class Calculator {
	
	
	//This method will accept two numbers (as parameters)
	// And will print the sum
	void add(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}

	//this method will accept two numbers as parameters and will print multiplication
	void multiply(int num1, int num2)
	{
		System.out.println(num1*num2);
	}
	
	void division(double a, double b) {
		
		System.out.println("I will divide " + a + " b " + b);
		double result = a/b;
		System.out.println("The result is " + result);
	}
	
	void larger (int a, int b )
	{
		if ( a > b)
		{
			System.out.println(a + " is larger");
		}
		else 
		{
			System.out.println(b + " is larger");
		}
	}
	
	void evenOrOdd (int c)
	{
		if (c%2==0)
		{
			System.out.println(c + " is even");
		}
		else
		{
			System.out.println(c + " is odd");
		}
	}
	
}
