import java.util.Random;
import java.util.Scanner;

public class BinaryPuzzle {
    public static void main(String[] args) {
    	
    	// Declare variables.
    	Random random;			// The random number generator.
    	int number;				// The decimal version of the number to guess.
    	String binaryString;	// Binary string version of number.
    	Scanner stdin;			// Scanner for input from the console.
    	String userAnswer;		// The user's binary version of the number.
    	boolean isCorrect;		// Whether the user's answer is correct.
    	
        // Create a Random object to generate a random number.
        random = new Random();
        number = random.nextInt(1000) + 1;

        // Convert the number to its binary equivalent.
        binaryString = Integer.toBinaryString(number);

        // Create a Scanner object to get input from the user
        stdin = new Scanner(System.in);

        // Ask the user to enter the binary equivalent of the number
        System.out.printf("What is the binary equivalent of the decimal number %d? ", 
        		number);
        userAnswer = stdin.nextLine();

        // Use a boolean variable to check if the user's answer is correct
        isCorrect = userAnswer.equals(binaryString);

        // Output the result
        if (isCorrect) {
            System.out.printf("Correct! The binary equivalent of %d is %s.\n", 
            		number, binaryString);
        } else {
            System.out.printf("Wrong! The binary equivalent of %d is %s.\n", 
            		number, binaryString);
        }

        // Close the scanner
        stdin.close();
    }
}

