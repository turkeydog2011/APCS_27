/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner evil = new Scanner(System.in);
		System.out.print("please enter the lower bound of your random range: "); 
		int lower = evil.nextInt();
		System.out.print("please enter the upper bound of your random range: "); 
		int higher = evil.nextInt();
	
		System.out.println(); 
		System.out.println("Your range is " + lower +" to " + higher); 
		
System.out.println("would you like to include the upper bound? (0 for no, 1 for yes)");
int check = evil.nextInt();
if(check == 1){
	higher = higher + 1;
}
		int range = higher-lower;

		System.out.println("Heres 5 numbers in that range"); 
		System.out.println(((int)((Math.random()*range)+lower)) +" , " + ((int)((Math.random()*range)+lower)) +" , " + ((int)((Math.random()*range)+lower)) +" , " + ((int)((Math.random()*range)+lower)) +" , " + ((int)((Math.random()*range)+lower))); 






	}
}
