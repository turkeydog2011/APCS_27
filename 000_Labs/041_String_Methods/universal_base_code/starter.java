/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner evil = new Scanner(System.in);
		System.out.println("Gimme ur full name");
		String sus = evil.nextLine();
		String last = sus.substring(sus.indexOf(" "));
		System.out.println("Your last (and possibly middle) name is " + last.substring(1));


		
	}
}
