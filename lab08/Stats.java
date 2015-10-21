import java.util.Scanner;
public class Stats{
    public static void main (String [] agrs){
        Scanner myScanner = new Scanner (System.in);
        boolean goodInput = false; //intially declares "goodimput" as false
double num=0;
System.out.print("enter number");
        num = myScanner.nextInt();

double num2 =0;
do {                                                                    
    try {
    goodInput = true;
     System.out.print("enter number");
        num2 = myScanner.nextInt();
       if (num2<num){
           System.out.println("must be increasing");
           goodInput = false;
       }
     
} catch (Exception e) {
 System.out.println("Enter an int, please");
 goodInput =false;
 String clear = myScanner.nextLine();
} 
} while (!goodInput);

double num3 =0;         //this do while statement makes sure the width is an int and less than the length
do {                                                                    
    try {
    goodInput = true;
     System.out.print("enter number");
        num3 = myScanner.nextInt();
       if (num2 > num3){
           System.out.println("must be increasing");
           goodInput = false;
       }
     
} catch (Exception e) {
 System.out.println("Enter an int, please");
 goodInput =false;
 String clear = myScanner.nextLine();
} 
} while (!goodInput);

double num4 =0;         //this do while statement makes sure the width is an int and less than the length
do {                                                                    
    try {
    goodInput = true;
     System.out.print("enter number");
        num4 = myScanner.nextInt();
       if (num3 > num4){
           System.out.println("must be increasing");
           goodInput = false;
       }
     
} catch (Exception e) {
 System.out.println("Enter an int, please");
 goodInput =false;
 String clear = myScanner.nextLine();
} 
} while (!goodInput);

double num5 =0;        //this do while statement makes sure the width is an int and less than the length
do {                                                                    
    try {
    goodInput = true;
     System.out.print("enter number");
        num5 = myScanner.nextInt();
       if (num4 > num5){
           System.out.println("must be increasing");
           goodInput = false;
       }
     
} catch (Exception e) {
 System.out.println("Enter an int, please");
 goodInput =false;
 String clear = myScanner.nextLine();
} 
} while (!goodInput);


double mean = 0;

mean = ((num+num2+num3+num4+num5)/5);

double median =0;

median = num3;

System.out.println("mean is " +mean);

System.out.println("medain is "+median);


}
}