/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner evil = new Scanner(System.in);
		int value = ((int)(Math.random()*1000)+1);
		System.out.println("Guess a number from 1 to 1000!");
		
		int guess = evil.nextInt();
		if (guess == value) {
			System.out.println("You're right! the number is "+value+"!");
		}
		else {
				System.out.println("Wrong! the number was actually "+value+"!");
		}
	}
}
