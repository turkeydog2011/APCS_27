/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr1 = new int[1001];
		 int [] arr2 = new int[1001];
		 int index = 0;
		 int val = 3;
		 System.out.println("Array 1:");

		 while(index< arr1.length){
arr1[index] = val;
System.out.println(arr1[index]);

index++;
val += 3;
		 }
val = 1000;
index = 0;
System.out.println("");

System.out.println("Array 2:");
		 while(index< arr2.length){
arr1[index] = val;
System.out.println(arr1[index]);

index++;
val--;
		 }
	}
}
