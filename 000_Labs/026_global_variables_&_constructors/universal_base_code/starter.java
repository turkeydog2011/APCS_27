/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BankAccount noid = new BankAccount();
		BankAccount Jack = new BankAccount("Jack");
		BankAccount richboy = new BankAccount("richboy", 99999);
		BankAccount mrman = new BankAccount("tod",8.3);

		noid.getInformation();
		Jack.getInformation();
		richboy.getInformation();
		mrman.getInformation();


		


		
	}
}
