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
		int [] num = new int[10];
		int plus = 0;
		int minus = 9;
		while(plus<10){
		num[plus]=minus;
		System.out.println(num[plus]);
		plus++;
		minus--;
		}


		
	}
}
