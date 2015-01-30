//Amanda Moll
//Brian Chen
//This lab prints the data of a bicycle cyclometer
//It records the time elapsed (in seconds)
//and the number of rotations of the front wheel

//define class
public class Cyclometer{
    //main method
    public static void main(String[] args){
        
        //create variable to store number of seconds for trip 1
        int secsTrip1=480;
        //variable of number of seconds for trip 2
        int secsTrip2=3220;
        //create variable to store number of rotations for trip 1
        int countsTrip1=1561;
        //create variable of rotations for trip 2
        int countsTrip2=9037;
        
        //Create variables for useful constants or distances
        //Wheel diameter variable constant
        double wheelDiameter=27.0; //double because of the decimal place
        //Pi constant
        double PI=3.14159;
        int feetPerMile=5280; //number of feet per mile will never change now
        int inchesPerFoot=12; //declare variable constant of inches per foot
        double secondsPerMinute=60; //must declare to program this is constant
        double distanceTrip1, distanceTrip2, totalDistance; //double because dependent on the wheel diameter
        
        //Print time in Minutes and the rotation counts
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+ " minutes and had "+ countsTrip1+" counts.");
        System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+ " minutes and had "+ countsTrip2+" counts.");
        
        //Record Calculations: Trip1 8 minutes and 1561 counts Trip2 53 minutes and 9037 counts
        //Computing values for the distances
        //Distance value for trip 1 in miles but first worry about the diameter then the feet per mile and such
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        distanceTrip1/=inchesPerFoot*feetPerMile; // /= actually means distanceTrip1=distanceTrip1/(inchesPerFoot*feetPerMile)
        //distance trip 2
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        //total distance of two trips
        totalDistance=distanceTrip1+distanceTrip2;
        
        //print data or distance in miles
        System.out.println("Trip 1 was "+distanceTrip1+" miles.");
        System.out.println("Trip 2 was "+distanceTrip2+" miles.");
        System.out.println("The total distance was "+totalDistance+"miles.");
        
    }
}