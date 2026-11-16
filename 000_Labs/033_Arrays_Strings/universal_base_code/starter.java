/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		String[] song = new String[10];
		song[0] = "Joan was quizzical, studied pataphysical";
		song[1] = "Science in the home";
		song[2] = "Late nights all alone with a test-tube ohh oh oh oh";
		song[3] = "Maxwell Edison majoring in medicine";
		song[4] = "Calls her on the phone";
		song[5] = "Can I take you out to the pictures, Joan?";
		song[6] = "But as she's getting ready to go";
		song[7] = "A knock comes on the door";
		song[8] = "Bang, bang, Maxwell's silver hammer";
		song[9] = "Made sure that she was dead";
		int index = 0;
while(index<song.length){
	System.out.println(song[index]);
	index++;
}

		
	}
}
