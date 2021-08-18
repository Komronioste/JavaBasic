
public class PreIncrementAndPostIncrement {

	public static void main(String[] args) {
	
		
		
		int x;
		
		int y = 10;
		
		x =y++;  //postincrement
		
		System.out.println(x);   // 10   if it is post increment, y increases after getting its value to x, so x is 10, y is 11.
		System.out.println(y);   // 11
		
		
		int a;
		int b = 15;
		
		a = ++b;  // pre increment, it increases number first, then runs the equation of a=b, so both are 16
		a = ++b;
		
		
		System.out.println(a);
		System.out.println(b);
	}

}
