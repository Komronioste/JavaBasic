package com.neotech.lesson33;

import java.util.ArrayList;

public class Homework {

	public static String word;
static	char indexChar;
	
	
	
	public static ArrayList<Exception> exc(Exception ArrayIndexOutOfBoundsException, char indexChar, String word)
	{
		
		ArrayList<Exception> exceps = new ArrayList<>();

try {
	
char inWord = word.charAt(indexChar);
System.out.println(inWord);
	
	
}
catch(ArrayIndexOutOfBoundsException a)
{
	System.out.println("you are out of bound");
}
		
exceps.add(ArrayIndexOutOfBoundsException);
		
		
		return exceps;
	}
	
	
	public static void main(String[] args) {


//	Exception e =  exc( Exception ArrayIndexOutOfBoundsException, 12, "hello");
		
		
	}

}
