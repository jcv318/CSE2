//Jackson Viscomi
//Lab 03
//9.11.2015


import java.util.Scanner;

public class lab03{
    			// main method required for every Java program
   			public static void main(String[] args) {

Scanner myScanner = new Scanner ( System.in ) ;

System.out.print("Enter original cost of the check (xx.xx): ");

double checkCost = myScanner.nextDouble();

System.out.print("Enter desired tip percentage (xx %): ");

double tipPercent = myScanner.nextDouble();
tipPercent =(tipPercent/100);

System.out.print("Enter the number of people who went out to dinner:  ");
int numbPeople =myScanner.nextInt();

double totalCost;
double costPerPerson; 

int dollars, dimes, pennies;

totalCost= checkCost*(1 + tipPercent);
costPerPerson= (totalCost/numbPeople);
dollars= (int) costPerPerson;
dimes= (int) (costPerPerson*10)%10;
pennies= (int) (costPerPerson*100) %10;

System.out.println("Each person owes $" + dollars + '.' + dimes + pennies);





   			    
   			    
   			    
   			    
   			    
   			}  //end of main method   
  	} //end of class
