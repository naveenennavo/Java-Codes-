package programsofjava;

public class ReverseString {

	public static void main(String[] args) {
		String data ="i am gonna reach beyond skies";
		StringBuilder input = new StringBuilder(data);
		System.out.println(input.reverse());

	}

}

//solution 2
/*
 * char[] chr = data.toCharArray(); for (int i = chr.length-1; i>=0; i--)
 * System.out.print(chr[i]); System.out.println();
 */

//solution 3
/*
 * for (int i = data.length()-1; i>=0; i--) System.out.print(data.charAt(i));
 * System.out.println();
 */