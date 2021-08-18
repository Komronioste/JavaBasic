package com.neotech.lesson30;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntry {

	public static void main(String[] args) {
		
		
		Map <String, Integer> months = new LinkedHashMap<>();
		
		

		months.put("January", 15);
		months.put("February", 12);
		months.put("March", 3);
		months.put("April", 5);
		
		//Entry
		//Used to access pairs/entries of a map
		
		Set<Entry<String, Integer>> entries = months.entrySet();   // .entrySet()
		
		
		for (Entry e : entries)
		{
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		
		
		
	}

	

}
