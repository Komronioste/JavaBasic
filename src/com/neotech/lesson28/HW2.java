package com.neotech.lesson28;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HW2 {

	public static void main(String[] args) {

Set<String> cities = new LinkedHashSet();

cities.add("DC");
cities.add("NYC");
cities.add("Miami");
cities.add("Knoxville");
cities.add("Tirana");
cities.add("Ankara");
System.out.println(cities);

for (String c : cities)
	System.out.print(c + " / ");
 
System.out.println();

Iterator<String> it = cities.iterator();


while(it.hasNext())
{
	String city = it.next();
	if (city.toUpperCase().startsWith("A"))
	{
	it.remove();
	}
	System.out.print(city + " - ");
}
	System.out.println();
System.out.println(cities);
		
	}

}
