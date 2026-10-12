/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner evil = new Scanner(System.in);
		double money = 100;
		System.out.println("Welcome to the dandelion casino!");
        // This method does an action, but does not use a 'return' statement
		System.out.println("Your balence is: " +money);
		System.out.println("---------------------------");
		System.out.println("Wouldya like to go gambling? (yes/y or no/n)");
		String gamb = evil.nextLine();
		int answer = 33;
		if(gamb.equalsIgnoreCase("yes")||gamb.equalsIgnoreCase("y")){
  answer = 0;
		} else if (gamb.equalsIgnoreCase("no")||gamb.equalsIgnoreCase("n")) {
			answer = 1;
		} else {
			answer = 2;
		}
		while (answer == 2) {
			System.out.println("Didnt catch that, gimme a yes or a no!");
			gamb = evil.nextLine();
			if(gamb.equalsIgnoreCase("yes")||gamb.equalsIgnoreCase("y")){
  answer = 0;
		} else if (gamb.equalsIgnoreCase("no")||gamb.equalsIgnoreCase("n")) {
			answer = 1;
		} else {
			answer = 2;
		}
		}
		while(answer == 0&&money>0){
				System.out.println("Great! How much ya betting?");
				double bet = evil.nextDouble();
				boolean valid = true;
				if(bet < 0 || bet>money) {
					valid = false;
				}
				while(!valid){
	
				
					if (bet < 0) {
						System.out.println("Very funny, yo know how cant bet a negative number. Try again");
					bet = evil.nextDouble();
					if(bet < 0 || bet>money) {
					valid = false;
				} else {
					valid = true;
				}

					} else {
						System.out.println("I appricate enthusaism, but you just dont have enough! Try again");
						bet = evil.nextDouble();
						if(bet < 0 || bet>money) {
					valid = false;
				} else {
					valid = true;
				}
					}
					


				}
				System.out.println("You got $"+ money + ". Lets see if lady luck is on ya side...");
				int roll1 = (int)(Math.random()*10);
				int roll2 = (int)(Math.random()*10);
				int roll3 = (int)(Math.random()*10);
				System.out.println("_____________");
				System.out.println("|   |   |   |");
				System.out.println("| "+roll1+" | "+roll2+" | " + roll3 + " |");
				System.out.println("|   |   |   |");
				System.out.println("_____________");
				if(roll1==roll2||roll2==roll3||roll1==roll3){
					System.out.println("Lucky you! Keep at it!");
					money = money+bet;
				} else if(roll1==roll2&&roll1==roll3){
					System.out.println("JACKPOT?! A few more of those and ill be outta a job...");
						money = money+(2*bet);
				} else if(roll1 == 5&&roll2==8&&roll3==9) {
					System.out.println("Mother of pearl! the FALKON JACKPOT?!");
						money = money+(9*bet);
				}
				else{
					System.out.println("aw shoot, better luck next time!");
					money = money-bet;
				}
				evil.nextLine();
				System.out.println("Would ya like to go again?");
				gamb = evil.nextLine();
				if(gamb.equalsIgnoreCase("yes")||gamb.equalsIgnoreCase("y")){
  answer = 0;
		} else if (gamb.equalsIgnoreCase("no")||gamb.equalsIgnoreCase("n")) {
			answer = 1;
		} else {
			answer = 2;
		}

				while (answer == 2) {
			System.out.println("Didnt catch that, gimme a yes or a no!");
			gamb = evil.nextLine();
			if(gamb.equalsIgnoreCase("yes")||gamb.equalsIgnoreCase("y")){
  answer = 0;
		} else if (gamb.equalsIgnoreCase("no")||gamb.equalsIgnoreCase("n")) {
			answer = 1;
		} else {
			answer = 2;
		}
			









		}
	}
