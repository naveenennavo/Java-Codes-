package programsofjava;

public class SumOfDigits {

	public static void main(String[] args) {
		
		long input=98620199999999999l,sumOfDigits;
		String val = String.valueOf(input);
		char[] charArray = val.toCharArray();
		sumOfDigits = 0;
		for (char c : charArray) {
			sumOfDigits= sumOfDigits + Integer.parseInt(""+c);
		}
		System.out.println("Sum of digits is " +sumOfDigits);
	}  
		
		
	
	
	
	
	//Solution 2
	
	/*int input=201,original, remainder,SumOfDigits ; // Input number 

			original = input;
			while(original>0)
			{
				remainder = original%10;
				int sumOfDigits = SumOfDigits+remainder;
				original=original/10;
			}
			System.out.println("Sum of digits is " +sumOfDigits);
		}  */
		
		
		
		
	
		
		
		
		
	}


