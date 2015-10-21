import java.util.Scanner; 
public class Area{
public static void main (String [] agrs){
Scanner myScanner = new Scanner (System.in);
boolean goodInput = false; //intially declares "goodimput

String tri = "triangle"; //initializing shapes 
String rec = "rectangle";
String cir = "circle";
String shape;
double area=0;


do{ //boolean do while input to make sure input is correct
    goodInput = false;
    System.out.print("enter a shape: ");
    shape = myScanner.nextLine();
        if (shape.equals(tri)||shape.equals(rec)||shape.equals(cir)){
           goodInput=true; //if the input matches, boolean is cool 
        }
        else{
            System.out.println("enter a valid shape");
            goodInput=false; //else, keep asking
        }
    }while(!goodInput); //only ends with true boolean 

double height=0; //initialzing all parameters
double base=0;
double width=0;
double length=0;
double radius=0;
goodInput=false;

if(shape.equals(tri)){ //if user puts in 'triangle'
    
    do {                                                                    
        try {
        
         System.out.print("enter base "); //tells user to input base
            base = myScanner.nextDouble();
         goodInput = true;
    } catch (Exception e) { //must be int
     System.out.println("Enter an int, please");
     goodInput =false;
     String clear = myScanner.nextLine();
    } 
    }while (!goodInput);
    
    do {                                 //user enters height                                   
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
    
area=((base*height)/2); //area formula
System.out.println("Area of triangle is  "+area);
    
}
    
if(shape.equals(rec)){ //if user chooses rectangle
    
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

if(shape.equals(cir)){ //if user enters circle
    
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
    
    
area=((Math.PI)*(radius*radius)); //used Math.PI to get 3.14 value
System.out.println("Area of Circle is  "+area);
}
    
    
}
}//end
