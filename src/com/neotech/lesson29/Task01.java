package com.neotech.lesson29;

import java.util.HashMap;

public class Task01 {
	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hq = new HashMap();
		hq.put(1, "Google");
		hq.put(2, "Apple");
		hq.put(3, "Neotech");
		hq.put(4, "Microsoft");
		hq.put(3, "Disney");
		hq.put(5, "Disney");
		hq.put(7, "CocaCola");
		
		
		System.out.println(hq);
		System.out.println(hq.size());
		hq.replace(4, "Pepsi");
		hq.remove(7);
		
		System.out.println(hq);
		
		
		
	}

}
