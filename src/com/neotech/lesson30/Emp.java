package com.neotech.lesson30;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Emp {

	public static void main(String[] args) {
		
		
		Map<String, Integer> emp = new HashMap<>();
		emp.put("Alex", 50000);
		emp.put("Mike", 63000);
		emp.put("Kris", 37000);
		
		Set<Entry<String,Integer>> sal = emp.entrySet();
	Integer highest = 0;
		for (Entry<String, Integer> e : sal)
		{
			if(e.getValue() >highest)
			{
				highest = e.getValue();
			}
		}
		
	for (Entry<String,Integer> h : sal)
	{
		if(h.getValue() >= highest)
		{
			System.out.println(h.getKey() + " = " + h.getValue());
		}
	}
		

	}

}
