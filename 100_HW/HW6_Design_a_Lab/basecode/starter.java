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
        

        System.out.println("Welcome to the Java calculator, would you like to use an operation or a formula?:");
        String option = evil.nextLine();
        if(option.equalsIgnoreCase("formula")){
            System.out.println("What formula would you like to use: pathagoean theorum, quadratic formula, or area of a circle?");
            String formula = evil.nextLine();
            if(formula.equalsIgnoreCase("Pathagoean theorum")) {
                System.out.println("Please give the first leg of the triangle");
                double lega = evil.nextDouble();
                System.out.println("Please give the second leg of the triangle");
                double legb = evil.nextDouble();
                double hypc = Math.sqrt((Math.pow(lega, 2)+Math.pow(legb, 2)));
                System.out.println("The hypotenuse of your triangle is " + hypc);
            } else if(formula.equalsIgnoreCase("quadratic formula")){
                System.out.println("What will a be?");
                double a = evil.nextDouble();
                System.out.println("What will b be?");
                double b = evil.nextDouble();
                System.out.println("What will c be?");
                double c = evil.nextDouble();
                double quadform1 = (-b+(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);
                double quadform2 = (-b-(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);
                System.out.println("Your answers are " +quadform1+", " + quadform2);

            } else if(formula.equalsIgnoreCase("area of a circle")) {
                System.out.println("What is your radius?");
                Double radius = evil.nextDouble();
                double area = 3.14*(Math.pow(radius,2));
                System.out.println("Your circles area is " + area +" inches squared");
            } else{
                System.out.println("Sorry that isnt a valid formula, please reset the program");
            }

        } else if (option.equalsIgnoreCase("operation")) {
        System.out.println("What will your first number be?");
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
        }else{
            System.out.println("Sorry, that isnt a valid response, please reset the program");
        }

    }
}