System.out.println("                                                                           ");
System.out.println("                                 *==++***++                                ");
System.out.println("                               +=-==+*******+                              ");
System.out.println("                               =*%%%%%%@@@@%*=+                            ");
System.out.println("                              =+##=---+#%#****#                            ");
System.out.println("                              +#*+=-----=-==+**                            ");
System.out.println("                              *#*+==----=-=+**+                            ");
System.out.println("                            ++++==--======+***=                            ");
System.out.println("                            =++===*##%%*+%@%%*+                            ");
System.out.println("                             =====--===-=%%%#*+                            ");
System.out.println("                              ++=+=====-=#*+*+=                            ");
System.out.println("                               +==++==***###++                             ");
System.out.println("                               ++++*%%%%%%%#+                              ");
System.out.println("                               -+*+##*#####*                               ");
System.out.println("                              ::=+#%##*#%%#=                               ");
System.out.println("                            *-.:::+#%%%%%#*=                               ");
System.out.println("                       ======-:::-:-+%%%*++==+++=                          ");
System.out.println("                  :....==+=--+:.+%%%%##%%%%**=--=+==-                      ");
System.out.println("               ::......+*=-+#*+:*%%%%%%%%%%+*##++==++...:-                 ");
System.out.println("              ::::----:***#####+#%#*=:::*%#=*%###****-::---                ");
System.out.println("             ::-=------##########+:::.:::::-###*#####=::==-=               ");
System.out.println("            ::--=--:-:-###########-::::::::=#########+:-=-:+=              ");
System.out.println("           ------=-:--=###########+::::::::*#########*-=--:+=              ");
System.out.println("           :--:--====-=%###########=-:::::-###########=+-:=+-+             ");
System.out.println("          ---=-:--=+++#%############=:::::*#########%%+*-=-:=+-            ");
System.out.println("         -::---:::-**+%%%############::::*#########%%%**-::-=-=+           ");
System.out.println("         :--:-----=*#%%%%############*::+%%%%####%%%%%#=::::-:==           ");
System.out.println("        :::---:-=-+#@%%%%%####%%######**%%%%##%%%%%%%%%+-:::::==-          ");
System.out.println("       -=-------==*%@%%%%%%#%%%%%%%*=----=+*%%%%%%%%%%%*---:-:=++=         ");
System.out.println("      -----:---=*##%%%%%%%%##%%#=:=+*#%@%##%##%%%%%%%  #=---:-+-==+        ");
System.out.println("     -::---====+*## %%%%%%%%%#=-==-==**++++==+***+=-=====--=:----=-:       ");
System.out.println("     +=-::..:-**=+  %%####*+:-===-==+***###%%%%++*+=--=+==-::-::::-=       ");
System.out.println("    ==-::...::.:........:====+++++==+++++++***#*====+*#**####==:.---=      ");
System.out.println("    +=+=-::::::::-::::::=+++*++**#%%%%%%%%%%@@@##%%@%%%%%%%%%****+-*+      ");
System.out.println("    +*+++=-=+++==------=+***###########%%@@@@@@@@@@@%%%%%@@%##**####*      ");
System.out.println("    +*+++###+=+++==***###%%%@@@@%%%%%@@@@@@@@@@@@%@@@@@@@%######%%%%#      ");
System.out.println("     ##%%##%%#*==***#%%%%%@%%##%%%%@@#%%@%##%%%%%%%%#*#%#%@%*#%%%*%%@%%####");
System.out.println("########%%%##***#####*%*****+*%%%@@@@@%%#%%@@@@@%####%@@@@@#%%#%%@%#@%%####");
System.out.println("#####%%%%%%%%%##%%%%%%%%%%%%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%%%%%%%%%%#####");
System.out.println("**############********##############%%%%@@@@@@@@@@@@@%%%%%%%%%%%%########**");
System.out.println("#*******+**********************************##################*****+++*****#");
System.out.println("#####=++====*=###########*#*****+++=+=+++***********#######=*+====++#######");
System.out.println("#*#***+**++*################*****+++++++****################*=+******+*+**+");
System.out.println("*******#####################=**+*+*+**+*++*+=###################*++++******");
System.out.println("*+**#####################=*****+*******+*+*+**=*##################**++**==+");
System.out.println("########################-*##+**+*#+****#*+*###++#######################***#");
System.out.println("Cashing out already? Well you swindled us out of: $" + money);

 

	
	}
}
