/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner evil = new Scanner(System.in);
		// Your code goes below here
	    System.out.println("Welcome to resturant creation and supplying inc!");
		System.out.println("what is your name: ");
		String name = evil.nextLine();
		System.out.println("please name your resturant, " + name);
		String resturant = evil.nextLine();
		System.out.println("welcome, " + name + " to " + resturant);
		System.out.println("our menu can have 5 items! What will the first one be? ");
		String food1 = evil.nextLine();
		System.out.println("how much will " + food1 + " cost?");
		double price1 = evil.nextDouble();
		System.out.println("how many " + food1 + " do you want?");
    	int amount1 = evil.nextInt();
		double total1 = amount1*price1;
		System.out.println(amount1 + " " + food1 + "s" + " will cost " + total1 +"$");
		evil.nextLine();

		System.out.println("Great, people will love " + food1 + "! What will the next one be?");
        String food2 = evil.nextLine();
		System.out.println("how much will " + food2 + " cost?");
		double price2 = evil.nextDouble();
		System.out.println("how many " + food2 + " do you want?");
    	int amount2 = evil.nextInt();
		double total2 = amount2*price2;
		System.out.println(amount2 + " " + food2 + "s" + " will cost " + total2 +"$");
		evil.nextLine();

		System.out.println("Great, people will love " + food2 + "! What will the third one be?");
        String food3 = evil.nextLine();
		System.out.println("how much will " + food3 + " cost?");
		double price3 = evil.nextDouble();
		System.out.println("how many " + food3 + " do you want?");
    	int amount3 = evil.nextInt();
		double total3 = amount3*price3;
		System.out.println(amount3 + " " + food3 + "s" + " will cost " + total3 +"$");
		evil.nextLine();

		System.out.println("Great, people will love " + food3 + "! What will the fourth one be?");
        String food4 = evil.nextLine();
		System.out.println("how much will " + food4 + " cost?");
		double price4 = evil.nextDouble();
		System.out.println("how many " + food4 + " do you want?");
    	int amount4 = evil.nextInt();
		double total4 = amount4*price4;
		System.out.println(amount4 + " " + food4 + "s" + " will cost " + total4 +"$");
		evil.nextLine();

		System.out.println("Great, people will love " + food4 + "! What will the last one be?");
        String food5 = evil.nextLine();
		System.out.println("how much will " + food5 + " cost?");
		double price5 = evil.nextDouble();
		System.out.println("how many " + food5 + " do you want?");
    	int amount5 = evil.nextInt();
		double total5 = amount5*price5;
		System.out.println(amount5 + " " + food5 + "s" + " will cost " + total5 +"$");
		evil.nextLine();
		System.out.println(" ");

		System.out.println("looks like our menu is: ");
		System.out.println("----------" + resturant + "----------");
		System.out.println(food1 + " " + price1 + "$");
		System.out.println(food2 + " " + price2 + "$");
		System.out.println(food3 + " " + price3 + "$");
		System.out.println(food4 + " " + price4 + "$");
		System.out.println(food5 + " " + price5 + "$");
		System.out.println(food5 + " " + price5 + "$");

        System.out.println("would you like to give a tip? (make it a decimal, ex 0.03 for 3%, 0.05 for 5% and so on)");
        double tip = evil.nextDouble();
		if(tip == 0){
        System.out.println("wow dude nothing, really?");
		}
		if(0 < tip && tip < 0.05){
        System.out.println("kinda low ngl");
		}
		if(0.05 < tip && tip < 0.1){
        System.out.println("thanks!");
		}
		if(0.1 < tip && tip < 0.2){
        System.out.println("thank you so much my guy!");
		}
		if(0.2 < tip && tip < 0.4){
        System.out.println("how much money do you have?");
		}
		if(0.4 < tip && tip < 0.67){
        System.out.println("mr beast?");
		}
		if(tip == 0.67 || tip == 0.69){
        System.out.println("very funny");
		}
		if(0.69 < tip){
        System.out.println("mr beast?");
		}
		        System.out.println("");

		System.out.println("Here is your total:");
		double registration = 400 - (tip*50);
		System.out.println(" registration fees: " + registration);
		System.out.println(food1 + " : " + price1);
		System.out.println(food2 + " : " + price2);
		System.out.println(food3 + " : " + price3);
		System.out.println(food4 + " : " + price4);
		System.out.println(food5 + " : " + price5);
		System.out.println("--------------");
	    double grandtotal = ((total1 + total2 + total3+total4 + total5)*1.0975)*(1+tip);
		System.out.println("Taxes: " + ((total1 + total2 + total3+total4 + total5)*0.0975));
		System.out.println("Total: " + grandtotal);
		System.out.println();
		System.out.println("Thanks for shopping with resturant creation and supplying inc" );












	}
}
