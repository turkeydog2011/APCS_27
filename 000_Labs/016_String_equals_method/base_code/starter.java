/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner evil = new Scanner(System.in);
		System.out.println("Please select your class: Wizard, Rogue, Warrior");
		String dnd = evil.nextLine();
		if(dnd.equals("Wizard")|| dnd.equals("wizard")){
			System.out.println("You're a wizard Harry(idk your name)");
		} else if(dnd.equals("Rogue")|| dnd.equals("rogue")){
			System.out.println("You're a rogue, a thief, like Locke Lamora from the hit fantasy novel The Lies of Locke Lamora by Scott Lynch, released on June 27, 2006. Selling approximately over 500,000 copies with over 190,000 words");
		}else if(dnd.equals("Warrior")|| dnd.equals("warrior")){
			System.out.println("You're a Warrior, wow thats boring");
		} else {
			System.out.println("Looks like you made a typo (or didnt follow directions), try again!");
		}
	}
}
