/* Jackson Viscomi
   CSE 2 - Chen
   HW 10 - Shuffling
   11/2/2015
*/

import java.util.Scanner;
public class shuffling{
  public static void main(String[] args) {
   
	//suits club, heart, spade or diamond
    String[] suitNames={"C","H","S","D"};   
    String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
    String[] cards = new String[52];
    String[] hand = new String[5];
    System.out.println("Here is your deck");
    for (int i=0; i<52; i++){                   //for loop that displays deck of cards using a mod of 13
      cards[i]=rankNames[i%13]+suitNames[i/13];
      System.out.print(cards[i]+" ");
    }
    
    
    System.out.println(); //spacing
    shuffle(cards); //running shuffle method
    printArray(cards); //printing shuffle method
    System.out.println(); //spacing
    System.out.println("Here is your hand");
    hand = randomizeHand(cards); //displaying 5 card hand of shuffled cards
    printArray(hand);
      }



public static void printArray(String[] cards){ //method for prinitng cards 
  for(int i=0;i<cards.length;i++){ //using cards.length and limit for the for loop
    System.out.print(cards[i]+" "); //prinitng each card out with a space
  }
}
  
public static void shuffle(String[] cards1){ //shuffle method
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number of times you want to shuffle");
    int n=scan.nextInt(); //registering number of switchess made to shuffle deck
    int i, j, k;
    for (k=0; k<n; k++){ //for loop using the number of switches as limit
      i = (int)(52*Math.random());
      j= (int)(52*Math.random()); //assigning a random card for i and j
      String cardtemp = cards1[i];
      cards1[i] = cards1[j];
      cards1[j] = cardtemp; //temp storing each random card and then switching them
}
}
  
public static String[] randomizeHand(String[] cards2){
  int i, k;
  String[] tempHand =new String[5]; //making a temporary string to print out hand within method
  for (k=0; k<5; k++){ //for loop only prinitng out 5 cards
    i = (int)(52*Math.random());
tempHand[k] = cards2[i]; //setting temp hand equal to input
    
  }
   return tempHand; //returning temp hand to output
}
}
 



