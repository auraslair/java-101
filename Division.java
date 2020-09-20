package lab1;
import java.util.Scanner;

public class Division {

	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		int userNum;
		int divisor;
		int a;
		
		System.out.println("Enter an integer for the dividend:");
		userNum = scnr.nextInt();
		
		System.out.println("Enter an integer for the divisor:");
		divisor = scnr.nextInt();
		
		a = userNum / divisor;
		System.out.println( a + " " + (a / divisor) + " " + ((a / divisor) / divisor) + " " + ((a / divisor) / divisor) / divisor);
				
		scnr.close();
		
	}
}