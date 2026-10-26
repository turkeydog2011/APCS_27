/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner evil = new Scanner(System.in);
		Employee michael = new Employee();
		Employee Dwight = new Employee(1987,"Dwight","Schrute",4416.66 );
		Employee Jim = new Employee(2474,"Jim","Halpert",4416.66 );
		Employee Pam = new Employee(2011,"Pam","Beesly", 2250.0 );
		Employee Sammy = new Employee(118,"Sammy","Durbas",3320.92);	
		System.out.println("This year was great! How much should we raise our employees saleries?");
		int raise = evil.nextInt();
		michael.raiseSalary(raise);
		 Jim.raiseSalary(raise);
		 Pam.raiseSalary(raise);
		 Dwight.raiseSalary(raise);
		 Sammy.raiseSalary(raise);
		 micheal.employeeToString();
		 System.out.println("Annual Salary: " + micheal.getAnnualSalary() );
		 System.out.println();
		 Jim.employeeToString();
		 System.out.println("Annual Salary: " + Jim.getAnnualSalary() );
		 System.out.println();
		 Pam.employeeToString();
		 System.out.println("Annual Salary: " + Pam.getAnnualSalary() );
		 System.out.println();
		 Dwight.employeeToString();
		 System.out.println("Annual Salary: " + Dwight.getAnnualSalary() );
		 System.out.println();
		 Sammy.employeeToString();
		 System.out.println("Annual Salary: " + Sammy.getAnnualSalary() );
		 System.out.println();

		
	}
}
