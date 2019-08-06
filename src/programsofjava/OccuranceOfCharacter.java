package programsofjava;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharacter {

	public static void main(String[] args) {
		
		
		String str = "welcome to automation";
		// int count =0;
		
			char[] char_array =str.toCharArray();
			Map<Character,Integer> charCounter=new HashMap<Character,Integer>();
			for (char ch : char_array) {
				if(charCounter.containsKey(ch)){
					charCounter.put(ch, charCounter.get(ch)+1);
				} 
				else{
					charCounter.put(ch, 1);
				}
			}
			System.out.println(charCounter);
	}

}






//Solution 2
/*
 * 
 * public static void main(String[] args) { char c = str.charAt(0); for (int i =
 * 0; i < str.length(); i++) { if (c == str.charAt(i)) { count++; } }
 * System.out.println(c + " occurs " + count + " times in " + str) }
 */

//Solution 3

/*
 * public static void main(String[] args) {
 * 
 * String string=""; int temp =0; Map<Integer,String> map =new
 * LinkedHashMap<Integer,String>(); for (int i = 0; i < str.length(); i++) {
 * map.put(temp, ""+str.charAt(i)); temp++; } for (int eachChar : map.keySet())
 * { count=0; string =map.get(eachChar); for (Integer eachKey : map.keySet()) {
 * if (string.equals(map.get(eachKey))) { count++; } }
 * System.out.println(map.get(eachChar)+"-->"+count); } } }
 */