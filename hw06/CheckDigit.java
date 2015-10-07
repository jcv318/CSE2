/*Jackson Viscomi
hw 06 (Part 2)
Professor Chen
10/7/2015
*/

//program asks user to imput 10  digit ISBN number
//program uses counting theorem to determine if last digit is valid and, therefore, if the isbn number is valad
import java.util.Scanner;

public class CheckDigit{
    public static void main (String [] agrs){
        Scanner myScanner = new Scanner (System.in);   //import scanner, define class, etc.
        
        System.out.print ("Enter 10 digit ISBN number.");  //tells user to enter isbn number

      String isbnNumber = myScanner.next ();  //declares user's imput as the isbn number (stirng)
       
 char digit1; //defines each of the digits (to be used later)
 char digit2;
 char digit3;
 char digit4;
 char digit5;
 char digit6;
 char digit7;
 char digit8;
 char digit9;
 char digit10;
        

  
        do{   //do while statement that refuses bad ISBN numbers and breaks down good ones by each place in the string
     
        if (isbnNumber.length() != 10){
            System.out.print ("This is NOT a valid ISBN. Please enter 10 digits: ");
        }
        } while (isbnNumber.length() != 10);
        //divides ISBN into each digit
        digit1 = isbnNumber.charAt (0);             //breaking down each place in the users imputed string
        digit2 = isbnNumber.charAt (1);
        digit3 = isbnNumber.charAt (2);
        digit4 = isbnNumber.charAt (3);
        digit5 = isbnNumber.charAt (4);
        digit6 = isbnNumber.charAt (5);
        digit7 = isbnNumber.charAt (6);
        digit8 = isbnNumber.charAt (7);
        digit9 = isbnNumber.charAt (8);
        digit10 = isbnNumber.charAt (9);
        
        int sum;
        int checkDigit;
        sum = ((10* digit1) + (9* digit2) + (8* digit3) + (7*  digit4) + (6* digit5) + (5* digit6) + (4* digit7) + (3* digit8) + (2* digit9 ));  //equation for sum of first 9 digits
        if ((char)(sum % 11) == digit10){
            System.out.println ("This is a valid ISBN");  //if the sum mod 11 is the 10th digit; valid ISBN
        }
        else{
            if ((sum % 11) == 10){  //however, in the special case its a 10, an "x" is put in 
                checkDigit = 'X';
            }
            else{
                checkDigit = sum % 11;
            }
            System.out.println ("This is not a valid ISBN. Check Digit should be " + checkDigit);
                                //if check digit doesnt check out, it tells you its wrong, and what the check digit should be
        }
    }
}