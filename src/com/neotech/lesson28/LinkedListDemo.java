package com.neotech.lesson28;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {


		//We Will create a LinkedList to store String objects
		//ArrayList<String> names = new ArrayList<>();
		LinkedList<String> names = new LinkedList<>();
		
names.add("Komron");
names.add("Hakan");
names.add("Mufasa");
names.add(1, "Murat"); // will add Murat to index 1 and shift other elements forward



int size = names.size();
System.out.println("The size of the list is: " + size);
System.out.println(names);

for (int i = 0; i < size; i++)
{
	System.out.println(names.get(i));
}

System.out.println(" ");

for (String element : names)
	System.out.println(element);

System.out.println();

Iterator<String> it = names.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}

	}

}
