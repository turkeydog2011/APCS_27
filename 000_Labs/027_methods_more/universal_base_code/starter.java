/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import pkg.BankAccount;

import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner evil = new Scanner(System.in);


		System.out.println("Would you like to create a bank Account?");
		String account = evil.nextLine();
		if(account.equalsIgnoreCase("y")||account.equalsIgnoreCase("yes")) {
			System.out.println("Which kind of account would you like to create?");
			System.out.println("- blank account");
			System.out.println("- named account");
			System.out.println("- full account");
			String type = evil.nextLine();
											BankAccount bank1 = new BankAccount();
						 if (type.equalsIgnoreCase("named account")) {
				System.out.println("What is your name?");
				String name = evil.nextLine();
				 bank1 = new BankAccount(name);
			} else if (type.equalsIgnoreCase("full account")) {
System.out.println("What is your name?");
				String name = evil.nextLine();
				System.out.println("How much would you like to desposit?");
				Double monies = evil.nextDouble();
				evil.nextLine();
				 bank1 = new BankAccount(name, monies);
			}
			
			System.out.println("Thank you for registing");
			int options = 1;
			while(options < 3){
			System.out.println("press 1 to view balance");
			System.out.println("press 2 to view all account information");
			System.out.println("press 3 to leave");
			options = evil.nextInt();
			if(options == 1) {
				bank1.check();
			} else if (options == 2) {
				bank1.getInformation();
			}
			}
			

		
		
		}
	}
}
