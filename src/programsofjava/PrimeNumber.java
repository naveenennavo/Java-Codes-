package programsofjava;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int n = 3;
		
		boolean bNonPrime = false;
	
		
			bNonPrime = false;
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					System.out.println("Non Prime");
					bNonPrime = true;
					break;
				}
			}
			if(!bNonPrime)
				System.out.println("Prime");
		}
		
		
		
		
	}
