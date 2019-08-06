package programsofjava;

public class SwappingWithoutVariable {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
			System.out.println("Before swap:");
			System.out.println("x value: "+x);
			System.out.println("y value: "+y);
			x=x^y;
			y=x^y;
			x=x^y;
			System.out.println("After swap:");
			System.out.println("x value: "+x);
			System.out.println("y value: "+y);
		}

	}




// Solution 2

//swapping without temp variable
/*
 * System.out.println("Before swap:"); System.out.println("x value: "+x);
 * System.out.println("y value: "+y); x = x*y; y = x/y; x = x/y;
 * System.out.println("After swap:"); System.out.println("x value: "+x);
 * System.out.println("y value: "+y);
 */


//Solution 3

//swapping without 3rd variable

/*
 * System.out.println("Before swap:"); System.out.println("x value: "+x);
 * System.out.println("y value: "+y); x = x+y; y=x-y; x=x-y;
 * System.out.println("After swap:"); System.out.println("x value: "+x);
 * System.out.println("y value: "+y);
 */