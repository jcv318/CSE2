//Jackson Viscomi
//Lab 02 -- Cyclometer

//define a class
public class Cyclometer{
    
    //add a method
    public static void main(String[] args) {
    
    int secsTrip1=480;  //seconds in trip 1
    int secsTrip2=3220; //seconds in trip 2
    int countsTrip1=1561; //counts in trip 1
    int countsTrip2=9037; //counts in trip 2
    
    double wheelDiameter=27.0, PI=3.14159, feetPerMile=5280, 
    inchesperfoot=12, secondsPerMinute=60;
    //storing a list of useful constants all under the double command
    
    System.out.println("Trip 1 took " +(secsTrip1/secondsPerMinute)+
    " minutes and had " +countsTrip1+ " counts");
    
    System.out.println("Trip 2 took " +(secsTrip2/secondsPerMinute)+
     " minutes and had " +countsTrip2+ " counts");
    //Writes out statement of the trip time and counts using comments along with simple math
    
    double distanceTrip1=countsTrip1*wheelDiameter*PI/inchesperfoot/feetPerMile; 
    //using the circumference of the wheel to calculate distance traveled
    double distanceTrip2=countsTrip2*wheelDiameter*PI/inchesperfoot/feetPerMile; 
    //same equation as trip 1, but with trip 2 data
    
    double totalDistance=distanceTrip1+distanceTrip2; //total distance
    
     System.out.println("Trip 1 was " +distanceTrip1+ " miles"); 
     System.out.println("Trip 2 was " +distanceTrip2+ " miles");
     System.out.println("The total distance was " +totalDistance+ " miles");
     
//printing out Trip 1, Trip 2, and total distance
    
    
    
    
    
    
    
    }  //end of main method
    
    } //end of class 