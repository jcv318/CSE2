import java.util.Scanner;
public class encrypted_x{
    public static void main (String [] agrs){
        Scanner myScanner = new Scanner (System.in);
        boolean goodInput = false; //intially declares "goodimput" as false

int input = 0;
do {                                                                        // do while statment checking that the user enters the info in correctly (repeats for each day of the week)
    try {
    goodInput = true;
     System.out.print("imput a integer betwen 0-100");
        input = myScanner.nextInt();
       if ((input < 0) || (input > 100)){
           System.out.println("not within the range");
           goodInput = false;
       }
     
} catch (Exception e) {
 System.out.println("Enter an int, please");
 goodInput =false;
 String clear = myScanner.nextLine();
} 
} while (!goodInput);

;

int count =0;
for(int i=0; i<input; i++) {
while (count < length)   
for(int j=0; j<input; j++) {
if (i == j){
    System.out.print("#");
    count = count+1;
}
else if (j==(input-i-1)){
       System.out.print("/");
       count = count +1;
}
else{
    System.out.print(" ");
    count = count+1;
}

}
System.out.println(); 
}

System.out.print("I LOVE MIKE");        
    }


}