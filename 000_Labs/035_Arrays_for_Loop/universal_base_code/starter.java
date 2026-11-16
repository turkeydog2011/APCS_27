/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		double[] random = new double[1000];
		for(int i = 0; i < random.length; i++) {
random[i] = Math.random()*1000+1;
		}
		for(int i = 0; i<random.length;i++){
			System.out.println("Random number " + (i+1) + ": " + random[i]);
		}


		
	}
}
