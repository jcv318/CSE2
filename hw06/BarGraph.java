/* 
Jackson Viscomi
October 6th
hw #6 pt 1
*/
import java.util.Scanner; //introduces scanner to program
public class BarGraph{
    			// main method required for every Java program
public static void main(String[] args) {

Scanner myScanner = new Scanner ( System.in ) ; //construct my own scanner
 	
double monExp = 0;  //declares the double variables of each day's expenses
double tueExp = 0;
double wedExp = 0;
double thurExp = 0;
double friExp = 0; 
double satExp = 0;
double sunExp = 0;

boolean goodInput = false; //intially declares "goodimput" as false

do {                                                                        // do while statment checking that the user enters the info in correctly (repeats for each day of the week)
    try {
    goodInput = true;
System.out.print("imput monday's expenses as an int");
   monExp = myScanner.nextDouble();
} catch (Exception e) {
 System.out.println("Enter an int, please");
 goodInput =false;
 String clear = myScanner.nextLine();
} 
} while (!goodInput);
    
do {
    try {
    goodInput = true;
System.out.print("imput tuesday's expenses as an int");
   tueExp = myScanner.nextDouble();
} catch (Exception e) {
 System.out.println("Enter an int, please");
 goodInput =false;
 String clear = myScanner.nextLine();
} 
} while (!goodInput);

do {
    try {
    goodInput = true;
System.out.print("imput wednesday's expenses as an int");
   wedExp = myScanner.nextDouble();
} catch (Exception e) {
 System.out.println("Enter an int, please");
 goodInput =false;
 String clear = myScanner.nextLine();
} 
} while (!goodInput);
    
    do {
    try {
    goodInput = true;
System.out.print("imput thursday's expenses as an int");
   thurExp = myScanner.nextDouble();
} catch (Exception e) {
 System.out.println("Enter an int, please");
 goodInput =false;
 String clear = myScanner.nextLine();
} 
} while (!goodInput);
    
    do {
    try {
    goodInput = true;
System.out.print("imput friday's expenses as an int");
   friExp = myScanner.nextDouble();
} catch (Exception e) {
 System.out.println("Enter an int, please");
 goodInput =false;
 String clear = myScanner.nextLine();
} 
} while (!goodInput);

do {
    try {
    goodInput = true;
System.out.print("imput saturday's expenses as an int");
   satExp = myScanner.nextDouble();
} catch (Exception e) {
 System.out.println("Enter an int, please");
 goodInput =false;
 String clear = myScanner.nextLine();
} 
} while (!goodInput);
            

do {
    try {
    goodInput = true;
System.out.print("imput sunday's expenses as an int");
   sunExp = myScanner.nextDouble();
} catch (Exception e) {
 System.out.println("Enter an int, please");
 goodInput =false;
 String clear = myScanner.nextLine();
} 
} while (!goodInput);

System.out.println("Expenses for Monday:   $"+monExp);    //displays first part of chart
System.out.println("Expenses for Tuesday:   $"+tueExp);
System.out.println("Expenses for Wednesday:   $"+wedExp);
System.out.println("Expenses for Thursday:   $"+thurExp);
System.out.println("Expenses for Friday:   $"+friExp);
System.out.println("Expenses for Saturday:   $"+satExp);
System.out.println("Expenses for Sunday:   $"+sunExp);

System.out.print("Mon:   ");                        //displays "Mon:" and then runs a calculation that prints a star for every dollar (rounded up or down)..repeats for every day of the week
int num=0;
while (num < (Math.round(monExp))){
System.out.print("*");
num=num+1;
}
System.out.println("");

System.out.print("Tue:   ");
int num2=0;
while (num2 < (Math.round(tueExp))){
System.out.print("*");
num2=num2+1;
}
System.out.println("");

System.out.print("Wed:   ");
int num3=0;
while (num3 < (Math.round(wedExp))){
System.out.print("*");
num3=num3+1;
}
System.out.println("");

System.out.print("Thr:   ");
int num4=0;
while (num4 < (Math.round(thurExp))){
System.out.print("*");
num4=num4+1;
}
System.out.println("");

System.out.print("Fri:   ");
int num5=0;
while (num5 < (Math.round(friExp))){
System.out.print("*");
num5=num5+1;
}
System.out.println("");

System.out.print("Sat:   ");
int num6=0;
while (num6 < (Math.round(satExp))){
System.out.print("*");
num6=num6+1;
}
System.out.println("");

System.out.print("Sun:   ");
int num7=0;
while (num7 < (Math.round(sunExp))){
System.out.println("*");
num7=num7+1;
}
System.out.println("");

System.out.println("");

double avgExp= ((monExp+tueExp+wedExp+thurExp+friExp+satExp+sunExp)/7);             //calculation for the weekly expense 
System.out.println("Your average weekly expenses are:  $"+avgExp);

double fouryearExp= (208*avgExp)*((Math.random()*40)-20)*.01;                           //calculates 4 year expense by taking a math.random from 0-40 and then subtracting it by 20, making the range -20 to 20
fouryearExp= (int)fouryearExp*100;
fouryearExp= (double)fouryearExp/100; 
System.out.println("Your average four year expenses are:  $"+fouryearExp);


}
}