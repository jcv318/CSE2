import java.util.Scanner;
public class lab11{
    			// main method required for every Java program
public static void main(String[] args) {
	Scanner scan = new Scanner ( System.in );
	
    int[]array1 = new int[5000];
    int[]array2 = new int[5000];
    
    for(int i=0;i<5000;i++){
        array1[i]=(int)(Math.random()*10000);
    }
    int largeNum=0;
    for(int j=0; j<5000; j++){
        
        if (array1[j]>largeNum){
            largeNum=array1[j];
        }
    }
    System.out.println("Largest Number in Array1 is "+largeNum);

     for(int k=0;k<5000;k++){
            array2[0]=0;
        if(k>0){
            boolean goodinput=false;
            while(goodinput!=true){
                int value=(int)(Math.random()*5001);
                System.out.println("value is"+value);
                System.out.println("array2[k-1] is"+array2[k-1]);
                if(value>array2[k-1]){
                    array2[k]=value;
                    goodinput=true;
                }
                else{
                    goodinput=false;
                }
            }
        
             System.out.println("inside loop 1");
        }
        System.out.println("inside loop 2");
     }
    int largeNum1=0;
    for(int l=0; l<5000; l++){
        
        if (array2[l]>largeNum1){
            largeNum1=array2[l];
        }
     System.out.println("inside loop 3");
        
    }
    int smallNum1=10000;
    for(int m=0; m<5000; m++){
        
        if (array2[m]<smallNum1){
            smallNum1=array2[m];
        }
    
     System.out.println("inside loop 4");
    }
    System.out.println("Larest Number in Array2 is "+largeNum1);
    System.out.println("Smallest Number in Array2 is "+smallNum1);
    
    System.out.println("Enter an int >=0");
    int search=scan.nextInt();
    
    
    
}
}