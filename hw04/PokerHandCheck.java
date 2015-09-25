//Jackson Viscomi
//MWF 11:10 
//F Lab 11:10

//I spent many days trying to compile this code, unfortunaly, I was not able to come up with
//a sucsessful code to determine the special hands. Here is what I have so far.


public class PokerHandCheck{
    			// main method required for every Java program
public static void main(String[] args) {
    
System.out.println("Your random cards were:"); //first part of the output

 int card = (int)(Math.random()*53); //randomizes card number
String suite ="1"; 
if (card<=13){
 suite= "diamonds";  //which suite is diamonds
}
    else if (card <=26 && card >13){ //"...clubs"
    suite= "clubs";
    }
    else if (card <=39 && card >26 ){ //"...hearts"
        suite="hearts";
    }
    else if (card <=52 && card >39){
    
        suite="spades"; //"...spades"
    }


String rank ="-1";            //switch statement to match number to card rank by using a mod operation of 13 

switch(card % 13) {
case 1:
    
        rank = "Ace";
        break;
    
case 2:
    
        rank = "2";
        break;
case 3:
    
        rank = "3";
        break;
case 4:
    
        rank = "4";
        break;
case 5:

        rank = "5";
        break;
case 6:

        rank = "6";
        break;
case 7:
    
        rank = "7";
        break;
case 8:
        rank = "8";
        break;
case 9:
        rank = "9";
        break;
case 10:
        rank = "10";
        break;
case 11:
        rank = "Jack";
        break;
case 12:
        rank = "Queen";
        break;
case 13:
        rank = "King";
        break;
}

System.out.println("You picked the " +rank+ " of " +suite );

     int card2 = (int)(Math.random()*53); //same as card 1, but for users second random card
String suite2 ="1"; 
if (card2<=13){
 suite2= "diamonds";  
}
    else if (card2 <=26 && card2 >13){
    suite2= "clubs";
    }
    else if (card2 <=39 && card2 >26 ){
        suite2="hearts";
    }
    else if (card2 <=52 && card2 >39){
    
        suite2="spades";
    }


String rank2 ="1";

switch(card2 % 13) {
case 1:
        rank2 = "Ace";
        break;
case 2:
        rank2 = "2";
        break;
case 3:
        rank2 = "3";
        break;
case 4:
        rank2 = "4";
        break;
case 5:
        rank2 = "5";
        break;
case 6:
        rank2 = "6";
        break;
case 7:
        rank2 = "7";
        break;
case 8:
        rank2 = "8";
        break;
case 9:
        rank2 = "9";
        break;
case 10:
        rank2 = "10";
        break;
case 11:
        rank2 = "Jack";
        break;
case 12:
        rank2 = "Queen";
        break;
case 13:
        rank2 = "King";
        break;
}

System.out.println("You picked the " +rank2+ " of " +suite2 );
     
     
     //user's 3rd random card
     int card3 = (int)(Math.random()*53);
String suite3 ="1"; 
if (card3<=13){
 suite3= "diamonds";  
}
    else if (card3 <=26 && card3 >13){
    suite3= "clubs";
    }
    else if (card3 <=39 && card3 >26 ){
        suite3="hearts";
    }
    else if (card3 <=52 && card3 >39){
    
        suite3="spades";
    }


String rank3 ="1";

switch(card3 % 13) {
case 1:
        rank3 = "Ace";
        break;
case 2:
        rank3 = "2";
        break;
case 3:
        rank3 = "3";
        break;
case 4:
        rank3 = "4";
        break;
case 5:
        rank3 = "5";
        break;
case 6:
        rank3 = "6";
        break;   
case 7:
        rank3 = "7";
        break;
case 8:
        rank3 = "8";
        break;
case 9:
        rank3 = "9";
        break;
case 10:
    
        rank3 = "10";
        break;
case 11:
        rank3 = "Jack";
        break;
case 12:
        rank3 = "Queen";
        break;
case 13:
        rank3 = "King";
        break;
}
System.out.println("You picked the " +rank3+ " of " +suite3 );
     
     //user's 4th random card
     int card4 = (int)(Math.random()*53);
String suite4 ="1"; 
if (card4<=13){
 suite4= "diamonds";  
}
    else if (card4 <=26 && card4 >13){
    suite4= "clubs";
    }
    else if (card4 <=39 && card4 >26 ){
        suite4="hearts";
    }
    else if (card4 <=52 && card4 >39){
    
        suite4="spades";
    }


String rank4 ="1";

switch(card4 % 13) {
case 1:
        rank4 = "Ace";
        break;
case 2:
        rank4 = "2";
        break;
case 3:
        rank4 = "3";
        break;
case 4:
        rank4 = "4";
        break;
case 5:
        rank4 = "5";
        break;
case 6:
        rank4 = "6";
        break;
case 7:
        rank4 = "7";
        break;
case 8:
        rank4 = "8";
        break;
case 9:
        rank4 = "9";
        break;
case 10:
        rank4 = "10";
        break;
case 11:
        rank4 = "Jack";
        break;
case 12:
        rank4 = "Queen";
        break;
case 13:
        rank4 = "King";
        break;
}
System.out.println("You picked the " +rank4+ " of " +suite4 );
//user's 5th random card
    
     int card5 = (int)(Math.random()*53);
String suite5 ="1"; 
if (card5<=13){
 suite5= "diamonds";  
}
    else if (card5 <=26 && card5 >13){
    suite5= "clubs";
    }
    else if (card5 <=39 && card5 >26 ){
        suite5="hearts";
    }
    else if (card5 <=52 && card5 >39){
    
        suite5="spades";
    }


String rank5 ="1";

switch(card5 % 13) {
case 1:
        rank5 = "Ace";
        break;
case 2:
        rank5 = "2";
        break;
case 3:
        rank5 = "3";
        break;
case 4:
        rank5 = "4";
        break;
case 5:
        rank5 = "5";
        break;
case 6:
        rank5 = "6";
        break;
case 7:
        rank5 = "7";
        break;
case 8:
        rank5 = "8";
        break;
case 9:
        rank5 = "9";
        break;
case 10:
        rank5 = "10";
        break;
case 11:
        rank5 = "Jack";
        break;
case 12:
        rank5 = "Queen";
        break;
case 13:
        rank5 = "King";
        break;
}
System.out.println("You picked the " +rank5+ " of " +suite5 );
String hand="";
//boolean statements describing every possible pair combo
boolean pair = suite.equals(suite2);
boolean pair2 = suite.equals(suite3);
boolean pair3 = suite.equals(suite4);
boolean pair4 = suite.equals(suite5);
boolean pair5 = suite2.equals(suite3);
boolean pair6 = suite2.equals(suite4);
boolean pair7 = suite2.equals(suite5);
boolean pair8 = suite3.equals(suite4);
boolean pair9 = suite3.equals(suite5);
boolean pair10 = suite4.equals(suite5);

//boolean statemetns with every possible two pair combo
boolean twoPair1 = (suite.equals(suite2) && suite.equals(suite3));
boolean twoPair2 = (suite.equals(suite2) && suite.equals(suite4));
boolean twoPair3 = ( suite.equals(suite2) && suite.equals(suite5));
boolean twoPair4 = (suite.equals(suite3) && suite.equals(suite5));
boolean twoPair5 = (suite.equals(suite4) && suite.equals(suite5));
boolean twoPair6 = (suite2.equals(suite3) && suite.equals(suite4));
boolean twoPair7 = (suite2.equals(suite3) && suite.equals(suite5));
boolean twoPair8 = (suite3.equals(suite4) && suite.equals(suite5));

//boolean statement with every possible three of a kind combo
boolean threeKind = (rank.equals(rank2) && rank.equals(rank3) );
boolean threeKind2 = (rank.equals(rank2) && rank.equals(rank4));
boolean threeKind3 = (rank.equals(rank2) && rank.equals(rank5));
boolean threeKind4 = (rank.equals(rank3) && rank.equals(rank5));
boolean threeKind5 = (rank.equals(rank4) && rank.equals(rank5));
boolean threeKind6 = (rank2.equals(rank3) && rank2.equals(rank4));
boolean threeKind7 = (rank2.equals(rank3) && rank2.equals(rank5));
boolean threeKind8 = (rank3.equals(rank4) && rank3.equals(rank5));

//This is where I ran into trouble..the if statemetns where meant to run so if any of the variations of the specail hands where,  it would print out a statement 
if (pair= true || pair2= true || pair3 = true|| pair4= true || pair5= true || pair6= true || pair7= true || pair8= true || pair9= true  || pair10 = true){
system.out.println("you have a pair!");
}

else if (twoPair1= true || twoPair2= true || twoPair3= true || twoPair4= true || twoPair5= true || twoPair6= true || twoPair7= true || twoPair8 =true){
    system.out.println("you have a two pair!");
}

else if ( threeKind= true || threeKind2= true || threeKind3= true || threeKind4= true || threeKind5= true || threeKind6= true || threeKind7= true || threeKind8 = true){
    system.out.println("you have a three of a kind!");
}
else { 
    system.out.println("you have a high card hand!"); //an else statement if you receive no special combos

}  
}
}