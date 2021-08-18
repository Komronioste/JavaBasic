package com.neotech.lesson02;

public class VariableDeclaration {

	public static void main(String[] args) {
		
		//creating and storing values into a variable
		//1st way. Declaring a variable and assigning a value
		
		/*
		 * 1. data type is int
		 * 2. name/identifier is number
		 * 3. value that we are storing is 30
		 */
		int number = 30;
		
		//2nd way. 
		
		short var3; //1st step is declaring/naming/identifiying variable
		var3 = 74; //2nd step is assigning a value to the variable
		
		//3rd way.
		char char1, char2, char3; //declaring multiple variables
		char1 = 'b';
		char2 = 'j';
		char3 = '$';
	var3 = 123;  //reassigning value to the existing variable but not declaring a new variable
	
	
		System.out.println(number);
		System.out.println(char1);
		System.out.println(var3);
		System.out.println(char2);
		System.out.println(char3);
	}
}
