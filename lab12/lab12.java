public class lab12{
    public static int[][] raggedArray(int[][] ragged){
        int i=10+(int)(Math.random()*((20-10)+1));
        int j=10+(int)(Math.random()*((20-10)+1));
        ragged=new int[i][j];
        for(int k=0; k<i; k++){
            for(int l=0; l<j;l++){
                ragged[k][l]=-1000+(int)(Math.random()*((2000)+1));
            }
        }
        return ragged;
    }
    
    public static void printArray(int[][] ragged){
        for(int i=0;i<ragged.length;i++){
            System.out.print(i+":");
            for(int j=0; j<ragged[i].length;j++){
                System.out.print(raggedd[i][j]+" ");
                if(j==(ragged[i].length-1)){
                   System.out.println(ragged[i][j]); 
                }
            }
        }
    }
    
    public static void printArray(int[] ragged){
        for(int i=0;i<ragged.length;i++){
              System.out.print(ragged[i]+" "); 
          }
    }
    
    public static int[][] findSmallest(int[][] ragged){
        int smallest;
        for(int i=0;i<ragged.length;i++){
            for(int j=0; j<ragged[i].length;j++){
                if(j==0){
                    ragged[i][j]=smallest;
                }
                else if(smallest>ragged[i][j]){
                    ragged[i][j]=smallest;
                }
            }
        }
        return smallest[i][j];    
    }
    
    public static int[][] findLargest(int[][] ragged){
        int largest;
        for(int i=0;i<ragged.length;i++){
            for(int j=0; j<ragged[i].length;j++){
                if(j==0){
                    ragged[i][j]=largest;
                }
                else if(largest<ragged[i][j]){
                    ragged[i][j]=largest;
                }
            }
        }
        return largest[i][j];
    }
    
    public static int[][] mostEven(int [][] ragged){
        int even,evenest,count;
        for(int i=0;i<ragged.length;i++){
            count=0;
            for(int j=0; j<ragged[i].length;j++){
                if(ragged[i][j]%2==0){
                   count=count+1; 
                }
            }
        if(i==0){
            evenest=ragged[i];
            even=count;
        }
        else if(count>even){
            evenest=ragged[i];
            even=count;
        }
        }
        return evenest[i][j];
    }

public static void main(String[] args) {
    int[][] ragged1;
    
    raggedArray(ragged1);
    
    printArray(ragged1);
    
    findSmallest(ragged1);
    
    findLargest(ragged1);
    
    mostEven(ragged1);
}
}
    
        

    
    