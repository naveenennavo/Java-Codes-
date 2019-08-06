package programsofjava;

public class PrintingTriangle {

	public static void main(String[] args) {
		int n = 5;
		int i, j, k=n*2-2;
        for(i=0; i<n; i++){
            for(j=0; j<k; j++){
                System.out.print(" ");
            }
            k = k - 2;
            for(j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
	}
		
		
		
		
		
		
		

		
		/*int i, j;
		int n = 5;
		// outer loop to handle number of rows
		//  n in this case
		for(i=0; i<n; i++){
		//  inner loop to handle number of columns
			//  values changing according to outer loop  
			for(j=0; j<=i; j++){
				// printing stars
				System.out.print("* ");
			}

			// ending line after each row
			System.out.println();*/
		
		}
		
		
	

