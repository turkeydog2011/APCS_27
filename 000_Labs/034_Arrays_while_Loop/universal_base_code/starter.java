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
		int index = 0;
		while(index < random.length){
		  random[index]= Math.random()*1000+1;
		  index++;
		}
		index = 0;
		while(index<random.length){
System.out.println("Random " + (1+index) + ": " +random[index]);
index++;
		}


		
	}
}
