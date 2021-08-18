package com.neotech.lesson13;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] cars =   { 
							{ "Ford", "Chevy", "Dodge"}, 
							{ "BMW", "WV", "Audi" },
							{ "Kia", "Hyundai" },
							{ "Lambo", "Porsche", "Ferrari", "Buggatti" } 
							};

		for (int i = 0; i < cars.length; i++) {
			for (int j = 0; j < cars[i].length; j++) {
				if (i == 0) {
					System.out.println("American: " + cars[i][j]);
				} else if (i == 1) {
					System.out.println("German: " + cars[i][j]);
				} else if (i == 2) {
					System.out.println("Korean: " + cars[i][j]);
				} else {
					System.out.println("Italian: " + cars[i][j]);
				}
			}
		}
		System.out.println("------------------");

		for (String[] vehicles : cars) {
			for (String a : vehicles) {
				System.out.print(a + " ");
			}
			System.out.println();
		}

	}

}
