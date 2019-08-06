package programsofjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};


			List<Integer> arrayList = new ArrayList<Integer>();
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr2.length;j++) {
					if(arr1[i]==arr2[j]) {
						arrayList.add(arr2[j]);
					}
				}
			}
			Collections.sort(arrayList);
			System.out.println("Intersection of two arrays are: "+arrayList);

		}


	}

//Solution 2

/*
 * public static void main(String[] args) { List<Integer> firstList = new
 * ArrayList<Integer>(); for (int i : arr1) firstList.add(i);
 * 
 * List<Integer> secondList = new ArrayList<Integer>(); for (int i : arr2)
 * secondList.add(i);
 * 
 * firstList.retainAll(secondList); System.out.println(firstList);
 */