/* 
Jackson VIscomi
CSE 002 - Chen
HW 12
11/17/15
*/


import java.util.Scanner;
public class Transpose{
    public static int [][] randomMatrix(int width, int height){ 
        int[][]matrix=new int[width][height]; //declares array
        for(int i=0;i<width;i++){ 
            for(int j=0;j<height;j++){
                matrix[i][j]=-10+(int)(Math.random()*((20)+1)); //nested for loop assigning member arrays w/ random number between -10 and 10
            }
        }
        return matrix; //returns array
    }
    
    public static void printMatrix(int[][] matrix, int width,int height){
        if(width==height){ //if it is a squre, it is not proper
            System.out.println("Input must be rectangular");
            return;
        }
        else{
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){
                    System.out.print(matrix[i][j]+" "); //like the declaration, except printing out the already declared values
                }
            System.out.println();   //spaceing them 
            }
        }    
    }
    
    public static int[][] transposeMatrix(int[][] matrix, int width, int height){
        int[][]matrix1 = new int [width][height]; //starting a new array
        for(int i=0; i<height;i++){
            for(int j=0; j<width; j++){  //same as random matrix
                matrix1[j][i]=matrix[i][j];    //except we switch the width and height!
            }
        }
        return matrix1; //returns matrix
    }
    
public static void main(String[] args) {
    Scanner scan = new Scanner ( System.in ); //naming scanner
    boolean goodinput= false;
    int height =0;
    int width =0;

    
    while(goodinput!=true){ //while loop not wokring until true imput
        System.out.println("Enter hieght");
        
        
        if(scan.hasNextInt()){ //checking for ints
           height=scan.nextInt();
            if(height>0){ //making sure height is over 0
                
                goodinput=true; //breaks loop
                
            }
            else{
                goodinput=false;
            }
        }
        else{ //if not an int
            goodinput=false;
            System.out.println("Restart, and only enter ints!!");
            return;
        }
        
    }
    goodinput=false; 
    while(goodinput!=true){ //same as height
        System.out.println("Enter width");
        
        if(scan.hasNextInt()){
            width=scan.nextInt();
            if(width>0){
                
                goodinput=true;
            }
            else{
                goodinput=false;
                System.out.println("Restart, and only numbers above 0");
                return;
                
            }
        }
        else{
            goodinput=false;
            System.out.println("Restart, and only enter ints!!");
            return;
        }
    }
    System.out.println("Random Matrix:");
    int[][] matrix=randomMatrix(height,width); //declares array as the return
    printMatrix(matrix, width,height); //prints array
    
    System.out.println();
    System.out.println("Transpose Matrix:");
    int[][] matrix1=transposeMatrix(matrix,width,height); //declares new matrix as the return
    printMatrix(matrix1, width,height);
    
    
}
}