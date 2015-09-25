public class lab04{
    			// main method required for every Java program
public static void main(String[] args) {

int card = (int)(Math.random()*53);
String suite ="1"; 
if (card<=13){
 suite= "diamonds";  
}
    else if (card <=26 && card >13){
    suite= "clubs";
    }
    else if (card <=39 && card >26 ){
        suite="hearts";
    }
    else if (card <=52 && card >39){
    
        suite="spades";
    }


String rank ="-1";

switch(card % 13) {
case 1:
    {
        rank = "Ace";
        break;
    }
}

switch(card % 13) {
case 2:
    {
        rank = "2";
        break;
    }
}
switch(card % 13) {
case 3:
    {
        rank = "3";
        break;
    }
}
switch(card % 13) {
case 4:
    {
        rank = "4";
        break;
    }
}
switch(card % 13) {
case 5:
    {
        rank = "5";
        break;
    }
}
switch(card % 13) {
case 6:
    {
        rank = "6";
        break;
    }
}
switch(card % 13) {
case 7:
    {
        rank = "7";
        break;
    }
}
switch(card % 13) {
case 8:
    {
        rank = "8";
        break;
    }
}
switch(card % 13) {
case 9:
    {
        rank = "9";
        break;
    }
}
switch(card % 13) {
case 10:
    {
        rank = "10";
        break;
    }
}
switch(card % 13) {
case 11:
    {
        rank = "Jack";
        break;
    }
}
switch(card % 13) {
case 12:
    {
        rank = "Queen";
        break;
    }
}
switch(card % 13) {
case 13:
    {
        rank = "King";
        break;
    }
}


System.out.println("You picked the " +rank+ " of " +suite );









}
}