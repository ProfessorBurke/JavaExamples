import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadNumbersArrayList {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File dataFile;					// File with data to read
		Scanner fileScanner;			// Scanner to read from the file
		ArrayList<Integer> values;		// To hold the values from the file
		int total;						// The sum of the values in the file
		
		// Create the file and open the Scanner to read, if the file exists.
		dataFile = new File("numCountriesLegal.txt");
		if (dataFile.exists()) {
			values = new ArrayList<Integer>();
			fileScanner = new Scanner(dataFile);
			
			// Read each value from the file into the arraylist.
			while (fileScanner.hasNext()) {
				values.add(fileScanner.nextInt());
			}
			
			// close the Scanner.
			fileScanner.close();
			
			// Print and total the values in the arraylist.
			total = 0;
			for (int i=0; i < values.size(); i++) {
				System.out.println(values.get(i));
				total += values.get(i);
			}
			// Print the average of the values.
			System.out.println((double)total / values.size());
			
		}	
	}
}
