import java.util.Scanner;
public class StringAnalysis{

public static boolean stringCheck(String string2, int number){
int stringLength2 = string2.length();
int count=0;
do{
    char place=string2.charAt(count);
    if (!Character.isLetter(place)){
        break;
    }

    count=count+1;
}while(count<stringLength2 && count<number);
if (count>=number || count==stringLength2){
    return true;
}
else{
    return false;
    
}
    
}

public static boolean stringCheck(String string2){
int count =0;
int stringLength2 = string2.length();
 do{
     char place =string2.charAt(count);
     if (!Character.isLetter(place)){
         break;
     }
     count=count+1;
 }while(count<stringLength2);
 if (count==stringLength2){
     return true;
 }
 else{
     return false;
 }
}

public static void main (String [] agrs){
Scanner myScanner = new Scanner (System.in);



boolean goodInput=false;


System.out.print("enter a string: ");
String input = myScanner.next();

System.out.print("imput the number of characters you would like to evaluate or type 'all'");

do{
    if(myScanner.hasNextInt()){
        int number=myScanner.nextInt();
        if (number>0){
            if(stringCheck(input,number)){
            System.out.println("All Letters");
        }
        else{
            System.out.println("Not all letters");
        }
        goodInput=true;
    }
        else{
        System.out.println("Please enter number of characters or type 'all'");
    }
    }
    
    else if(myScanner.hasNext("all")){
        if(stringCheck(input)){
            System.out.println("All letters");
        }
        else{
            System.out.println("Not all letters");
        }
    goodInput=true;
    }
    else{
        System.out.println("Please enter number of characters or type 'all'");
    
        myScanner.next();
    }
}while(!goodInput);
}
}
    



