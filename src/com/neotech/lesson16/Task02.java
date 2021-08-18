package com.neotech.lesson16;

public class Task02 {

	public static void main(String[] args) {

		String name = "KomronB";
		boolean ifEmpty = name.isEmpty();

		if (!ifEmpty) {
			if (name.length() % 2 != 0) {   // or use   *  && name.length() >=3 inside same condition. *
				if (name.length() >= 3) {
					System.out.println(name.charAt(name.length() / 2));
				}
			}
		}

	}

}
