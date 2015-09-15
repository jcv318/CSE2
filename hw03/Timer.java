import java.util.Scanner; //introduces scanner to program

public class Timer{
    			// main method required for every Java program
   			public static void main(String[] args) {

Scanner myScanner = new Scanner ( System.in ) ; //construct my own scanner

System.out.print("Enter the current time in military HHMM form"); //prompts user to enter time 1
int currentTime = myScanner.nextInt(); //tells code to use value as current time

System.out.print("Enter the time that you will be eating dinner"); //prompts user to enter time 2
int dinnerTime = myScanner.nextInt(); //tells code to use value as dinner time

double difference = dinnerTime - currentTime; //takes differnce of the two times

int hours =(int)difference ; //converts differnce into integer for decimal purposes
hours= (hours/100); //now that hours is in single decimal int, divding it by 100 wil result in the number of hours
double mins = difference % 100; // minutes is calculated by taking the remainder when dividing the differnce by 100
System.out.println("You have " +hours+ " hours and " + mins + " minutes until dinner"); //displays the result

   			}
}