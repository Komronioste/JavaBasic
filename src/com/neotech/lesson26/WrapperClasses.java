package com.neotech.lesson26;

public class WrapperClasses {

	public static void main(String[] args) {


		int a = 10;
		
		//autoboxing  --
		Integer b = 10;   
		
		Integer c = new Integer(10); //boxing -- putting a primitive type int into an Integer object
		
		//unboxing -- putting the value of an Integer object to an int primitive type
		int d = b.intValue();
		
		//automatic unboxing
		int e = b;
		
	
		// c amd b are objects of type Integer
		// a and d and e are primitive data types
		
		Boolean bool = true; // auto boxing
		
		int num =15;
		Integer num1 = num;
		
		Byte b1 = 25; //byte Object, auto boxing
		
		byte b2 = b1; // unboxing Byte object into a byte
		
		Double d1 = 2.45; // auto boxing
		
		Character c1 = new Character('T'); // boxing
		Character c2 = 'T'; // autoboxing -- short way
		
	}

}
