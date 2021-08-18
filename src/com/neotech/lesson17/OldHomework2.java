package com.neotech.lesson17;

public class OldHomework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hellozaza1234$%^&World679";
		
		String str2 = str.replaceAll("[^a-zA-Z]", "");  //will replace everything that is not a letter into empty.
		System.out.println(str2.length());
		System.out.println(str2);

	}

}
