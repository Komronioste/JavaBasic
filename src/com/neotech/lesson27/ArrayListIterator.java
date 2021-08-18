package com.neotech.lesson27;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {


		ArrayList<String> choco = new ArrayList<>();
		
		
		choco.add("Kinder");
		choco.add("Hershey");
		choco.add("Godiva");
		choco.add("Snickers");
		
		
		
		ArrayList<String> sweets = new ArrayList<>();
		sweets.add("ice cream");
		sweets.add("cheese cake");
		
		sweets.addAll(choco); // by default, puts all objects of *choco* ArrayList, at the end of the sweets ArrayList
		
		System.out.println("The size of the sweets arrayList is: " + sweets.size());
		System.out.println(sweets);
		
		
		
		Iterator<String> it = sweets.iterator();  //import java.util.iterator
		
	
		//1 direction
		while (it.hasNext())
		{
			String str = it.next();
		//	String str2 = it.next();  this will get different element from str, because iterator already moved.
			System.out.print(str + " - ");
			
			if (str.equals("ice cream"))
				it.remove();												//remove current element from the iterator
		}
		System.out.println();
System.out.println(sweets);
	}

}
