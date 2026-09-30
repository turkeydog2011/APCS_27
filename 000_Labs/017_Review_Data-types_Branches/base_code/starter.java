/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner evil = new Scanner(System.in);
		int points = 20;
		int unclass = 5;

		System.out.println("Please give your name:");
		String name = evil.nextLine();
		System.out.println("What is your mighty, amazing title " + name + "?");
		String title = evil.nextLine();
		System.out.println("Please select your class " + name + ", " + title +": Wizard, Rogue, Warrior");
		String dnd = evil.nextLine();
		if(dnd.equals("Wizard")|| dnd.equals("wizard")){
			System.out.println("You're a wizard Harry(idk your name)");
			unclass = 0;
		} else if(dnd.equals("Rogue")|| dnd.equals("rogue")){
			unclass = 1;
			System.out.println("You're a rogue, a thief, like Locke Lamora from the hit fantasy novel The Lies of Locke Lamora by Scott Lynch, released on June 27, 2006. Selling approximately over 500,000 copies with over 190,000 words");
		}else if(dnd.equals("Warrior")|| dnd.equals("warrior")){
			unclass = 2;
			System.out.println("You're a Warrior, wow thats boring");
		} else {
			System.out.println("Looks like you made a typo (or didnt follow directions), try again!");
		}

		System.out.println();
		System.out.println("You have 20 points to choose how much Strength, Dexterity, Intelligence, and Charisma from 1-10");
		System.out.println("How strong do you want to be from 1-10? (you have " + points + " points left):");
		int strong = evil.nextInt();
		if(strong > 10) {
			System.out.println("Thats over 10! try again!");
			System.out.println("How strong do you want to be from 1-10? (you have " + points + " points left):");
		strong = evil.nextInt();
		points = points-strong;
      
		} else if(strong > points){
			System.out.println("You dont have enough points! try again!");
			System.out.println("How strong do you want to be from 1-10? (you have " + points + " points left):");
		strong = evil.nextInt();
		points = points-strong;
    
		} else{
			points = points-strong;
		}
		System.out.println("your strength is " + strong);
		System.out.println("You have " + points + " left.");
		

		System.out.println("How dexterious do you want to be from 1-10? (you have " + points + " points left):");
		int dex = evil.nextInt();
		if(dex > 10) {
			System.out.println("Thats over 10! try again!");
			System.out.println("How dexterious do you want to be from 1-10? (you have " + points + " points left):");
		dex = evil.nextInt();
		points = points-dex;
		} else if(dex > points){
			System.out.println("You dont have enough points! try again!");
			System.out.println("How dexterious do you want to be from 1-10? (you have " + points + " points left):");
		dex = evil.nextInt();
		points = points-dex;
		} else{
			points = points-dex;
		}
		System.out.println("your dexterity is " + dex);
		System.out.println("You have " + points + " left.");


		System.out.println("How intelligent do you want to be from 1-10? (you have " + points + " points left):");
		int smart = evil.nextInt();
		if(smart > 10) {
			System.out.println("Thats over 10! try again!");
			System.out.println("How intelligent do you want to be from 1-10? (you have " + points + " points left):");
		smart = evil.nextInt();
		points = points-smart;
		} else if(smart > points){
			System.out.println("You dont have enough points! try again!");
			System.out.println("How intelligent do you want to be from 1-10? (you have " + points + " points left):");
		smart = evil.nextInt();
		points = points-smart;
		} else{
			points = points-smart;
		}
		System.out.println("your intelligence is " + smart);
		System.out.println("You have " + points + " left.");
		

		System.out.println("How charismatic do you want to be from 1-10? (you have " + points + " points left):");
		int hot = evil.nextInt();
		if(hot > 10) {
			System.out.println("Thats over 10! try again!");
			System.out.println("How charismatic do you want to be from 1-10? (you have " + points + " points left):");
		hot = evil.nextInt();
		points = points-smart;
		} else if(hot > points){
			System.out.println("You dont have enough points! try again!");
			System.out.println("How charismatic do you want to be from 1-10? (you have " + points + " points left):");
		hot = evil.nextInt();
		points = points-hot;
		} else if(hot != points) {
System.out.println("Are you sure, you would have points left over! Try again");
System.out.println("How charismatic do you want to be from 1-10? (you have " + points + " points left):");
		hot = evil.nextInt();
		points = points-hot;    
		}
			else{
			points = points-hot;
		}
		System.out.println("your charismatic is " + hot);
		System.out.println("You have " + points + " left.");
	    System.out.println("");

		String opin;
		if(unclass == 0) {
			 opin = "Wizard";
		}else if(unclass == 1) {
			 opin = "Rogue";
		} else if(unclass == 2) {
			opin = "Warrior";
		} else {
			opin = "Loser";
		}
		System.out.println("Stats of " + name +", " + title);
		System.out.println("-------------------");
		System.out.println("Class: " + opin);
		System.out.println("Strength: " + strong);
		System.out.println("Dexterity: " + dex);
		System.out.println("Intelligence: " + smart);
		System.out.println("Charisma: " + hot);
		System.out.println();
		System.out.println("Have fun " + name +"!");
	}
}