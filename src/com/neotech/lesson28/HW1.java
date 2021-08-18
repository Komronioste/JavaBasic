package com.neotech.lesson28;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HW1 {

	public static void main(String[] args) {


		Set<String> countries = new TreeSet<>();

		countries.add("USA");
		countries.add("Russia");
		countries.add("Tajikistan");
		countries.add("Spain");
		
		System.out.println(countries);
		
		for(String c : countries)
		{
			System.out.print(c + " / ");
		}
		
		System.out.println();
		
		Iterator<String> it = countries.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next() + " \\ ");
		}
		
		
	}

}
