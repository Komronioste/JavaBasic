package com.neotech.lesson15;

public class CalculatorWithReturn {

	int add (int a, int b) {
		
		int sum = a+b;
		return sum;
	}
	
	int multiply (int a, int b) {
		
		return a*b;
	}
	
	double divide (double a, double b)   //this method will get two numbers and wll return the division
	{
		double result = a/b;
		return result;
	}
	
	int giveMeBackSmth()
	{ 	System.out.println("I am inside giveMeBackSmth");
		return 3; }
	void dontGiveMeBack()
	{
		System.out.println("I am inside dontGiveMe");
	}
	//	/---------------------------------------------
	
	public static void main(String[] args) {
		
		CalculatorWithReturn calc = new CalculatorWithReturn();
		
	 int result = calc.add(5, 10);
	 System.out.println(result);
	 
	 int result2 = calc.multiply(5, 4);
	 System.out.println(result2);
			 
	 double result3 = calc.divide(9, 2);
	 System.out.println(result3);
	 
	 int var1 = calc.giveMeBackSmth();
	 calc.dontGiveMeBack();
	 
	}
	
}
