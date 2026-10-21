/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

import javax.crypto.Cipher;

class starter {
	public static void main(String args[]) {
		// Your code goes below here

		Scanner evil = new Scanner(System.in);
		boolean fai = true;
		String sent;
		while (fai == true){
		System.out.println("Would you like to use a key?");
		String ques = evil.nextLine();
		int key = 0;
		boolean keyes = false;
		if(ques.equalsIgnoreCase("yes")||ques.equalsIgnoreCase("y")) {
			System.out.println("What is the key?");
			key = evil.nextInt();
			evil.nextLine();
			keyes = true;
		}
		System.out.println("What would you like to encode/decode");
		String code = evil.nextLine();
		int brute = 0;
		
		if(ques.equalsIgnoreCase("brute")){
			System.out.println("Brute forcing it (I couldnt figure out number 7, what does 13 and 29 mean)");
			while(brute<37){
							System.out.println(Cipher.keyedEncode(code, brute));

			brute++;
			}
		}
		if(keyes == true) {
			System.out.println("Your result is: " +  Cipher.keyedEncode(code, key) );
		} else {
						System.out.println("Your result is: " +  Cipher.encode(code) );
		}
		System.out.println("Would you like to use it again?");
		sent = evil.nextLine();
		if(!(sent.equalsIgnoreCase("yes")||sent.equalsIgnoreCase("y"))) {
			fai = false;
		}
		
	}

		

	}
}
