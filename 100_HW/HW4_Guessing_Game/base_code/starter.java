/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;
import java.util.Random;
class starter {
	public static void main(String args[]) {
		Scanner evil = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int question = (int)(Math.random()*3);
		System.out.println("would you like to play a little guessing game?");
		System.out.println("you get 2 hints!");
		if(question == 0){
        System.out.println("First hint: its a coding language");
		String answer1 = evil.nextLine();
			if(answer1.equals("java")||answer1.equals("Java")){
			System.out.println();
			System.out.println("You got it! Good job!");
			} else {
				System.out.println("Wrong! Heres another hint: its part of the AP Computer science curriculum");
				answer1 = evil.nextLine();
				if(answer1.equals("java")||answer1.equals("Java")){
				System.out.println();
            	System.out.println("You got it!");
			} else {
				System.out.println("Wrong, better luck next time!");
			}
		}
		} else if(question == 1) {
		 	System.out.println("First hint: Its a large city in america");
		 	String answer2 = evil.nextLine();
			if(answer2.equals("New York")||answer2.equals("new york") || answer2.equals("New york")|| answer2.equals("new York")){
				System.out.println();
				System.out.println("You got it! Good job!");
		} else {
			System.out.println("Wrong! Heres another hint: its on the east coast");
			answer2 = evil.nextLine();
			if(answer2.equals("New York")||answer2.equals("new york") || answer2.equals("New york")|| answer2.equals("new York")){
				System.out.println();
            	System.out.println("You got it!");
				} else {
					System.out.println("Wrong, better luck next time!");
				}
		}
		} else {
        System.out.println("First hint: its a language");
		 String answer3 = evil.nextLine();
		 if(answer3.equals("german")||answer3.equals("German")){
			System.out.println();
			System.out.println("You got it! Good job!");
		} else {
			System.out.println("Wrong! Heres another hint: its spoken in germany");
			answer3 = evil.nextLine();
			if(answer3.equals("german")||answer3.equals("German")){
			System.out.println();
            System.out.println("You got it!");
			} else {
				System.out.println("Wrong, better luck next time!");
			}
		}
		}

	}
}
