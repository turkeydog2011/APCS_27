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
	public void setOwner(String a ) {
Owner = a;
	}
	public void setBalance(double a ) {
Balance = a;
	}
	public void setActive(Boolean a ) {
isActive = a;
	}
	public String getOwner(){
		return Owner;
	}
	public double getBalance(){
		return Balance;
	}
	public boolean getActive(){
		return isActive;
	}
	public  BankAccount(String o, double b){
Owner = o;
		AccountNumber = NextAccountNumber+1;
		NextAccountNumber++;
		Balance = b;
		isActive = true;
	}
	public double deposit(double a) {
		if (isActive = true){
		return Balance + a;
		} else {
			return Balance;
		}
	}


public void displayAccountInfo(){
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