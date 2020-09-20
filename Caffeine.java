package lab1;
import java.util.Scanner; 

public class Caffeine {

	public static void main(String[] args) {
      
		Scanner scnr = new Scanner(System.in);      
		
		double caffeineMg;        
		double halfAmt;
            
		System.out.println("Enter the amount of caffeine in mg.");      
		caffeineMg = scnr.nextDouble(); 
		
		halfAmt = (caffeineMg / 2);
		
		System.out.println("After 6 hours: " + halfAmt  + " mg");
		System.out.println("After 12 hours: " + halfAmt / 2 + " mg");
		System.out.println("After 18 hours: " + halfAmt / 4 + " mg");
		
		scnr.close();
   
	}
}
