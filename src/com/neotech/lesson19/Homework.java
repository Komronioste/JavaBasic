package com.neotech.lesson19;

public class Homework {

	private static String word(String a) {
		String vowels;

		vowels = a.replaceAll("[^aouieAOUIE]", "");

		return vowels;
	}

	public static void main(String[] args) {

		String str = "I Love you";

		System.out.println(word(str));
		
	

	}

}
