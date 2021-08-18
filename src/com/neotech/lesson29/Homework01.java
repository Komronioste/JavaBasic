package com.neotech.lesson29;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Homework01 {

	public static void main(String[] args) {


		Map<String, Integer> cars = new LinkedHashMap<>();
		cars.put("BMW", 2);
		cars.put("Mercedes", 3);
		cars.put("Audi", 3);
		cars.put("Ferrari", 17);
		
		//1. 
		System.out.println(cars.size());
		//2.
		cars.replace("Audi", 5);
		System.out.println(cars);
		//3.
		cars.put("Tesla", 2);
		//4.
		System.out.println(cars.get("Ferrari"));
		//5.
		System.out.println(cars.containsKey("Honda"));
		//6.
		cars.remove("Mercedes");
		System.out.println(cars);
		//7.
		Set<String> st = cars.keySet();
		for (String s : st)
			System.out.print(s + " * ");
		System.out.println(cars);

	}

}
