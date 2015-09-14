//Jackson Viscomi
//Lab 03
//9.11.2015


import java.util.Scanner; //introduces scanner to program

public class lab03{
    			// main method required for every Java program
   			public static void main(String[] args) {

Scanner myScanner = new Scanner ( System.in ) ; //construct my own scanner

System.out.print("Enter original cost of the check (xx.xx): "); //command prompt for cost of check

double checkCost = myScanner.nextDouble(); //tells scanner to take previous imput to be check cost

System.out.print("Enter desired tip percentage (xx %): "); //command prompt for tip percentage

double tipPercent = myScanner.nextDouble(); //tells scanner to take previous imput to be check cost
tipPercent =(tipPercent/100);

System.out.print("Enter the number of people who went out to dinner:  "); //command prompt
int numbPeople =myScanner.nextInt(); //command becomes num of people

double totalCost;
double costPerPerson;  //declares values as double

int dollars, dimes, pennies; //dollars, dimes, and pennies are ints

totalCost= checkCost*(1 + tipPercent);  
costPerPerson= (totalCost/numbPeople);   //basic calculations for result
dollars= (int) costPerPerson;
dimes= (int) (costPerPerson*10)%10;  //number of dimes needed for exact change
pennies= (int) (costPerPerson*100) %10; //number of pennies needed for exact change

System.out.println("Each person owes $" + dollars + '.' + dimes + pennies); //shows resulting calculation of code





   			    
   			    
   			    
   			    
   			    
   			}  //end of main method   
  	} //end of class
