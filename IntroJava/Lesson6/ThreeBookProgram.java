import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ThreeBookProgram {
	
	/**
	 * Reads the text of the file passed into a string.
	 * 
	 * @param fileName	The path to the file.
	 * @return			The file contents as a string or the empty string.
	 * @throws 			FileNotFoundException if the file does not exist
	 */
	public static String readFile(String filePath) throws FileNotFoundException {
        StringBuilder fileContents = new StringBuilder();
        File inputFile = new File(filePath);

        if (inputFile.exists()) {
            Scanner fileReader = new Scanner(inputFile);
            while (fileReader.hasNextLine()) {
                fileContents.append(fileReader.nextLine());
            }
            fileReader.close();
        }
        return fileContents.toString();
    }


	public static void main(String[] args) throws FileNotFoundException {
		
		// Create three book objects -- two Pooh Corner and one First They Came.
		String poohText = readFile("HouseAtPoohCorner.txt");
		String firstText = readFile("FirstTheyCame.txt");
		Book poohBook1 = new Book(poohText);
		Book poohBook2 = new Book(poohText);
		Book firstBook = new Book(firstText);
		
		
		// Read different amounts of each book to illustrate that each object
		// has its own data.
		System.out.println("Reading twenty \"pages\" of first Pooh Corner book.");
		for (int i = 0; i < 20; i++) {
			poohBook1.nextPage();
		}
		System.out.println("Reading fifty \"pages\" of second Pooh Corner book.");
		for (int i = 0; i < 50; i++) {
			System.out.println(poohBook2.nextPage());
		}
		System.out.println("Reading one \"page\" of First They Came.");
		firstBook.nextPage();
		
		// Now print the next page from each book.
		System.out.println("Now here is where we are in Pooh Corner book 1:");
		System.out.println(poohBook1.nextPage());
		System.out.println("Here is where we are in Pooh Corner book 2:");
		System.out.println(poohBook2.nextPage());
		System.out.println("And here is where we are in First They Came:");
		System.out.println(firstBook.nextPage());

	}

}
