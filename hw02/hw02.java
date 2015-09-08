public class hw02{
    
    //add a method
    public static void main(String[] args) {
    
    int nSocks=3; //number of socks
    double sockCost$=2.58; //cost per sock in $'s
    
    int nGlasses=6; //number of drinking glasses
    double glassCost$=2.29; //cost per glass in $'s
    
    int nEnvelopes=1; //number of envelopes 
    double envelopeCost$=3.25; //cost per box of envelopes
   
    double taxPercent=1.06; //tax percent on cost
    
    double totalSockCost$=(nSocks*sockCost$); //total cost of socks
    double totalGlassCost$=(nGlasses*glassCost$); //total cost of glasses
    double totalEnvelopeCost$=(nEnvelopes*envelopeCost$); //total cost of envelopes 
    
    double totalbeforetax=((totalEnvelopeCost$+totalGlassCost$+totalSockCost$)*100);//total cost before tax *100 for decimal places
    totalbeforetax=(int)totalbeforetax;
    totalbeforetax=totalbeforetax/100;   //the two lines converted into an int and then divided it by 100 to get it into a number w/ 2 decimal places
    
    double totalprice=((totalbeforetax*taxPercent)*100); //total cost after tax
    totalprice=(int)totalprice;
    totalprice=totalprice/100;   //the two lines converted into an int and then divided it by 100 to get it into a number w/ 2 decimal places
   
    double totaltax= ((totalprice-totalbeforetax)*100); 
    totaltax=(int)totaltax;
    totaltax=totaltax/100    //the two lines converted into an int and then divided it by 100 to get it into a number w/ 2 decimal places
    
    System.out.println("number of socks = "+nSocks+"  cost = $"+totalSockCost$+""); //displays number of socks + total price for items
    System.out.println("number of glasses ="+nGlasses+"  cost = $"+totalGlassCost$+""); // number of glasses +total price for items
    System.out.println("number of envelopes ="+nEnvelopes+"  cost = $"+totalEnvelopeCost$+""); //number of envelopes +total envelope cost
    System.out.println("                                                           ");
    System.out.println("                                                           ");
    System.out.println("Subtotal =$"+totalbeforetax+""); //subtotal before tax
    System.out.println("Tax =$"+totaltax+"   Total =$"+totalprice+""); //tax and total price
    
    }
    }
    