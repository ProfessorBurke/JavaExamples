import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Creates an array of GiniCountry data by reading values from the 
 * GiniCountryData.txt file.  Prints the values in the array using a regular
 * for loop and an enhanced for loop.
 * 
 * @author Maggie
 *
 */
public class GiniObjectArray {

	public static void main(String[] args) throws FileNotFoundException {
		
		GiniCountry[] countries = new GiniCountry[10];	// GiniCountry array
		int i = 0;										// Index into the array
		GiniCountry country;							// A single country
		String name;									// Name of the country
		double gini2010, gini2020;						// Gini coefficients
		Scanner fileScanner;							// To read from the file
		File giniFile = new File("GiniCountryData.txt");// The file	

		// If the file exists, create a Scanner to read from the file.
		if (giniFile.exists()) {
			fileScanner = new Scanner(giniFile);
			
			// While there is data in the file and we haven't exceeded the
			// array bounds, reads data from the file, creates an object, puts
			// it in the array.
			while (fileScanner.hasNext() && i < countries.length) {
				name = fileScanner.nextLine();
				gini2010 = fileScanner.nextDouble();
				gini2020 = fileScanner.nextDouble();
				// Consumes the newline
				if (fileScanner.hasNext()) {fileScanner.nextLine();}
				country = new GiniCountry(name, gini2010, gini2020);
				countries[i++] = country;
			}
			fileScanner.close();
			
			// Note: if the array isn't full, this code will not function
			// properly.
			// Uses an enhanced for loop to display the data in the array.
			for (GiniCountry giniCountry: countries) {
				System.out.println(giniCountry.getName() 
						+ " has a difference of " 
						+ giniCountry.getDifference());
			}
			
			// Uses a standard for loop to display the data in the array, but
			// loops only i times -- the count of objects created from the file.
			for (int j = 0; j < i; j++) {
				System.out.println(countries[j].getName() 
						+ " has a difference of " 
						+ countries[j].getDifference());
			}
		}
	}

}
