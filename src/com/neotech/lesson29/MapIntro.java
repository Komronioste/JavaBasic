package com.neotech.lesson29;

import java.util.HashMap;

public class MapIntro {
	
	
	

	

	public static void main(String[] args) {

				// key  , value
		HashMap<Integer, String> map = new HashMap<>();
		System.out.println("Size before adding elements: " + map.size());
		
		//for maps we do not use .add(), we use put.();
		
		map.put(0, "Hakan");
		map.put(10, "Komron");
		map.put(5, "Murat");
		map.put(5, "Shodmon"); // since key is repeated, it will override
		map.put(27, "Murat");
		
		System.out.println(map);
		boolean empty = map.isEmpty();
		System.out.println("Is the map empty: " + empty);
		
	//	map.put("1", "Ivonne"); compilation error will tell us it has to be Integer, String,  not String, String
		
		map.put(7, "Flori"); // we can have duplicate values
		
		System.out.println(map);
		
		String name = map.get(0); //accepts key as argument
		System.out.println("name is: " + name);
		
		map.remove(0); // remove using key
		System.out.println(map);
		
		//how do we replace a pair
		System.out.println("replacing a pair");
		map.replace(5, "Sabah");
		System.out.println(map);
		
		//Contains . can be used by both value or key
		
		System.out.println("Does the map contain key 27 " + map.containsKey(27));
		System.out.println("Does the map contain Sabay: " + map.containsValue("Sabah"));
		
		
	}

}
