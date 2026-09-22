/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner evil = new Scanner(System.in);
		System.out.println("gimme an integer");
		int num1 = evil.nextInt();
		System.out.println("gimme another integer");
		int num2 = evil.nextInt();
		boolean equalness = num1 == num2;
		boolean unequalness = num1 != num2;
System.out.println();
		if(equalness){
 System.out.println( +num1+ " and " +  num2 + " are equal!");
		}
		if(unequalness){
 System.out.println(num1+ " and " +  num2 + " are NOT equal!");
		}
	}
}
