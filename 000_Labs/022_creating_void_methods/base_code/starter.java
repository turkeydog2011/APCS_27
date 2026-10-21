/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner evil = new Scanner(System.in);
		System.out.println("Gimme a sentence twin");
		String sent1 = evil.nextLine();
		System.out.println("Gimme another sentence twin");
	String sent2 = evil.nextLine();
	toString(sent1);
    toStringCombined(sent1,sent2);

	



		
	}
	public static void toString(String sent1){
		String lala = sent1;
		System.out.println(lala);
		
	}
	public static void toStringCombined(String sent1, String sent2) {
		String lele = sent1;
		String lolo = sent2;
		System.out.println(sent1 + " " + sent2);
	}
}
