package lab1;
import java.util.Scanner;

public class OutputWithVars {

	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		
		int userNum;
		int userNumB;
		System.out.println("Enter an integer:");
		userNum = scnr.nextInt();
		
		System.out.println("You entered: " + userNum);
		 
		System.out.println(userNum + " squared is " + (userNum * userNum));		
		System.out.println("And " + userNum + " cubed is " + (userNum * userNum * userNum) + "!!");
		 
		
		System.out.println("Enter another integer:");
		userNumB = scnr.nextInt();
		
		System.out.println(userNum + " + " + userNumB + " is " + (userNum + userNumB));
		System.out.println(userNum + " * " + userNumB + " is " + (userNum * userNumB));
		
		
		
		
		scnr.close();
	}
}