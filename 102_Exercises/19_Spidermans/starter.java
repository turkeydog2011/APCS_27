/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner evil = new Scanner(System.in);
Spiderman spi1 = new Spiderman("Tobey Maguire", 48, "The Vulture");
Spiderman spi2 = new Spiderman("Andrew Garfield", 40, "Electro");
Spiderman spi3 = new Spiderman("Tom Holland", 27, "Green Goblin");
System.out.println("Make a spiderman!");
System.out.println("Who will they be played by?");
String actor = evil.nextLine();
System.out.println("How old are they");
int age = evil.nextInt();
evil.nextLine();
System.out.println("Who is their villian");
String villian = evil.nextLine();
Spiderman spi4 = new Spiderman(actor, age, villian);
System.out.println("Here are your spidermans");
System.out.println("Spiderman 1:");
System.out.println("Actor: " + spi1.getActor());
System.out.println("Age: " + spi1.getAge());
System.out.println("Villian: " + spi1.getVillian());
System.out.println();
System.out.println("Spiderman 2:");
System.out.println("Actor: " + spi2.getActor());
System.out.println("Age: " + spi2.getAge());
System.out.println("Villian: " + spi2.getVillian());
System.out.println();
System.out.println("Spiderman 3:");
System.out.println("Actor: " + spi3.getActor());
System.out.println("Age: " + spi3.getAge());
System.out.println("Villian: " + spi3.getVillian());
System.out.println();
System.out.println("Spiderman 4:");
System.out.println("Actor: " + spi4.getActor());
System.out.println("Age: " + spi4.getAge());
System.out.println("Villian: " + spi4.getVillian());
System.out.println();


		
	}
}
