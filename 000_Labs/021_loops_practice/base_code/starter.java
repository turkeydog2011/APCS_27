/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner evil = new Scanner(System.in);
		int answer = (int)(Math.random()*1000+1);
		int response = 1110;
		int cycle = 0;
		System.out.println("Guess a number from 1 to 1000!");
		while(answer != response) {
		System.out.println("Whats your guess?");
		 response = evil.nextInt();
		 if (response <answer){
			System.out.println("Wrong! try going higher");

		 } else if(response > answer){
			
			System.out.println("Wrong! try going lower");
		 }
		 cycle = cycle +1;

		}
		System.out.println("Thats right! The number is " + answer + "!");
		System.out.println("It took you " + cycle + " tries to get it right!");
	}
}
