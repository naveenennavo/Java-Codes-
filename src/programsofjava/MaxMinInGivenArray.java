package programsofjava;

import java.util.Arrays;
import java.util.Collections;

public class MaxMinInGivenArray {

	public static void main(String[] args) {
		Integer[] array = {-1,0,1, 45, 77, 88, 33, 23, 4,123334,2345};

		
		
			Integer max = Collections.max(Arrays.asList(array));
			System.out.println("Maximum array of number is "+max);
			Integer min = Collections.min(Arrays.asList(array));
			System.out.println("Minimum array of number is "+min);
		
	}

}



//Solution 2 //  // Simple and efficient (when the array size is bigger in count)

/*
 * Arrays.sort(array); System.out.println("Minimum number in Array "+array[0]);
 * System.out.println("Maximum number in Array "+array[array.length-1]);
 */

//Solution 3 

/*
 * int smallNumber =array[0]; int largestNumber =array[0]; for (int i = 0; i <
 * array.length; i++) { if (array[i]> largestNumber ) { largestNumber =
 * array[i]; } else if (array[i]<smallNumber) { smallNumber = array[i]; } }
 * System.out.println("Maximum array of number is "+largestNumber);
 * System.out.println("Minimum array of number is "+smallNumber); }
 */