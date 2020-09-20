package lab1;

import java.util.Scanner;

public class Driving {
	public static void main(String[] args) {
		
	    Scanner scnr = new Scanner(System.in);
	
		double milesPerGallon;
		double gallonCost;
	    double totalCostTen;
	    double totalCostFif;
	    double totalCostFour;
	
	    
	    System.out.println("Enter your car's miles per gallon:");
        milesPerGallon = scnr.nextDouble();
    
	    System.out.println("Enter the cost of a gallon of gas:");
        gallonCost = scnr.nextDouble();
    
     
        totalCostTen = (gallonCost * (10 / milesPerGallon));
        totalCostFif = (gallonCost * (50 / milesPerGallon));
        totalCostFour = (gallonCost * (400 / milesPerGallon));
    
    
        System.out.printf("%.2f", totalCostTen);
        System.out.print(" ");
        System.out.printf("%.2f", totalCostFif);
        System.out.print(" ");
        System.out.printf("%.2f", totalCostFour);
        System.out.println();
    
    
        scnr.close();
    
     
    
    
    }

}
