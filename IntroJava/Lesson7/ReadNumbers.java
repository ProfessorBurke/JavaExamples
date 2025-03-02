import java.io.*;
import java.util.Scanner;

public class ReadNumbers {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		final int MAX_VALUES = 50;	// Maximum number of values in the file
		File dataFile;				// File with data to read
		Scanner fileScanner;		// Scanner to read from the file
		int number;					// The next value in the file
		int[] valueArray;			// To hold the values from the file
		int count;					// To index into the array; number of values
		int total;					// The sum of the values in the file
		
		// Create the file and open the Scanner to read, if the file exists.
		dataFile = new File("numCountriesLegal.txt");
		if (dataFile.exists()) {
			valueArray = new int[MAX_VALUES];
			count = 0;
			fileScanner = new Scanner(dataFile);
			
			// Read each value from the file into the array.
			while (fileScanner.hasNext() && count < valueArray.length) {
				valueArray[count] = fileScanner.nextInt();
				count++;
			}
			
			// close the Scanner.
			fileScanner.close();
			
			// Print and total the values in the array.
			total = 0;
			for (int i=0; i < count && i < valueArray.length; i++) {
				System.out.println(valueArray[i]);
				total += valueArray[i];
			}
			// Print the average of the values.
			System.out.println((double)total / count);
		}
	
			
	}

}
