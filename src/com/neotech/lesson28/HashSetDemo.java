package com.neotech.lesson28;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {


		HashSet<String> foodSet = new HashSet<>();
		foodSet.add("eggs");
		foodSet.add("bread");
		foodSet.add("nutella");
		foodSet.add("tea");

		foodSet.add("coffee");

		foodSet.add("eggs"); //doesnt accept duplicates

		foodSet.add("baklava");
		

		System.out.println(foodSet.size());
		System.out.println(foodSet);
		
		Iterator<String> it = foodSet.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("---------------");
		
		for(String element: foodSet)
		{
			System.out.println(element);
		}

	}

}
