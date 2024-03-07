import java.util.Scanner;

/**
 * Demonstrates working with the char and String data types.
 * 
 * @author Maggie
 *
 */
public class WordData {

	public static void main(String[] args) {
		
		String word;		// A word entered by the user.
		String wordUpper;	// The word in uppercase.
		String wordLower;	// The word in lowercase.
		int length;			// The number of characters in the user's word.
		char firstChar;		// The first character in the user's word.
		char lastChar;		// The last character in the user's word.
		Scanner stdin;		// Scanner for obtaining input from the console.
		
		firstChar = '\n';
		
		// Obtain a word from the user.
		stdin = new Scanner(System.in);
		System.out.print("Please enter a word: ");
		word = stdin.nextLine();
		stdin.close();
		
		// Create uppercase and lowercase versions of the word.
		wordUpper = word.toUpperCase();
		wordLower = word.toLowerCase();
		
		// Get the length and first and last characters of the word.
		length = word.length();
		firstChar = word.charAt(0);
		lastChar = word.charAt(length-1);
		
		// Display the word manipulations to the user.
		System.out.print("\nYour word is '" + word + "', and in uppercase, ");
		System.out.print("that's '" + wordUpper + "', whereas in lowercase, ");
		System.out.println("that's '" + wordLower + "'.");
		System.out.print("\nThe length of the word is " + length + ", and ");
		System.out.print("the first character is '" + firstChar + "', and ");
		System.out.println("the last character is '" + lastChar + "'.");
		
	}

}
