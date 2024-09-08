import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Read data from AIInvestment.txt and average the investments from 2021.
 * @author Maggie
 *
 */
public class AIReader {

	public static void main(String[] args) throws FileNotFoundException {
		// Declare variables
		Scanner fileIn;
		File aiFile;
		int num2021Records;
		long expenditures2021;
		String category;
		int year;
		long expenditure;
		
		// Create the file.
		aiFile = new File("AIInvestment.txt");
		
		// If the file exists, read from the file, print each record,
		// and count and total the 2021 expenditures.
		if (aiFile.exists()) {
			fileIn = new Scanner(aiFile);
			
			// Read and process the records.
			expenditures2021 = 0;
			num2021Records = 0;
			while (fileIn.hasNext()) {
				// Read a complete record.
				category = fileIn.nextLine();
				year = fileIn.nextInt();
				expenditure = fileIn.nextLong();
				// After reading a record, consume the newline.
				if (fileIn.hasNext()) fileIn.nextLine();
				
				// Print and count if 2021.
				System.out.printf("%s,%d,%d\n", category, year, expenditure);
				if (year == 2021) {
					num2021Records++;
					expenditures2021 += expenditure;
				}
			}
			// Compute and print the average after reading all records from
			// the file (if there were records).
			if (num2021Records > 0) {
				System.out.printf("The average expenditure for 2021 is $%,.2f.\n",
						expenditures2021 / (double)num2021Records);
			}
			// Close the Scanner.
			fileIn.close();
		}

	}

}
