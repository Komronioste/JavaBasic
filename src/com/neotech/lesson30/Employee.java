package com.neotech.lesson30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Employee {

	public String name;

	Employee(String name) {
		this.name = name;
	}

	void printInfo() {
		System.out.println(name);
	}

	public static void main(String[] args) {

		Map<Employee, Integer> work = new HashMap<>();
		work.put(new Employee("Andrew"), 4897234);
		work.put(new Employee("John"), 3213213);
		work.put(new Employee("Alice"), 1823213);
		work.put(new Employee("Donald"), 67000
				);

		Set<Entry<Employee, Integer>> set = work.entrySet();

		Iterator<Entry<Employee, Integer>> it = set.iterator();
		int highest = 0;
		while (it.hasNext()) {
			Entry biggest = it.next();

			if ((int) biggest.getValue() >= highest) {
				highest = (int) biggest.getValue();

			}

		}
		Iterator<Entry<Employee, Integer>> it2 = set.iterator();
		while (it2.hasNext()) {
			Entry<Employee, Integer> topEarner = it2.next();

			if ((int) topEarner.getValue() >= highest) {
				System.out.println(topEarner.getKey().name + " = " + topEarner.getValue());
			}

		}

		

	}
}
