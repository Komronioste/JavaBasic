package com.neotech.lesson28;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetFamily {

	public static void main(String[] args) {


		Set<String> veggies = new HashSet<>();
		veggies.add("potato");
		veggies.add("avocado");
		veggies.add("tomato");
		veggies.add("eggplant");
		veggies.add("potato");
		System.out.println(veggies);
		
		Set<String> fruits = new LinkedHashSet<>();
		fruits.add("Apple");
		fruits.add("Potato");
		fruits.add("Apple");
		fruits.add("Banana");
		System.out.println(fruits);
		
		Set<String> food = new TreeSet<>();
		food.add("potato");
		food.add("avocado");
		food.add("tomato");
	food.add("eggplant");
	food.add("potato");
	System.out.println(food);
		
		
	}

}
