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
System.out.println("Say me something twin");
String input = evil.nextLine();
System.out.println("Did you say ");
for(int i = 0; i<input.length();i++){
	System.out.println(input.substring(i,(i+1)));
}
System.out.println("?");

		
	}
}
