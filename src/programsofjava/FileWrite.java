package programsofjava;

import java.io.BufferedWriter;
//import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		//String fileName ="./NewFile.txt";
		
		
		/*
		 * try { FileOutputStream writer=new FileOutputStream(fileName);
		 * writer.write("TestLeaf Software".getBytes()); // You have to convert to bytes
		 * and write them writer.write("\r\n".getBytes()); // write new line
		 * writer.write("Welcome to the learning.".getBytes()); writer.close(); } catch
		 * (IOException e) { e.printStackTrace(); }
		 */
		
	}




//SOlution 2


  FileWriter fw; {
  try { 
	  fw = new
  FileWriter("./NewFile.txt"); 
	  BufferedWriter writer = new BufferedWriter(fw);
  writer.write("TestLeaf Software");
  writer.write("\r\n"); // write new line
  writer.write("Welcome to the learning.");
  writer.close(); }
  catch(IOException e) { 
	  e.printStackTrace(); 
	  } }
 

//Solution 3

/*
 * public static void main(String[] args) { try { FileWriter writer = new
 * FileWriter(fileName, true); writer.write("TestLeaf Software");
 * writer.write("\r\n"); // write new line
 * writer.write("Welcome to the learning."); writer.close(); } catch
 * (IOException e) { e.printStackTrace(); }
 */
	
}