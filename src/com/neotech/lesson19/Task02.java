package com.neotech.lesson19;

public class Task02 {

	public static void reverse(String b) {
		for (int i = b.length() - 1; i >= 0; i--) {
			char[] c = b.toCharArray();
			System.out.print(c[i]);
		}

	}

	public static void main(String[] args) {

		Task02 task = new Task02();

		String str = "Neotech is good";

		Task02.reverse(str);

		System.out.println();

		Task02.reverse(str);
		// OR
		reverse(str);

	}

}
