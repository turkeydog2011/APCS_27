/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int cycle = 0;
		Scanner evil = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = evil.nextLine();
		System.out.println("How many times should I say it?");
		int times = evil.nextInt();
		while(true) {
			if (cycle == times) {
				break;
			}
			System.out.println(name);
			cycle = cycle +1;

		}




		
	}
}
