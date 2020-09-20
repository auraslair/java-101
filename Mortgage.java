package lab1;

import java.util.Scanner;

public class Mortgage {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		int currentPrice; 
		int lastMonthsPrice; 
		
		
		System.out.println("Enter the current home price:");
		currentPrice = scnr.nextInt(); 
		
		System.out.println("Enter last month's home price:");
		lastMonthsPrice = scnr.nextInt();
	    
		
		
	    System.out.println("This house is $" + currentPrice + "." + " The change is $" + (currentPrice - lastMonthsPrice) + " since last month.");
	    System.out.println("The estimated monthly mortgage is $" + (currentPrice * 0.045 / 12 ) + ".");
	    

		scnr.close();
	}

}