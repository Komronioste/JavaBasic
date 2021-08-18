package com.neotech.lesson17;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String sentence = "Today is Thursday and I have Java class.";
		String[] result = sentence.split(" "); // splits the string every time it encounters a space and stores it in array. It also deletes the mentioned argument.!!!!!!!!!!!!!!
		
		for (String word: result)
		{
			System.out.println(word);  
		}
		
		//How many words are there in the sentence.
		System.out.println();
		
		System.out.println("The sentence has " + result.length + " words");
		
//		String[] array = sentence.split("a");
//		for ( String str : array) {
//			System.out.println(str); }
			
			for ( int i = result.length-1; i>=0; i-- )
			{
				System.out.print(result[i] + "|");
			}
		}
	}


