/*
 *	Author:
 *  Date:
 * 	Collaborator:
 */

import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner evil = new Scanner(System.in);
        double result;

        System.out.println("Welcome to the Java calculator, please give your first number:");
        double num1 = evil.nextDouble();
        System.out.println("What will the next one be?");
        double num2 = evil.nextDouble();
        evil.nextLine();
        System.out.println("What operation would you like to use: addition, subtraction, multiplication, division, or exponentiation");
        String opp = evil.nextLine();

        if(opp.equalsIgnoreCase("addition")|| opp.equals("+")){
            result = num1 + num2;
            System.out.println("Your answer is " + result);
        } else if(opp.equalsIgnoreCase("subtraction") || opp.equals("-")){
            result = num1 - num2;
            System.out.println("Your answer is " + result);
        } else if(opp.equalsIgnoreCase("multiplication") || opp.equals("*")){
            result = num1 * num2;
            System.out.println("Your answer is " + result);
        } else if(opp.equalsIgnoreCase("division") || opp.equals("/")){
            result = num1 / num2;
            System.out.println("Your answer is " + result);
        } else if(opp.equalsIgnoreCase("exponentiation") || opp.equals("^")){
            result = Math.pow(num1,num2);
             System.out.println("Your answer is " + result);
        } else {
            System.out.println("Sorry, that isnt an operation, please reset the program");
        }

    }
}
