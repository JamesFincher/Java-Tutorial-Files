package userInput;

import java.util.Scanner;

public class Application {
public static void main(String[] args) {
	
	// Create scanner object
	Scanner input = new Scanner(System.in);
	
	// Output the prompt 
	System.out.println("Enter a line of text");
	
	// Wait for the user to enter a line of text
	String line =  input.nextLine();
	
	//Tell them what they entered
	System.out.println("You entered: " + line);
	
	System.out.println("Give me a number...");
	
	String line2 = input.nextLine();
	
	System.out.println("You chose the number: " + line2);
	
	
}
}
