package programsofjava;

import java.util.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};

			if (data.length < 2) { 
				System.out.println(" Invalid Input "); 
			} else {
				Arrays.sort(data); // useful it is not sorted
				System.out.println(data[1]);
			}
		}


	}

// solution 2
/*
 * if (data.length < 2) { System.out.println(" Invalid Input "); } else {
 * 
 * int smallest = Integer.MAX_VALUE; int secondSmallest = Integer.MAX_VALUE; for
 * (int i = 0; i < data.length; i++) { if (data[i] < smallest) { secondSmallest
 * = smallest; smallest = data[i]; } else if (data[i] < secondSmallest) {
 * secondSmallest = data[i]; } }
 * 
 * System.out.println("The smallest element is: " + smallest + " and "+
 * "the second smallest element is: " + secondSmallest); }
 * 
 * }
 */