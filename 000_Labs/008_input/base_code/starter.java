/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
	//	String name = sc.nextLine();
	//	int age = sc.nextInt();
	//	int bmonth = sc.nextInt();
	//	int bday = sc.nextInt();
	//	int byear = sc.nextInt();
	//	double buck = sc.nextDouble();
		System.out.println("what is your name");
		String name = sc.nextLine();
		System.out.println("hello, " + name);
		System.out.println("how old are you?");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println(name + " is " + age + " years old");
		System.out.println("what is your birthmonth?");
		String bmonth = sc.nextLine();
		System.out.println(name + " is " + age + " years old, they were born in " + bmonth + ".");
		System.out.println("on what day of the month were you born?");
	    int bday = sc.nextInt();
		System.out.println(name + " is " + age + " years old, they were born on " + bmonth + " " + bday);
		System.out.println("what year were you born");
		int byear = sc.nextInt();
		System.out.println(name + " is " + age + " years old, they were born on " + bmonth + " " + bday + " in " + byear);
        System.out.println("btw how much is a buck fifty?");
		double buck = sc.nextDouble();
		System.out.println(buck+"? really? dang that crazy");

	}
}
