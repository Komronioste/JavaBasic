package com.neotech.lesson30;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Homework02 {

	public static void main(String[] args) {
		
		Set<String> con = new LinkedHashSet<>();
		con.add("John");
		con.add("Andrew");
		con.add("Alice");
		con.add("Mary");
		System.out.println(con);
		
		Iterator<String> it = con.iterator();
		
		while(it.hasNext())
			System.out.println(it.next() + " & " + it.next() + " & " + it.next() + " & " + it.next());

	}

}
