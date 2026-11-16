/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
int[] leint = new int[20];
String match1 = "There are duplicates at index: ";
String match2 = "There are two in a row at: ";
String match3 = "With a shared value of: ";
for (int i = 0; i<leint.length;i++){
	leint[i]=(int)(Math.random()*10+1);

}
int countdup = 0;
int checker = (int)(Math.random()*10+1);
for (int i = 0; i<leint.length;i++){
	if(leint[i]==checker){
match1+= i+" ";
countdup++;
	}
	
}
for(int i = 0; i<leint.length;i++){
	if(!((i+1)==leint.length)){
		if(leint[i]==leint[i+1]){
			match2 += i+ " and "+ (i+1)+" ";
			match3 += leint[i] + ", ";
		}
	}
}
System.out.println(match1);
System.out.println("There are " + countdup + " pairs of duplicates");
if(countdup!=0){
System.out.println("The duplicates have a value of " + checker);
}
System.out.println();
System.out.println(match2);
System.out.println(match3);


 	}
}
