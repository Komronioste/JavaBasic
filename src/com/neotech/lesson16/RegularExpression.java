package com.neotech.lesson16;

public class RegularExpression {

	public static void main(String[] args) {
		
		String greeting = "Good morning";
		
		
		//replace() - will replace all instances of given parameter to a new parameter. 
		String newGreet = greeting.replace('o', 'u'); // will replace all o's in the string with u's.
		System.out.println(newGreet);
		
		String otherGreet = greeting.replace("morning", "afternoon");
		System.out.println(otherGreet);
		
		String lastGreet = greeting.replace("evening", "afternoon"); // will not replace anything, because there is no evening in greeting.
		System.out.println(lastGreet);
		
		//replaceAll()
		
		String combo = "My phone # is 32183723";
		String newCombo = combo.replaceAll("[0-9]", "*"); // we telling this method to chance all numbers from 0-9 to *
		System.out.println(newCombo);
		
		String a = combo.replaceAll("[a-z]", "+"); //will replace all lower case letters to +
		System.out.println(a);
		
		String b = combo.replaceAll("[A-Z]", "^"); //will replace all upper case letters to ^
		System.out.println(b);
		
		String komronIsTheBest = combo.replaceAll("[^0-9]", "&");  // ^ means NOT. so will replace anything that is not a number with "&"
		System.out.println(komronIsTheBest);
		
		String c = combo.replaceAll("[0-9a-z]", " "); // will remove anything that is a number or a letter, replace with " " aka space
		System.out.println(c);
	}
}
