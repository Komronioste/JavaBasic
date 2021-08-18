package com.neotech.lesson17;

public class StringBufferDemo {

	public static void main(String[] args) {
	
		
		//When we want to change strings
		StringBuffer strBfr = new StringBuffer("Hello");  // way of declaring StringBuffer
		System.out.println(strBfr);
		
		//here we show this is mutable -- changable
		strBfr.append("World");  // adds the text to the string buffer. same as concat for string
		System.out.println(strBfr);
	
		System.out.println();
		System.out.println(strBfr.length());
		System.out.println(strBfr.reverse()); // method is applied and saved even if it is in sysout
		strBfr.reverse();
		
		System.out.println();
		
		String anotherStr = strBfr.substring(3, 8);
		System.out.println(anotherStr);
		
		StringBuilder strBldr = new StringBuilder("We are tired");
		strBldr.append(", but we dont stop.");
	}

}
