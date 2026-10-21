/*
 *	Author:  
 *  Date: 
*/

import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.*;

class starter {
	static long startTime = 0;
	static ArrayList<String> arr = new ArrayList<String>();

	public static void main(String args[]) throws InterruptedException {
		// Write your code here!
		Scanner evil = new Scanner(System.in);
		populateArrayList();
		System.out.println("would you like to play a typing game?");
		String play = evil.nextLine();
		boolean pley;
		if(play.equalsIgnoreCase("yes")|| play.equalsIgnoreCase("y")) {
			
			 pley = true;
		} else {
			pley = false;
		}
			while(pley == true){
			int mide = 2;
			while(mide == 2){
				System.out.println("Which mode would you like choose a sentence(type choose) or use a random(type random)");
			String mode = evil.nextLine();
			if(mode.equalsIgnoreCase("choose")) {
				mide = 0;
			} else if(mode.equalsIgnoreCase("random")) {
mide = 1;
			} else{
				System.out.println("Sorry, didnt catch that, could you say it again?");
				mide =2;
			}
			}
			String sentence;
			if(mide == 0) {
				System.out.println("Great, which sentence would you like(1-100)?");
				int sent = evil.nextInt();
				evil.nextLine();
				sentence = getSentence(sent);
			} else {
				sentence = getSentence();
			}
			System.out.println("Your sentence is: " + sentence);
			countdown();
			startTimer();
			String answer = evil.nextLine();
			double time = 100000000;
			boolean win = false;
			if(answer.equals(sentence)) {
System.out.println("you did it! Your time was: " + endTimer());
if(endTimer()<time){
	time = endTimer();
	win = true;
}

			} else {
				System.out.println("Sorry, thats wrong.");
								System.out.println("You had " + compareSentences(sentence, answer) + " errors");
									System.out.println("Your time was: " + endTimer());
			}
			if (win == true){
			System.out.println("Your highscore is: " + time);
			}
			System.out.println("Would you like to play again?");
			play = evil.nextLine();
			if(play.equalsIgnoreCase("yes")|| play.equalsIgnoreCase("y")) {
			
			 pley = true;
		} else {
			pley = false;
		}
			}

		


		
	}

	// This method returns the local current time as a String
	public static String getTime(){
		LocalTime now = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss a");
        return now.format(format);
	}

	// This method starts a clock that can be used throughout the program
	public static void startTimer(){
		startTime = System.nanoTime();
	}

	// This method stops the timer clock and returns a double of the seconds and milliseconds of the stopwatch
	public static double endTimer() throws InterruptedException{
		long endTime = System.nanoTime();
		long timeSeconds = ((endTime - startTime)/1000000);
		double decSeconds = timeSeconds/1000.0;
		return decSeconds;
	}

	// This method does a 3 second countdown and prints it to the terminal
	public static void countdown(){
		System.out.println("Starting countdown...");
		for (int i = 0; i < 3; i++) {
			System.out.println(3-i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("Go!");
	}

	// This method sets up a list of sentences to be called from. 
	// This should only be called once prior to getting sentences.
	private static void populateArrayList(){
		File f = new File("sentences.txt");
		try(Scanner fsc = new Scanner(f)){
			while(fsc.hasNextLine()){
				arr.add(fsc.nextLine());
			}
		}
		catch(FileNotFoundException e){
			System.err.println("File not found: " + e.getMessage());
		}
	}

	// This chooses 1 of the 100 sentences in the list to return.
	public static String getSentence(){
		populateArrayList();
		int rand = (int)(Math.random()*100);
		return arr.get(rand);
	}

	// This returns the same sentence for the same integer given.
	public static String getSentence(int index){
		populateArrayList();
		return arr.get(index%100);
	}

	//  This returns the number of letters, spaces, and punctuations in a sentence.
	public static int lettersInSentence(String sent){
		return sent.length();
	}
	
	// This returns the number of words in a sentence
	public static int wordsInSentence(String sent){
		int spaceCount = 0;
		while(sent.indexOf(" ") > -1){
			spaceCount++;
			sent = sent.substring(sent.indexOf(" ")+1);
		}
		return ++spaceCount;
	}

	// This method does a letter by letter comparison of each word and returns the number of errors.
	public static int compareSentences(String given, String typed){
		int errors = 0;
		while(given.length() > 0 && typed.length() > 0){
			if(!given.substring(0,1).equals(typed.substring(0,1)))
				errors++;
			given = given.substring(1);
			typed = typed.substring(1);
		}
		return errors;
	}

}

