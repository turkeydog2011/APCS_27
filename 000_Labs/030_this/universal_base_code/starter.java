/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		int matches = 0;
		PooleDwarf comparer = new PooleDwarf(randName(),(int)(Math.random()*7));
		PooleDwarf compaed1 = new PooleDwarf(randName(),(int)(Math.random()*7));
		PooleDwarf compaed2 = new PooleDwarf(randName(),(int)(Math.random()*7));
		PooleDwarf compaed3 = new PooleDwarf(randName(),(int)(Math.random()*7));
		PooleDwarf compaed4 = new PooleDwarf(randName(),(int)(Math.random()*7));
		PooleDwarf compaed5 = new PooleDwarf(randName(),(int)(Math.random()*7));
		PooleDwarf compaed6 = new PooleDwarf(randName(),(int)(Math.random()*7));
		if(comparer.isSameName(compaed1.getName())) {
			matches++;
		}
		if(comparer.isSameName(compaed2.getName())) {
			matches++;
		}
		if(comparer.isSameName(compaed3.getName())) {
			matches++;
		}
		if(comparer.isSameName(compaed4.getName())) {
			matches++;
		}
		if(comparer.isSameName(compaed5.getName())) {
			matches++;
		}
		if(comparer.isSameName(compaed6.getName())) {
			matches++;
		}
		System.out.println("The name " + comparer.getName() + " was matched " + matches + " times.");


		
	}
}
