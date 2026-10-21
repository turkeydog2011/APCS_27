/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner evil = new Scanner(System.in);
System.out.println("What will you like to exponentiate:");
int ex = evil.nextInt();
System.out.println("By how much");
int powerness = evil.nextInt();
int cycle =1;
int numb = ex;
while(!(powerness==cycle)) {
 
numb = pow(ex, numb);
cycle = cycle +1;
}
System.out.println("Your result is: "+numb);

		
	}
	public static int pow(int ex, int numb) {
		int a = numb*ex;
		return a;
	}
}
