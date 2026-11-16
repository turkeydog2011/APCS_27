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
int[] cox = new int[(int)(Math.random()*149+51)];
for(int i = 0; i< cox.length;i++){
cox[i]=(int)(Math.random()*100+1);
		}
int min = cox[0];
int max = cox[0];
double ave = 0;
		for(int i = 0; i< cox.length;i++){
if(min>cox[i]){
	min = cox[i];
}
		}
		for(int i = 0; i< cox.length;i++){
if(max<cox[i]){
	max = cox[i];
}
		}
		for(int i = 0; i< cox.length;i++){
ave += cox[i];
		}
		System.out.println("Array size: " + cox.length);
				System.out.println("Array minimum: " + min);

						System.out.println("Array max: " + max);

								System.out.println("Array average: " + (ave/cox.length));

	}
}
