package com.neotech.lesson04;

public class PrimitiveCasting {

	
	public static void main(String[] args) {
		
		//smallest to biggest
		// byte>short>int>long>float>double
		
		double d1 = 7.5; //no casting/conversion
		System.out.println(d1);
		double d2 = 7;  // casting is happening
		System.out.println(d2); // will print out 7.0, because double contains decimals 
		
		
		//widening, or implicit casting, is done automatically.
		int num1 = 10;
		double d3 = num1;  // casting is converting from one data type to a different.
		System.out.println(d3);
		
		
		//narrowing, explicit casting, should be done manually.
		// int num2 = 7.9; // compile error. type mismatch, cannot convert from double to int.
		
		int num2 = (int) 7.9;
		System.out.println(num2); // will print 7 without decimal, because we told java that we want to store it as an integer.
		
		
		// byte b1 = 12345; wont work because byte cant contain such a big number
		byte b1 = (byte)12345; // narrowing, explicit casting, should be done manually.
		System.out.println(b1);
		
		
		System.out.println("****************");
		
		int i2 = 5;
		// byte b2 = i2; this wont work, still need to do manually
		byte b2 = (byte)i2; //may or may not lose data
		System.out.println(b2); //didnt lose any data, because 5 can fit in a byte.
		
		long long1 = 85;
	//	int number1 = long1; may lose data
		int number1 = (int) long1;
		System.out.println("long to int " + number1);
		
		//narrowing
		// you are trying to fit something big into a smaller container
		long long2 = 438947328947L;
		int int2 = (int)long2;
		System.out.println(int2); //will lose date
		
		//widening
		//if it is widening, it will happen automatically, no need to specify.
		int number3 = 195;
		float f3 = number3;
		System.out.println(f3);
		
		int num4 = 195;
		float f4 = (int) num4;
		
		System.out.println(f4); // also works, but no need.
		
		
		//store 5.84 in a byte
		// store 19 as a double
		
	    double d7 = 5.84;
	    byte b7 = (byte) d7;
	    System.out.println(b7);
	    
	    //or just do this.
	    	byte b9 = (byte)5.84;
	    	
		//widening, narrowing.
	    int int8 = 19;
	    double d8 = int8;
	    System.out.println(d8);
	    
	    
//	create a int variable named num1, assign value of 500
	    //store/assign num1 into byte name number2
	    
	   
	    
	    
	    
	    
	    
	    
		
	}
}
