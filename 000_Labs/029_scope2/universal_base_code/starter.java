/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int im = 0;
		String statement;
		Donkey donkey = new Donkey();
		Ogre shrek = new Ogre();
		if(shrek.isUgly()){
			 statement = new String(shrek.name + " IS UGLY!");
		} else {
						 statement = new String(shrek.name + " IS NOT UGLY!");

		}
		System.out.println(statement);
		donkey.interact(shrek);
		for(int i = 0; i < 5; i++){
			shrek.interact(donkey);
			  im = i+1;
		}
		System.out.println("That printed out " + im + " times");

	}
}
