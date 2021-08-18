package com.neotech.lesson02;

public class PrimitiveDataTypes
{
	
	public static void main(String[] args) {
		
		
		//There are 8 primitive data types in Java
		//to store whole numbers - byte, short, int, long
		
		byte var1 = -15; //the range is from -128 to 127, total of 256 different values. cannot holder larger numbers
		//compiler, java, will give an error if a bigger number is used
		
		short varShort = 4324; // range of short is from -32768 to 32767. cannot store decimals
		
		int var3 = 76456; // range from more than -2billion up to 2billion
		
		//cannot use same identifiers in same code
		
		long number = 5839045L;  // if you want to store value greater than 2billion, you have to add L or l in the end
		
		double var5 = 555.4343243; // best to store decimals
		
		float number2 = 3.5F; // need to use F or f in the end. Float rounds to nearest number after 5th digit
		
		// to store a single character use char
		char var10 = 'k';
		char var11 = 'K';		// char values should be in single quotation marks
		char var12 = '$';
		char var13 = ' ';
		char var14 = '9';
				
				// to store boolean values (true or false)
		
		boolean b = true;
		// I cannot use public as a variable name as it is a special keyword
		//datatype name = value;
				
		}

} 
