import java.util.Scanner; //introduces scanner to program

public class Block{
    			// main method required for every Java program
public static void main(String[] args) {
   			
   	Scanner myScanner = new Scanner ( System.in ) ; //construct my own scanner
   	
   	System.out.print("Enter the length of the block"); //prompts user to enter desired value
   	double length = myScanner.nextDouble(); //tells scanner to take previous imput to be check cost
   	
   		System.out.print("Enter the width of the block"); //see line 9
   	double width = myScanner.nextDouble(); //see line 10
   	
   		System.out.print("Enter the height of the block"); //see line 9
   	double height = myScanner.nextDouble(); //see line 10
   	
   double volume= (height*width*length); //calculates volume of block l*w*h
   
   double surfaceArea= (2*((length*width)+(length*height)+(width*height))); //calculates surface area of block  2*(lw + lh + wh)
   
   System.out.println("The volume of the block of dimensions "+length+" x "+width+
   " x "+height+"  is "+volume+" .");
   System.out.println("The surface area of the block is "+surfaceArea+" .");
   			}
   			
   			}