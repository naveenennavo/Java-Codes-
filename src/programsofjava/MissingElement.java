package programsofjava;

public class MissingElement {

	public static void main(String[] args) {
		int[] data = {3,2,1,5,6,7};

			int sum = 0, max = 0;
			for(int n : data){
				sum = sum+n;
				if(n > max) max = n;
			}
			System.out.println((max*(max+1)/2) - sum);
	}
}

//Solution 2

/*
 * public static void main(String[] args) { Arrays.sort(data); // useful it is
 * not sorted for (int i = 1; i <= data.length; i++) { if(i != data[i-1]) {
 * System.out.println("Missing element is "+ i); break; }
 */