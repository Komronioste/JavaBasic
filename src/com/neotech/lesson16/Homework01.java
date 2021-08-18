package com.neotech.lesson16;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		
		String sentence = "   Hello my name is    Komron     ";
		String sentence1 = sentence.replaceAll(" ", "");
		System.out.println(sentence1);
		
		System.out.println("------------------------------");
		
		String combo = "I live @ 22041 zip code";
		String lettersOnly = combo.replaceAll("[^a-zA-z]", "");
		System.out.println(lettersOnly.length());
		
		System.out.println("------------------------------");

		Scanner scan = new Scanner(System.in);
				
		System.out.println("Enter father's name");
		String dadName = scan.next();
		System.out.println("Enter mother's name");
		String momName = scan.next();
		
		boolean boy = false;
		
		if (boy)
		{
			String boyName = (dadName.substring(0, dadName.length()/2)) + (momName.substring(momName.length()/2));
			System.out.println(boyName);
		}
		
		else {
			String girlName = (momName.substring(0, dadName.length()/2)) + (dadName.substring(momName.length()/2));
			System.out.println(girlName);
		}
		scan.close();
		
	}

}
