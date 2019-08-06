package programsofjava;

import java.util.Arrays;

public class Duplicate {

	public static void main(String[] args) {
		int[] data= {1,3,8,3,11,5,6,4,7,6,7};

	
			Arrays.sort(data);
			for (int i = 0; i < data.length -1 ; i++) {
				if(data[i] == data[i+1]){
					System.out.println(data[i]);

	}


}
	}
}




// Second solution
/*
 * public static void main(String[] args) {
 * 
 * int n=data.length; Set<Integer> dupNumbers = new LinkedHashSet<Integer>();
 * for(int i=0;i<n;i++) { if(!dupNumbers.add(data[i])) {
 * System.out.println(data[i]);
 * 
 * } }
 */

// third solution


/*Map<Integer,Integer> allDups = new HashMap<Integer,Integer>();
for (int i = 0; i < data.length -1 ; i++) {
	if(allDups.containsKey(data[i])) 
		allDups.put(data[i], allDups.get(data[i])+1);
	else
		allDups.put(data[i], 1);
}

for (Entry<Integer, Integer> eachEntry : allDups.entrySet()) {
	if(eachEntry.getValue() > 1) {
		System.out.println(eachEntry.getKey());
	}
}
*/
