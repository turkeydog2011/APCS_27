/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
Wizard[] wz = new Wizard[100];
Warrior[]  wr = new Warrior[100];
for(int i = 0; i<wz.length;i++){
	wz[i]=new Wizard();
		wr[i]=new Warrior();

}
int wiz = 100;
int war = 100;
while(wiz!=0&&war!=0){
	while(!wz[wiz-1].isDead()&&!wr[war-1].isDead()){
wz[wiz-1].attack(wr[war-1]);
wr[war-1].attack(wz[wiz-1]);

	}
	if(wz[wiz-1].isDead()){
wiz--;
	}
	if(wr[war-1].isDead()){
war--;

	}
}
if(wiz==0){
	System.out.println("warrior won, there were " + war + " left");

}
if(war==0){
	System.out.println("wizard won, there were " + wiz + " left");
}

	}
}
