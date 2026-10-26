/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static int getObject(){
     return (int)(Math.random()*3);
    }
    public static int getnumb(String a){
        if(a.equalsIgnoreCase("rock")){
            return 0;
        } else if(a.equalsIgnoreCase("paper")) {
            return 1;
        } else {
            return 2;
        }
    }
    public static String getans(int a){
        if(a == 0){
            return "Rock";
        } else if(a == 1) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }
    public static int compare2(int pla1, int pla2){
        if (pla1 == 0 &&pla2 == 0) {
            return 0;
        } else if (pla1 == 0 && pla2 == 1) {
            return 2;
        }else if (pla1 == 0 && pla2 == 2) {
            return 1;
        }else if (pla1 == 1 && pla2 == 0) {
            return 1;
        }else if (pla1 == 1 && pla2 == 1) {
            return 0;
        }else if (pla1 == 1 && pla2 == 2) {
            return 2;
        }else if (pla1 == 2 && pla2 == 0) {
            return 2;
        }else if (pla1 == 2 && pla2 == 1) {
            return 1;
        } else {
            return 0;
        }

    }
    public static void main(String[] args) {
        int ans = 0;
                Scanner evil = new Scanner(System.in);

        while(ans < 2){
            ans = 3;
        while(ans ==3){
        System.out.println("Would you like to play rock, paper, scissors");
        String playans = evil.nextLine();
        
        if(playans.equalsIgnoreCase("yes")){
            ans = 0;
        } else if (playans.equalsIgnoreCase("no")) {
            ans = 1;
        } else if (playans.equalsIgnoreCase("done")) {
            ans = 2;
        } else {
System.out.println("sorry, didnt catch that, lets try again");
        }
    }
    if(ans == 0){
        int complay = getObject();
System.out.println("what will you play?");
String whatplay = evil.nextLine();
if (compare2(getnumb(whatplay),complay) == 0) {
    System.out.println("I play " + getans(complay));

System.out.println("It was a tie!");
} else if (compare2(getnumb(whatplay),complay) == 1) {
System.out.println("I play " + getans(complay));
System.out.println("You win!");
} else {
    System.out.println("I play " + getans(complay));
    System.out.println("Sorry you lost...");
}
System.out.println();

        } else if (ans ==1) {
            System.out.println("How many games should be played"); 
            int compgame = evil.nextInt();
            evil.nextLine();
            int cycles =0;
            while(cycles<compgame) {
             int   complay1 = getObject();
            int    complay2 = getObject();
                if (compare2(complay1,complay2) == 0) {
    System.out.println("Player 1 plays: " + getans(complay1));
        System.out.println("Player 2 plays: " + getans(complay2));


System.out.println("It was a tie!");
} else if (compare2(complay1,complay2) == 1) {
System.out.println("Player 1 plays: " + getans(complay1));
        System.out.println("Player 2 plays: " + getans(complay2));System.out.println("Player 1 wins!");
} else {
    System.out.println("Player 1 plays: " + getans(complay1));
        System.out.println("Player 2 plays: " + getans(complay2));
    System.out.println("Player 2 wins!");
}
System.out.println();
cycles= cycles +1;
            }
        }



    }
}
}
