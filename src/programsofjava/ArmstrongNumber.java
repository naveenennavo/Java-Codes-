package programsofjava;

public class ArmstrongNumber{


	//An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. 
	// For example, 371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371
	                                               // 27 + 343 + 1 = 371
	
	public static void main(String[] args) {
		
	
	int n=445;// Input number 

	

		int calculated=0,reminder,original;  
		original=n;  
		while(n>0){  
			reminder=n%10;  
			n=n/10;  
			calculated=calculated+(reminder*reminder*reminder);  
		}  
		if(original==calculated)  
			System.out.println("It is armstrong number");   
		else  
			System.out.println("It is not armstrong number");   
	}  

}
