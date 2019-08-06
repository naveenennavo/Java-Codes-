package programsofjava;

public class Timer {

	long startTime;
	long endTime;
	int  letter, space, num, specialChar;
	
	
	public void startTimer() {
		letter = 0;
		 space = 0; num = 0; specialChar = 0;
		startTime = System.nanoTime();
	}

	
	public void endTimer() {
		endTime = System.nanoTime();
		System.out.println(endTime - startTime);
	}
	public static void main(String[] args) {
		 System.out.println("startTimer()");
		 System.out.println("endTimer()");
		 
	}
}
