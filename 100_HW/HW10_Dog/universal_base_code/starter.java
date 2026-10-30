/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner evil = new Scanner(System.in);
		System.out.println("What will you name the first dog?");
		String name1 = evil.nextLine();
Dog namedo = new Dog(name1);	
namedo.setAge((int)(Math.random()*11));	
System.out.println("What will you name the second dog?");
String name2 = evil.nextLine();
System.out.println("Whats their breed?");
String breed = evil.nextLine();
Dog namede = new Dog(name2,breed);
System.out.println();
boolean sleep1 = false;
if (namedo.isSleeping()) {
System.out.println(namedo.getname()+" is sleeping...");
sleep1 = true;
} else {
	namedo.bark();
}
// if (sleep1 == false){
//namede.bark();
//	}
if (namede.isSleeping()) {
if(sleep1 == false) {
	namede.bark();
}
} else {
	if(sleep1 == false) {
	namede.bark();
	}
}

	}
}
