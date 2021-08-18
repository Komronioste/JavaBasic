package com.neotech.lesson03;

public class StringConcatenation {
	
	public static void main(String[] args) {
		
		String language = "Java";
		System.out.println("I love" + language + "class");
		
		String s1 = "I love "; // space after I love  so in the print line it will have spacing
		String s2 = " class!"; // space before class, so it has space before it in println
		
		System.out.println(s1 + language + s2);
		
		
		String s3 = "I have " + 2;
		
		System.out.println(s3);
		
		String s4 = s3 + 4;
		
		String two = "2";
		String four = "4";
		
		System.out.println(222+333);
		
		//order of operations in a string
		
		System.out.println("I have " + 2 + 4 + " apples!"); // since it's string + number it will be a string, and 2+4 will yield 24
		
		System.out.println(s1  + (2+4) + " apples!"); // as in algebra, parentheses are compiled first, then the rest, so it will add 2+4=6
		
		System.out.println("     Spacing!!"); // if spaces are in the string, they will print, if they are outside, 
		System.out.println(    "Spacing!!"); // they wont
	}
	

}
