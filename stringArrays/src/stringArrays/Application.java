package stringArrays;

public class Application {

	public static void main(String[] args) {

		// below we declare the array so memory makes room
		String[] words = new String[3];
		// declare Type[array] nameOfVar = new Stringtype[3MemorySpots]

		// we write the values directly to memory....
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";

		// how to create array and set all in the same line
		String[] fruits = { "apple", "bananna", "pear", "kiwi" };

		// another way to use a for loop in java
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		int value = 123; 
		
	}

}
