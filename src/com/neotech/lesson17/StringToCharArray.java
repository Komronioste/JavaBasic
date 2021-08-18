package com.neotech.lesson17;

public class StringToCharArray {

	public static void main(String[] args) {

		//toCharArray(); == >Will get every char out of a string and will store it to an array.
		
		String str = "Today is Thursday and I have Java Class";
		char[] charArray = str.toCharArray();
		
//		for (char c: charArray)
//		{
//			System.out.print("[" + c + "]");
//		}
//		
//		System.out.println();
//		System.out.println("The length of the string is " + str.length());
//		System.out.println("The length of the char array is " + charArray.length);
//		
//		for (int i = charArray.length-1; i >= 0 ; i--)
//		{
//			System.out.print("[" + charArray[i] + "]");
//		}
//		System.out.println();
//		
		String string = "Yay. It is Saturday. Is it raining. Take your umbrella.";
		String[] sentence = string.split("[.?!]");  //regular expression [.!?] means every time there is dot, question or exclamation mark.
		for (String d : sentence)
		{
			System.out.print(d);
		}
		System.out.println();
		System.out.println(sentence.length);
		
		System.out.println("\"Komron\"");
		
		String s = "abc abbc afc afgc";
		String s2 = s.replaceAll("[a?c]", "+");  // means something that starts with a and ends with c but has whatever in between a and c. if true, replace a and c.
		System.out.println(s2);
		
		String str2 = "Yay? Is it Saturday? Is it raining? Take umbrella?";
		String[] str3= str2.split("\\?");   //   \ - escape character in java. tell java that there is a special character after it. Regular expressions need two \\
		
		String t = "hello everyone";
		String g = t.replace('e', '*');
		
		
	}

}
