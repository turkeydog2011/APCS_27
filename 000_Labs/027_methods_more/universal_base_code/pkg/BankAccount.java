/*
 *	Author:  
 *  Date: 
*/



package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
String Owner;
int NextAccountNumber = (int)((Math.random()*950)+50)-1;
double Balance;
boolean isActive;
int AccountNumber;

	public BankAccount(){
		Owner = "unknown";
		AccountNumber = NextAccountNumber+1;
		NextAccountNumber++;
		Balance = 0;
		isActive = true;
	}
	public BankAccount(String o){
Owner = o;
		AccountNumber = NextAccountNumber+1;
		NextAccountNumber++;
		Balance = 0;
		isActive = true;
	}
	public  BankAccount(String o, double b){
Owner = o;
		AccountNumber = NextAccountNumber+1;
		NextAccountNumber++;
		Balance = b;
		isActive = true;
	}
	public void check(){
		System.out.println("Account Balance: " + Balance);
	}

public void getInformation(){
	System.out.println();
	System.out.println("Name: " + Owner);
	System.out.println("Account #: " + AccountNumber);
	System.out.println("Balance: " + Balance);
	String activeness;
	if(isActive=true){
		activeness = "yes";
	} else {
		activeness = "no";
	}
	System.out.println("Is it active?: " + activeness);

}
}

