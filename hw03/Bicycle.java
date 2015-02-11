//Amanda Moll
//Brian Chen
//Prompt user to enter number of counts on a cyclometer and the number of seconds in which these counts occured
//Print distance traveled and average miles per hour

//import Scanner prior to class and method
import java.util.Scanner;
//declare class
public class Bicycle{
    //declare main method
    public static void main(String[] args){
        //declare scanner object
        Scanner myScanner;
        //call scanner constructor
        myScanner = new Scanner( System.in );
        //prompt user to enter number of counts
        System.out.print("Enter number of counts of wheel.");
        //declare number of counts
        int nCounts = myScanner.nextInt();
        //prompt user to enter number of seconds it took
        System.out.print("Enter number of seconds trip took.");
        //declare number of seconds
        int nSeconds = myScanner.nextInt();
        //declare constants
        double wheelDiameter=27.0;
        double PI=3.14159;
        int feetPerMile=5280;
        int inchesPerFoot=12;
        double secondsPerMinute=60;
        //declare what we are looking for
        double nMinutes, nMiles;
        nMinutes=nSeconds/secondsPerMinute;
        nMiles=nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        //print distance and minutes
        System.out.println("The distance was "+nMiles+" miles and took"+nMinutes+" minutes.");
        //declare and find average mph
        double averageMPH;
        averageMPH=nMiles/(nMinutes/60);
        //print average mph
        System.out.println("The average mph was "+averageMPH);
    }
}