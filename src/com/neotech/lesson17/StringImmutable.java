package com.neotech.lesson17;

public class StringImmutable {

	public static void main(String[] args) {
	
		
		// String are immutable = not changable!!!
		
		String str = "Hello";
		str.concat("World");  // str didnt change
		str = str.concat("World"); // str changed
		System.out.println(str);
	}

}
