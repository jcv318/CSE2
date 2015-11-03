/*  Jackson Viscomi
    10/20/15
    CSE 002
    HW 08
    
This Program uses the principal of method overloading by asking the user
to enter a string, and then ask them if they want to evaluate a certain
number of characters or the entire string. Depending on whether they entered
a string or they chose to evaluate, a certain method (all under the same name)
will evaluate it, and tell the user if it is all letters or not.

s/o 2 mike
*/
    
    

import java.util.Scanner; //import scanner
public class StringAnalysis{ // start of full program

public static boolean stringCheck(String string2, int number){ //string check if user asks for certain int
int stringLength2 = string2.length(); //counts number of characters
int count=0;
do{
    char place=string2.charAt(count); //makes the counter go down the characters
    if (!Character.isLetter(place)){
        break; //ends the loop when limit is reached
    }

    count=count+1; //increases count
}while(count<stringLength2 && count<number); //only happens within bounds of desired count
if (count>=number || count==stringLength2){
    return true; //when count is reached, cycle ends
}
else{
    return false; //if it isn't over, keep running the loop
    
}
    
}

public static boolean stringCheck(String string2){ //(if user imputs 'all') same as last, except minus the number counter
int count =0;
int stringLength2 = string2.length();
 do{
     char place =string2.charAt(count);
     if (!Character.isLetter(place)){
         break;
     }
     count=count+1;
 }while(count<stringLength2);
 if (count==stringLength2){
     return true;
 }
 else{
     return false;
 }
}

public static void main (String [] agrs){
Scanner myScanner = new Scanner (System.in);



boolean goodInput=false; //setting boolean 


System.out.print("enter a string: "); //prompting user for string
String input = myScanner.next(); //input is what he types

System.out.print("imput the number of characters you would like to evaluate or type 'all'");

do{
    if(myScanner.hasNextInt()){ //if user put in integer
        int number=myScanner.nextInt();
        if (number>0){ //number must be positive
            if(stringCheck(input,number)){ //if method is true, they are all letters
            System.out.println("All Letters"); 
        }
        else{ //if not true, there is an an int somewhere
            System.out.println("Not all letters");
        }
        goodInput=true;
    }
        else{ //if they put in something other than what I said, tell them to put input in again
        System.out.println("Please enter number of characters or type 'all'");
    }
    }
    
    else if(myScanner.hasNext("all")){ //if the person imputs 'all'
        if(stringCheck(input)){ //if method is true, all letters
            System.out.println("All letters");
        }
        else{ //if not true, there is an int somwhere
            System.out.println("Not all letters");
        }
    goodInput=true;
    }
    else{ //if they put in a wrong input, ask them again
        System.out.println("Please enter number of characters or type 'all'");
    
        myScanner.next();
    }
}while(!goodInput); //only good until boolean is true
}
} //end
    



