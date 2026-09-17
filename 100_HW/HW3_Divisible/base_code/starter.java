/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner evil = new Scanner(System.in);
		boolean num1divide3 = true;
		boolean num1divide4 = true;
		boolean num1divide5 = true;

		boolean num2divide3 = true;
		boolean num2divide4 = true;
		boolean num2divide5 = true;

		System.out.println("gimme integer:");
		int num1 = evil.nextInt();
		System.out.println("gimme another:");
		int num2 = evil.nextInt();
		System.out.println();

		if(num1%2 == 0) {
System.out.println(num1 +" is even!");
		}
		else{
			System.out.println(num1 +" is odd!");
		}
		if(num1%3==0){
				System.out.println(num1 +" is devisible by 3!");
		}
		else{
			 num1divide3 = false;
		}
		if(num1%4==0){
				System.out.println(num1 +" is devisible by 4!");
		}
		else{
			 num1divide4 = false;
		}
		if(num1%5==0){
				System.out.println(num1 +" is devisible by 5!");
		}
		else{
			 num1divide5 = false;
		}
		if(num1divide3 == false && num1divide4 == false && num1divide5 == false) {
System.out.println(num1 + " isnt divisible by 3, 4, or 5!");
		}
		System.out.println();

		if(num2%2 == 0) {
System.out.println(num2 +" is even!");
		}
		else{
			System.out.println(num2 +" is odd!");
		}
		if(num2%3==0){
				System.out.println(num2 +" is devisible by 3!");
		}
		else{
			 num2divide3 = false;
		}
		if(num2%4==0){
				System.out.println(num2 +" is devisible by 4!");
		}
		else{
			 num2divide4 = false;
		}
		if(num2%5==0){
				System.out.println(num2 +" is devisible by 5!");
		}
		else{
			 num2divide5 = false;
		}
		if(num2divide3 == false && num2divide4 == false && num2divide5 == false) {
System.out.println(num2 + " isnt divisible by 3, 4, or 5!");
		}

	}
}
