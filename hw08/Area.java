import java.util.Scanner;
public class Area{
public static void main (String [] agrs){
Scanner myScanner = new Scanner (System.in);
boolean goodInput = false; //intially declares "goodimput

String tri = "triangle";
String rec = "rectangle";
String cir = "circle";
String shape;
double area=0;


do{
    goodInput = false;
    System.out.print("enter a shape: ");
    shape = myScanner.nextLine();
        if (shape.equals(tri)||shape.equals(rec)||shape.equals(cir)){
           goodInput=true;
        }
        else{
            System.out.println("enter a valid shape");
            goodInput=false;
        }
    }while(!goodInput);

double height=0;
double base=0;
double width=0;
double length=0;
double radius=0;
goodInput=false;

if(shape.equals(tri)){
    
    do {                                                                    
        try {
        
         System.out.print("enter base ");
            base = myScanner.nextDouble();
         goodInput = true;
    } catch (Exception e) {
     System.out.println("Enter an int, please");
     goodInput =false;
     String clear = myScanner.nextLine();
    } 
    }while (!goodInput);
    
    do {                                                                    
        try {
        goodInput = true;
         System.out.print("enter height ");
            height = myScanner.nextDouble();
         
    } catch (Exception e) {
     System.out.println("Enter an int, please");
     goodInput =false;
     String clear = myScanner.nextLine();
    } 
    }while (!goodInput);
    
area=((base*height)/2);
System.out.println("Area of triangle is  "+area);
    
}
    
if(shape.equals(rec)){
    
    do {                                                                    
        try {
        
         System.out.print("enter width ");
            width = myScanner.nextDouble();
         goodInput = true;
    } catch (Exception e) {
     System.out.println("Enter an int, please");
     goodInput =false;
     String clear = myScanner.nextLine();
    } 
    }while (!goodInput);
    
    do {                                                                    
        try {
        goodInput = true;
         System.out.print("enter length ");
            length = myScanner.nextDouble();
         
    } catch (Exception e) {
     System.out.println("Enter an int, please");
     goodInput =false;
     String clear = myScanner.nextLine();
    } 
    }while (!goodInput);
 
area=(width*length);
System.out.println("Area of Rectangle is  "+area);
}

if(shape.equals(cir)){
    
    do {                                                                    
        try {
        
         System.out.print("radius ");
            radius = myScanner.nextDouble();
         goodInput = true;
    } catch (Exception e) {
     System.out.println("Enter an int, please");
     goodInput =false;
     String clear = myScanner.nextLine();
    } 
    }while (!goodInput);
    
    
area=((Math.PI)*(radius*radius));
System.out.println("Area of Circle is  "+area);
}
    
    
}
}
