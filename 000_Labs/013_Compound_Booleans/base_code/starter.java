/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner evil = new Scanner(System.in);
		System.out.println("gimme 3 integers (make sure they are different!):");
		int num1 = evil.nextInt();
		System.out.println("gimme another, please");
		int num2 = evil.nextInt();
		System.out.println("okay, okay, last integer");
		int num3 = evil.nextInt();
		
		if (num1>num2 && num1>num3) {
			System.out.println(num1 +" is the largest number");
		}
		if (num2>num1 && num2>num3) {
			System.out.println(num2 +" is the largest number");
		}
		if (num3>num2 && num3>num1) {
			System.out.println(num3 +" is the largest number");
		}
		if (num1<num2 && num1<num3) {
			System.out.println(num1 +" is the smallest number");
		}
		if (num2<num1 && num2<num3) {
			System.out.println(num2 +" is the smallest number");
		}
		if (num3<num2 && num3<num1) {
			System.out.println(num3 +" is the smallest number");
		}
		if (num1 == num2 || num1 == num3 || num2 == num3){
				System.out.println("Dude i told you do give different numbers, not cool");

		}

	
	}
}
