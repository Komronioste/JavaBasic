package com.neotech.lesson29;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Homework02 {
	
	public static void main(String[] args) {
		
	

	TreeMap<String, String> ct = new TreeMap<>();
	
	
	ct.put("France", "Paris");
	ct.put("Kosovo", "Prishtina");
	ct.put("Turkey", "Ankara");
	ct.put("USA", "Washington DC");
	ct.put("Albania", "Tirana");
	ct.put("Italy", "Rome");
	
	//1.
	System.out.println(ct);
	//2.
	System.out.println(ct.containsKey("Albania"));
	System.out.println(ct.containsKey("Turkey"));
	//3.
	System.out.println(ct.containsValue("Paris"));
	System.out.println();
	//4.
	Set<String> c = ct.keySet();
	for (String cc : c)
		System.out.print(cc + " & ");
	//5.
	System.out.println();
	Collection<String> s = ct.values();
	
	Iterator<String> it = s.iterator();
	while(it.hasNext())
	{
		System.out.print(it.next() + " / ");
	}
	
	}

}
