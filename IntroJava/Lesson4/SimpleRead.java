import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class SimpleRead {

	public static void main(String[] args) throws FileNotFoundException {
		// Declare variables.
		File file;
		Scanner fileIn;
		String text;
		int number;
		
		// Create a file object to reference the file.
		file = new File("sample.txt");
		
		// Read the contents from the file, if it exists, and display them.
		if (file.exists()) {
			// Create a Scanner to read from the file.
			fileIn = new Scanner(file);
			
			// Read the string and number from the file.
			text = fileIn.nextLine();
			number = fileIn.nextInt();
			
			// Print the string and number.
			System.out.println("The text is: " + text);
			System.out.println("The number is: " + number);
			
			// Close the Scanner.
			fileIn.close();
		}

	}

}
