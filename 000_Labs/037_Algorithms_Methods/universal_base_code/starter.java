/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toStringArray(int[] p) {
		for(int i = 0; i< p.length;i++){
System.out.println(p[i]);
		}
	}
	public static int getArrayAverage(int[] cox) {
int ave = 0;
for(int i = 0; i< cox.length;i++){
ave += cox[i];
		}
		return (int)(ave/cox.length);

	}
	public static int getArrayMax(int[] cox){
	int min = cox[0];
		for(int i = 0; i< cox.length;i++){
if(min>cox[i]){
	min = cox[i];
}
	}
	return min;
}
public static int getArrayMin(int[] cox){
	int max = cox[0];
		for(int i = 0; i< cox.length;i++){
if(max<cox[i]){
	max = cox[i];
}
	}
	return max;
}
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int[] mink = new int[100];
		for(int i = 0; i<mink.length;i++){
			mink[i]=(int)(Math.random()*100+1);
		}
toStringArray(mink);
System.out.println("Average: " + getArrayAverage(mink));
System.out.println("Max: " + getArrayMax(mink));
System.out.println("Max: " + getArrayMin(mink));



		
	}
}
