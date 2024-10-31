import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class BookProgram {

	public static void main(String[] args) throws FileNotFoundException {
		
		// Read the text of the book into a string.
		// (This should be done with a StringBuilder, not a String, but we
		//  haven't talked about StringBuilder yet.)
		String poohText = "";
		File poohFile = new File("HouseAtPoohCorner.txt");
		//File poohFile = new File("ShortTextFile.txt");
		if (poohFile.exists()) {
			Scanner poohReader = new Scanner(poohFile);
			while (poohReader.hasNext()) {
				poohText += poohReader.nextLine();
			}
			poohReader.close();
		}
		
		// Now create a book and read a few pages.
		String userChoice;
		Scanner stdin = new Scanner(System.in);
		Book poohCorner = new Book(poohText);
		// Show a page and let the user press enter to continue.
		System.out.println(poohCorner.nextPage());
		System.out.print("Press enter to continue or type Q/enter to quit ...");
		userChoice = stdin.nextLine();
		while (!userChoice.equals("Q")) {
			// Show a page and let the user press enter to continue.
			System.out.println(poohCorner.nextPage());
			System.out.print("Press enter to continue ...");
			userChoice = stdin.nextLine();
		}
		stdin.close();
	}

}
