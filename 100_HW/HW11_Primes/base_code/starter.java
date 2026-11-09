/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner evil = new Scanner(System.in);
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Please insert an integer");
int bolop = evil.nextInt();
		printPrimes(bolop);
		
	}
	public static boolean checkPrime(int a){
		if(a==1){
			return false;
		}else{
		int prime=		a-1;
int hibip = 1;
boolean primeness = true;
		while (prime!=1&& primeness == true){
hibip=a%prime;
prime--;
if(hibip== 0){
		primeness = false;
	} 
		}
			return primeness;
}
	}
	public static void printPrimes(int a){
		int bleb = a;
		int counter = 0;
		while(bleb!=1){
bleb--;
if(checkPrime(bleb)){
	System.out.println(bleb+" is smaller than " + a + " and is prime");
	counter++;
}
}
System.out.println(a +" has " + counter + " prime numbers smaller than it");
	}

}
