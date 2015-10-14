/* Jackson Viscomi
   Hw 07 -- Twisty
   Professor Chen
   10/13/2015
   */
    
        
        
        import java.util.Scanner;
public class Twisty{
    public static void main (String [] agrs){
        Scanner myScanner = new Scanner (System.in);
        boolean goodInput = false; //intially declares "goodimput" as false

int length = 0;   //This first do while statement makes sure the length is an int and between 0 and 80
do {                                                                       
    try {
    goodInput = true;
     System.out.print("imput your desired length");
        length = myScanner.nextInt();
       if ((length < 0) || (length > 80)){
           System.out.println("not within the range");
           goodInput = false;
       }
     
} catch (Exception e) {
 System.out.println("Enter an int, please");
 goodInput =false;
 String clear = myScanner.nextLine();
} 
} while (!goodInput);

int width = 0;          //this do while statement makes sure the width is an int and less than the length
do {                                                                    
    try {
    goodInput = true;
     System.out.print("imput your desired width");
        width = myScanner.nextInt();
       if (width > length){
           System.out.println("must be less than length");
           goodInput = false;
       }
     
} catch (Exception e) {
 System.out.println("Enter an int, please");
 goodInput =false;
 String clear = myScanner.nextLine();
} 
} while (!goodInput);


        for(int i=0; i<width; i++) {   //same setup as encrpyted_x (substituting width for imput)
            int count =0;
            int evenodd=0;  //lines 47-48 initially declare the width counter and even-odd switcher and reset it at the end of every loop
            while (count < length) { //this statement makes the output within the length boundry (the below if and else if statements add on to the count every time their boolean is true)
                
                for(int j=0; j<width; j++) {

                    if (evenodd==0){ //this if statement classifies the first "x" by running it when the evenodd count is 0
                        if (i == j && count!=length){
                            System.out.print("#");
                            count = count+1; //an example of how the count is increased when the specific boolean is true
                        }
                        else if (j==(width-i-1)&& count!=length){
                        System.out.print("/");
                        count = count +1;
                        }

                        else{
                        System.out.print(" ");
                        count = count+1;
                        }

                    
                    
                    }                   
                    
                    if(evenodd == 1){ //this is the second type of x when evenodd = 1
                        if (i == j&& count!=length){ // the &&count!=length makes sure that the count does not print over the specified length
                            System.out.print("\\");
                            count = count+1;
                        }
                        else if (j==(width-i-1) &&count!=length){
                            System.out.print("#");
                            count = count +1;
                        }

                        else{
                        System.out.print(" ");
                        count = count+1;
                        }
                    
                        
                    }
                
   
                }
           if (evenodd==1){ //this if and else statement switches the two types of x to be true by alternating which one is true every loo[]
                    evenodd=0;
                    }
            else{
                evenodd = 1;
            }
            }

            System.out.println(); //this spaces each line for the width
        }

    }
}