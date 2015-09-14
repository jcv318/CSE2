import java.util.Scanner; //introduces scanner to program

public class hw03{
    			// main method required for every Java program
   			public static void main(String[] args) {

Scanner myScanner = new Scanner ( System.in ) ; //construct my own scanner

System.out.print("Enter the current time");
int currentTime = myScanner.nextInt();

System.out.print("Enter the time that you will be eating dinner");
int dinnerTime = myScanner.nextInt();

double difference = dinnerTime - currentTime; 

int hours =(int)difference ;
hours= (hours/100);
double mins = difference % 100; 
System.out.println("You have " +hours+ " hours and " + mins + " minutes until dinner");




   			    
   			    
   			    
   			    
   			    
   			    
   			}
}