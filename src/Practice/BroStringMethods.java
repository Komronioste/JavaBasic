package Practice;

public class BroStringMethods {
	public static void main(String[] args) {
	
		
		//String = a reference data type that can store one or more characters
		// 			reference data types have access to useful methods
		
		
		// .equals = means equals();, useful for boolean statements
		// .equalsIgnoreCase(); = means equal and NOT case-sensitive
		//.length(); = shows length of the variable value.  if value is Bro, it will yield 3.
		// .charAt(0); = will yield char at position 0 in the String value. name.charAt(1) will be r.
		// .indexOf(""); = will show position (index number) of given char in the string. need to specify in parentheses which char you looking for.
		// .isEmpty(); = used in boolean to see if the String is empty or not. will yield true or false.
		// .toUpperCase(); = changes variable to Upper Case.
		// .toLowerCase(); = changes to lower case
		// .trim(); = deletes empty spaces in the String value.
		// .replace('char to replace','new char'); = replaces that char in the string with a new char.
		
		
		
		String name = "Bro";
		
		boolean result = name.equalsIgnoreCase("Bro");     
		
		int a = name.length();
		
		
		System.out.println(result);
		System.out.println(a);
		
		char b = name.charAt(2);
		System.out.println(b);
		
		int c = name.indexOf("B");
		System.out.println(c);
		
		boolean d = name.isEmpty();
		System.out.println(d);
		
		String e = name.toUpperCase();
		System.out.println(e);
		
		String f = name.toLowerCase();
		System.out.println(f);
		
		String g = name.trim();
		System.out.println(g);
		
		String h = name.replace('o', '$');
		System.out.println(h);
		
		
		
	}

}
