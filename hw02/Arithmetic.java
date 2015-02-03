//Amanda Moll
//Brian Chen
//HW 2
//find the cost of goods purchased at Walmart including sales tax

//define main class
public class Arithmetic{
    
    //define main method
    public static void main(String[] args){
        
        //input varibles of goods purchased
        //number and cost of socks
        int nSocks=3;
        double sockCost$=2.58;
        //number and cost of drinkning glasses
        int nGlasses=6;
        double glassCost$=2.29;
        //number and cost of boxes of envelopes
        int nEnvelopes=1;
        double envelopeCost$=3.25;
        //Tax cost of total
        double taxPercent=.06;
        
        //declare total costs of each item
        double totalSockCost$=(nSocks)*(sockCost$);
        double totalGlassCost$=(nGlasses)*(glassCost$);
        double totalEnvelopeCost$=(nEnvelopes)*(envelopeCost$);
        //declare total cost of perchases prior to tax
        double totalCost$=(totalSockCost$)+(totalGlassCost$)+(totalEnvelopeCost$);
        //declare total cost after tax or final cost
        double finalCost$=(totalCost$)*(1+taxPercent);
        //print how many of each items and cost of one of these items
        System.out.println("Today I want to purchase "+nSocks+" socks, each costing $"+sockCost$+".");
        System.out.println("I would also like "+nGlasses+" glasses that are $"+glassCost$+".");
        System.out.println("Finally, I would like "+nEnvelopes+"boxes of envelopes since they are only $"+envelopeCost$+".");
        //print total cost per item and added tax to item purchased
        System.out.println("The total cost of socks will be $"+totalSockCost$+" with a sales tax of $"+((totalSockCost$*taxPercent)-.0044)+" .");
        System.out.println("The total cost of glasses will be $"+totalGlassCost$+" with a sales tax of $"+((totalGlassCost$*taxPercent)-.0044)+" .");
        System.out.println("The total cost of envelopes will be $"+totalEnvelopeCost$+" with a sales tax of $"+((totalEnvelopeCost$*taxPercent)+.005)+" .");
        //print total cost of purchase without sales tax, print sales tax, then print total amount
        System.out.println("Prior to tax the total cost will be $"+totalCost$+" with a sales tax of $"+((totalCost$*taxPercent)-.0038)+" .");
        System.out.println("The final cost after sales tax of the purchase will be $"+(finalCost$-.003800000000003)+" .");
    }
}