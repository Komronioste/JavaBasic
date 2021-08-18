package com.neotech.lesson26;

import java.util.ArrayList;

public class ArrayListTask {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();

		names.add("James");
		names.add("John");
		names.add("Jon");
		names.add("Jamie");
		names.add("Jonathan");

		System.out.println(names.isEmpty());
		System.out.println(names.contains("Komron"));
		System.out.println(names);
		System.out.println(names.size());

		for (String all : names) {
			System.out.println(all);
		}

	}

}
