package com.neotech.lesson26;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		
		
		int[] numbers = new int[4];  // creates an array of size 4, which we cannot change
		
		ArrayList<String> names = new ArrayList<>();
		
		int size = names.size(); //size() returns the length of the arrayList object
		
		System.out.println("Size: " + size);
		
		names.add("Evis");
		names.add("Mehmet");
		names.add("Komron");
		names.add("Murat");
		
		System.out.println("New sieze: " + names.size());

		System.out.println(names);
		
		//remove element
				names.remove("Komron");
		
		System.out.println(names);
		
		//get element of index 1 and assign it to the String name
		String name = names.get(1);  // value of name is Mehmet now.
		
		System.out.println(name);  
		
		for ( int i = 0; i < names.size(); i++)
		{
			String element = names.get(i);  //instead of using [i] we use .get(i); a getter.
			System.out.println(element);
		}
		
	}

}
