import java.util.Scanner;
public class lab10{
    			// main method required for every Java program
public static void main(String[] args) {
	Scanner scan = new Scanner ( System.in );
    
  int size = 5 +(int)(Math.random()*((10-5)+1));
  
 
  
    System.out.println("Enter "+size+ " student names");
    
String[]students = new String[size];
int[]midterm = new int[size];

int i=0;


    for(i=1; i<size;i++){
        students[i] = scan.next();
        
    }
    
    for(int j=0;j<size;j++){
            midterm[j]=(int)(Math.random()*100);
           
            
        }
    
for(int k=0;k<size;k++){
    System.out.println(students[k]+": "+midterm[k]);
}
    
}
}
    

