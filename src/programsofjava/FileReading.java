package programsofjava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) throws IOException {
		String str;

		File file = new File("./capgemini.txt"); 
		BufferedReader br = new BufferedReader(new FileReader(file)); 

		while ((str = br.readLine()) != null) 
			System.out.println(str); 

		br.close();
		
		
		
	}

}





// Solution 2

//public static void main(String[] args) throws IOException {
//int i; 
//FileReader reader = new FileReader("./capgemini.txt"); 
//
//while ((i=reader.read()) != -1) 
//	System.out.print((char) i); 
//
//reader.close();
//System.out.println("");
//}

// Solution 3

/*
 * public static void main(String[] args) throws IOException { File file = new
 * File("./capgemini.txt"); Scanner sc = new Scanner(file);
 * 
 * while (sc.hasNextLine()) System.out.println(sc.nextLine());
 * 
 * sc.close(); } }
 */