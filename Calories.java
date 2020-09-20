package lab1;

import java.util.Scanner;

public class Calories {
	
	public static void main(String[]args) { 
		
	    Scanner scnr = new Scanner(System.in); 	
		
		int years;
		int pounds;
		int beatsPerMinute;
		int minutes;
		double menTotalCal;
		double womenTotalCal;
		
		
		System.out.println("Enter age:");
		years = scnr.nextInt();
		
		System.out.println("Enter weight:");
		pounds = scnr.nextInt();
		
		System.out.println("Enter heart rate:");
		beatsPerMinute = scnr.nextInt();
		
		System.out.println("Enter time:");
		minutes = scnr.nextInt();
		
	    
	    menTotalCal = ((years * 0.2017) - (pounds * 0.09036) + (beatsPerMinute * 0.6309) - 55.0969) * minutes / 4.184;	    
	    womenTotalCal = ((years * 0.074) - (pounds * 0.05741) + (beatsPerMinute * 0.4472) - 20.4022) * minutes / 4.184;
	    
	    
	    
	    //System.out.print("Men: ");
	    System.out.printf("Men: %.2f calories\n", menTotalCal);
	    //System.out.println(" calories");
	    //System.out.print("Women: ");
	    System.out.printf("Women: %.2f calories\n", womenTotalCal);
	    //System.out.print(" calories");
	    
	    scnr.close();
	
	
	}
}
