package programsofjava;

public class FindingAll {

	public static void main(String[] args) {
		String test = "$$ Welcome to 1st Automation Interview $$ ";
		char[] ch = test.toCharArray();
		int  letter = 0;
		int space = 0;
		int num = 0;
		int specialChar = 0;

		
			for(int i = 0; i < test.length(); i++){
				if(Character.isLetter(ch[i])){
					letter ++ ;
				}
				else if(Character.isDigit(ch[i])){
					num ++ ;
				}
				else if(Character.isSpaceChar(ch[i])){
					space ++ ;
				}
				else{
					specialChar ++;
				}}
			System.out.println("$$ Welcome to 1st Automation Interview $$ ");
			System.out.println("letter: " + letter);
			System.out.println("space: " + space);
			System.out.println("number: " + num);
			System.out.println("specialCharcter: " + specialChar);
		}
	}

// second solution // using ASCII
/*
 * public void findAllCharactesInString() { for (int j = 0; j < ch.length; j++)
 * { if (((int)ch[j] >= 65 && (int)ch[j] <= 122)){ if (!((int)ch[j] >= 91 &&
 * (int)ch[j] <= 96)) { letter = letter+1; } }else if (((int)ch[j] >= 48 &&
 * (int)ch[j] <= 57)) { num = num+1; }else { specialChar ++; } }
 * System.out.println("letter count: " +letter);
 * System.out.println("number count:" + num );
 * System.out.println(" special character count:" +specialChar); }
 */

// solution 3 // simpler coding

/*
 * public static void main(String[] args) { String alp =
 * test.replaceAll("[^a-zA-Z]", ""); System.out.println(alp);
 * 
 * String onlyNumber = test.replaceAll("[^0-9]", ""); // other options is \\D
 * System.out.println(onlyNumber);
 * 
 * String spl = test.replaceAll("[0-9a-zA-Z ]", ""); //excluding space as well
 * System.out.println(spl); }
 */