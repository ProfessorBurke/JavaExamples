import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;

/**
 * Note that the lgbt-legal-equality-index file has been modified so it has no
 * header line and each record is three values over three lines:  country name,
 * code, and equality index.  All data is for 2024.  It is a text file.
 * 
 * This program reads the data into an array of CountryRights objects and then
 * manipulates the data to display some analytics.
 * 
 * @author Maggie
 *
 */
public class CountryRightsProgram {

	public static void main(String[] args) throws FileNotFoundException {
	
		// Create the file with the data and the array to hold the objects.
		File file = new File("lgbt-legal-equality-index-modified.txt");
		CountryRights[] countries = new CountryRights[192];
		
		// Read the data from the file into a CountryRights object and store
		// in the countries array.
		if (file.exists()) {
			Scanner fileScanner = new Scanner(file);
			int i = 0;
			while (fileScanner.hasNext() && i < countries.length) {
				// Read a record from the file
				String name = fileScanner.nextLine();
				String code = fileScanner.nextLine();
				double equalityIndex = fileScanner.nextDouble();
				// Consume the newline.
				if (fileScanner.hasNext()) fileScanner.nextLine();
				
				// Create the object and store it in the array.
				countries[i++] = new CountryRights(name, code, equalityIndex);
			}
			fileScanner.close();
		}
		
		// The array is sorted alphabetically by country name, so use
		// a binary search to find the country entered by the user.
		Scanner stdin = new Scanner(System.in);
		System.out.print("What country would you like to search for? ");
		String searchCountry = stdin.nextLine();
		stdin.close();
		
		// Conduct the search.
		int foundIndex = -1;
		int left = 0;
		int right = countries.length - 1;

		while (left <= right && foundIndex == -1) {
			int middle = left + (right - left) / 2; 
			String name = countries[middle].getName();

			// Found the value
			if (name.equals(searchCountry)) {
				foundIndex = middle; 
				// Search in the right half
			} else if (name.compareTo(searchCountry) < 0) {
				left = middle + 1;  
				// Search in the left half
			} else {
				right = middle - 1; 
			}
		}

		// Display the location of the year.
		if (foundIndex == -1) {
			System.out.println("That country was not found.");
		} else {
			System.out.println(countries[foundIndex]);
		}
		
		
		// Sort the array using a selection sort, by equalityIndex, from lowest
		// to highest.
		// Declare other variables.
		int smallest;
		CountryRights temp;

		// Sort the array.
		for (int start = 0; start < countries.length-1; start++) {
			smallest = start;
			for (int i = start + 1; i < countries.length; i++) {
				if (countries[smallest].compareTo(countries[i]) > 0) {
					smallest = i;
				}
			}
			temp = countries[start];
			countries[start] = countries[smallest];
			countries[smallest] = temp;
		}
		
		// Display the country with the smallest equalityIndex value.
		System.out.println("The country with the smallest equality index is:\n" + countries[0]);
		
		// Display the country with the largest equalityIndex value.
		System.out.println("\nThe country with the largest equality index is:\n" + countries[countries.length - 1]);
		
		// Display all of the countries
		System.out.println("\nAll of the countries, in order:");
		for (int i = 0; i < countries.length; i++) {
			System.out.println(countries[i]);
		}

	}

}
