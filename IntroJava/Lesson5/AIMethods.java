import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Offer the user a menu of options for analysis of the AIInvestments data.
 * 
 * @author Maggie
 *
 */
public class AIMethods {

	/**
	 * Opens the file fileName and reads records formatted as category\nyear\nexpenditure.
	 * Totals expenditures from records with the year matching the parameter year, and
	 * counts those records.  If there were any records matching the year, calculates
	 * the average and returns the average or 0 if now records matching the year.
	 * 
	 * @param fileName		the name of the file containing the AI data
	 * @param year			the year that should be averaged
	 * @return				the average expenditures of year or 0 if none
	 * @throws FileNotFoundException
	 */
	public static double averageSpending(String fileName, int year) throws FileNotFoundException{

		// File-reading variables.
		Scanner fileIn;				// Scanner for reading from the file.
		File aiFile;				// File object from fileName.
		// Averaging variables.
		int numRecords = 0;			// Count of records read that match year.
		long expenditures = 0;		// Total of the expenditures that match year.
		double average = 0;			// The average of the expenditures that year.
		// Variables holding data for one record.
		int recordYear;				// The year.
		String recordCategory;		// The category of the spending.
		long recordExpenditure;		// The amount spent.

		// Create the file.
		aiFile = new File(fileName);

		// If the file exists, read from the file, print each record,
		// and count and total the 2021 expenditures.
		if (aiFile.exists()) {
			fileIn = new Scanner(aiFile);

			// Read and process the records.
			expenditures = 0;
			numRecords = 0;
			while (fileIn.hasNext()) {
				// Read a complete record.
				recordCategory = fileIn.nextLine();
				recordYear = fileIn.nextInt();
				recordExpenditure = fileIn.nextLong();
				// After reading a record, consume the newline.
				if (fileIn.hasNext()) {fileIn.nextLine();}

				// Add the expenditure data to the total if it's the year of interest.
				if (recordYear == year) {
					numRecords++;
					expenditures += recordExpenditure;
				}
			}
			// Compute the average after reading all records from
			// the file (if there were records).
			
			 if (numRecords > 0) { average = expenditures / (double) numRecords; }
			 // Close the Scanner.
			fileIn.close();
		}
		return average;
	}
	
	/**
	 * Validates that choice is between 1 and 4 inclusive.
	 * 
	 * @param choice	An integer.	
	 * @return			true if choice is between 1 and 4 inclusive;
	 *                  false otherwise
	 */
	public static boolean validMenuChoice(int choice) {
		return choice >= 1 && choice <= 4;
	}

	/**
	 * Presents a menu to the user and obtains their choice until the user chooses quit.  
	 * Obtains the inputs needed for the choice and invokes the appropriate handler,
	 * then displays the results.
	 * 
	 * @param args not used
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		// Menu constants.
		final int AVERAGE_YEAR = 1;
		final int AVERAGE_CATEGORY = 2;
		final int DIFFERENCE = 3;
		final int QUIT = 4;

		// Input variables.
		Scanner stdin;			// Scanner for reading from standard input.
		int choice;				// The user's choice from the menu.
		int year;				// The year the user wants averaged.
		
		// Result variables.
		double average;			// The average calculated by a method.
		
		// Create the Scanner.
		stdin = new Scanner(System.in);
		
		do {
			// Display the menu.
			System.out.println("1. Average spending for a year");
			System.out.println("2. Average spending for a category");
			System.out.println("3. Difference between two years");
			System.out.println("4. Quit");
			System.out.print("\nPlease enter the number of your choice: ");
			
			// Obtain the user's choice.
			choice = stdin.nextInt(); 
			while (!validMenuChoice(choice)) {
				System.out.println("Your choice must be 1, 2, 3, or 4.");
				System.out.print("\nPlease enter the number of your choice: ");
				choice = stdin.nextInt(); 
			}
			
			// Handle the user's choice.
			switch (choice) {
			case AVERAGE_YEAR:
				// Obtain the year the user's interested in.
				System.out.print("What year are you interested in? ");
				year = stdin.nextInt();
				average = averageSpending("AIInvestment.txt", year);
				System.out.printf("The average spending for the year %d is $%,.2f.\n", 
						year, average);
				break;
			case AVERAGE_CATEGORY:
				System.out.println("This option is not yet implemented.");
				break;
			case DIFFERENCE:
				System.out.println("This option is not yet implemented.");
				break;
			}
			
		} while (choice != QUIT);
		
		stdin.close();
	}

}
