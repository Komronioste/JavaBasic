package com.neotech.lesson29;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class OtherMap {

	public static void main(String[] args) {


		//create a map with groceries
		
		Map<String, Integer> groceries = new TreeMap<>();
		
		groceries.put("Milk", 2);
		groceries.put("Bread", 4);
		groceries.put("Egg", 1);
		groceries.put("Egg", 2);
		groceries.put("Oil", 3);

		System.out.println(groceries);
		System.out.println(groceries.get("Egg"));
		
		// get all the keys of the map and put them in a set
		//.keySet() used to make a Set out of keys
		Set<String> allKeys =	groceries.keySet();
		System.out.println("All keys of the map: " + allKeys);
		
		Collection<Integer> allValues =	groceries.values();
		System.out.println("All values: " + allValues);
		
	
		
		

	}

}
