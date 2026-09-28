/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner evil = new Scanner(System.in);
		int fortune = (int)(Math.random()*12);
		System.out.println("Printing fortune... (press enter)");
		evil.nextLine();
		if(fortune == 0) {
			System.out.println("Great things come from patience");
		}
		if(fortune == 1) {
			System.out.println("The strongest lifes are built from integrity");
		}
		if(fortune == 2) {
			System.out.println("dont eat 12000 lemons");
		}
		if(fortune == 3) {
			System.out.println("warn, you will have betrayal");
		}
		if(fortune == 4) {
			System.out.println("Love overpowers all");
		}
		if(fortune == 5) {
			System.out.println("the sun shines bright opon those who themselves brighten others");
		}
		if(fortune == 6) {
			System.out.println("your lucky numbers are: 12 25 60 23 55");
		}
		if(fortune == 7) {
			System.out.println("good things come from your kindness");
		}
		if(fortune == 8) {
			System.out.println("You will buy some new pants");
		}
		if(fortune == 9) {
			System.out.println("August 12 2036 the heat death of the universe");
			System.out.println("August 12 2036 the heat death of the universe");
			System.out.println("August 12 2036 the heat death of the universe");
		}
		if(fortune == 10) {
			System.out.println("Be strong, tomorrow will be better");
		}
		if(fortune == 11) {
			System.out.println("Happiness comes from being happy");
		}


	}
}
