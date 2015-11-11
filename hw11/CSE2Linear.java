/* Jackson Viscomi
   CSE 2 -- Prof. Chen
   HW 11-- CSE2Linear
   
   Breif Description:
   
   This code implements a scanner, loops, arrays, and methods.This code prompts user to input grades, 
   the code will then organize them. It then asks the user to search for a praticular grade, 
   which it will then tell the user if it found it, and in how many itterations, or if it was found at all.
   It will then shuffle the grades and repeat the procsess. 
*/

import java.util.Scanner;
public class CSE2Linear{
    			// main method 
public static void main(String[] args) {
	Scanner scan = new Scanner ( System.in ); //introduces scanner "scan"
	
	int[] grade=new int[15]; //introduces method 
	System.out.println("Enter 15 grades between 0-100"); //asks user to enter grades

    for(int i=0;i<grade.length;i++){  //for loop assigning grades,
            if(scan.hasNextInt()){
                grade[i]=scan.nextInt();
                if(grade[i]<0||grade[i]>100){ //making sure number is inbetween 0 and 100
                    System.out.println("not between 0 and 100."); 
                    return;
                }
                
            }
            else{
                System.out.println("Must be an int"); //making sure number is an int
                return;
            }
        }
    
   
     
    
    System.out.println("Sorted array:"); 
    sortedGrades(grade);  //sorting grades (see method)
    showArray(grade); //priting grads (see method)
    
    
    
    System.out.println("enter a grade to find");
    int search = scan.nextInt(); //prompts user to find grade, declares grade as "seach"
    gradeSearch(grade,search); //runs search method (see method)
    System.out.println();
    
    System.out.println("Scrambled Deck: ");
    gradeScramble(grade); //scrambled grades (see method)
    showArray(grade); 
    
    System.out.println("enter another grade to find");
    int search2 = scan.nextInt(); //grade serach number 2
    gradeSearch(grade, search2);
    
    
    
}
   
    public static void showArray(int[] array){ // prints out each member of array using void type and system.out.print command
          for(int i=0;i<array.length;i++){
              System.out.print(array[i]+" "); 
          }
    } 
    public static void sortedGrades(int[] grades){ //sorts grades from smallest to largest
        for(int i=0;i<grades.length;i++){ 
            for(int j=i+1;j<grades.length;j++){
                if(grades[i]>=grades[j]){
                int hold=grades[i];  //if grade is larger, then they switch places (like a shuffle)
                grades[i]=grades[j];
                grades[j]=hold;
                }
                
            }
            
        } 
    }
    public static void gradeSearch(int [] grades, int found){ //uses a linear serach to check if grade equals "found" value
        for(int i=0; i<15; i++){
            if(grades[i]==found){
                System.out.println("grade was found with "+(i+1)+" iterations");
                break;
            }
            else if(i==14&&i!=found){ //if it is the end of the method and grade still hasn't been matched, it says it was not found
                 System.out.println("grade was not found in 15 iterations");
                 break;
            }     
        }
    }
    public static void gradeScramble(int [] grades){
        int j,k;
        for(int i=0; i<15; i++){ //basic shuffle method using math.random to assign random value
           j= (int)(15*Math.random());
           k=(int)(15*Math.random());
           int gradetemp = grades[j];
           grades[j]=grades[k]; //switching two random grades
           grades[k]=gradetemp;
        }
    }
          
} //end of program