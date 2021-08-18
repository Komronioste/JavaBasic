package com.neotech.lesson15;

public class MathClass {

	public static void main(String[] args) {
	
		Calculator calc = new Calculator();
		
		System.out.println("Addition");
		
		calc.add(3, 5);
		
		calc.add(300,70);
		
		calc.multiply(4, 0);  //order of values is important.
		
	//	calc.multiply(1.5, 2); won't work. it expects two integers and no doubles
		
		calc.division(3, 5.50); //even though we need two doubles, automatic casting will happen so we can use int instead of double
		
		calc.larger(1, 2);
		
		calc.evenOrOdd(16);
		
	}

}
