package com.neotech.lesson30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Task01 {

	public static void main(String[] args) {


		Map <String, Integer> cities = new TreeMap<>();
		
		
		cities.put("Moscow", 6);
		cities.put("DC", 2);
		cities.put("NYC", 3);
		cities.put("Alberqurque", 11);
		cities.put("BuenosAires", 11);
		cities.put("Paris", 5);
		
		
	
		
		System.out.println(cities);
		
//		Iterator<Entry<String, Integer>> en = cities.entrySet().iterator();   to make iterator of entries in one line *********************************
//		
//		
//		Set<String> longCity = cities.keySet();
//		
//		Iterator<String> it = longCity.iterator();
//		
//		while(it.hasNext())
//		{ String a = it.next();
//			 if ( a.length()>7)
//				it.remove(); 
//		}
//		System.out.println(longCity);
		
		Iterator<Entry<String, Integer>> it = cities.entrySet().iterator();
		
		
		while (it.hasNext()) {
			Entry<String, Integer> entry = it.next();
			if (entry.getValue() > 7) {
				it.remove();
			}
			else
				System.out.println(entry);
		}
		
		// checking if map was modified
		System.out.println(cities);
		


	}

}
