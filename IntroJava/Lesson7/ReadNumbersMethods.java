import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class ReadNumbersMethods {
	
	/**
	 * Read the values from the file with the parameter fileName into an array
	 * of size maxSize and return the array.
	 * 
	 * @param fileName		The name of the file with the values.
	 * @param maxSize		The maximum number of values to read.
	 * @return				An integer array containing the files in fileName,
	 *                      or null if the file doesn't exist or there's an
	 *                      error reading.
	 * @throws FileNotFoundException
	 */
	public static int[] readFile(String fileName, int maxSize) throws FileNotFoundException {
		File dataFile;				// File with data to read
		Scanner fileScanner;		// Scanner to read from the file
		int[] valueArray = null;	// Array to read the data into.
		int count;					// To index into the array; number of values
		
		// Create the file and open the Scanner to read, if the file exists.
		dataFile = new File(fileName);
		if (dataFile.exists()) {
			valueArray = new int[maxSize];
			count = 0;
			fileScanner = new Scanner(dataFile);
					
			// Read each value from the file into the array.
			while (fileScanner.hasNext() && count < valueArray.length) {
					valueArray[count] = fileScanner.nextInt();
					count++;
			} //while reading from the file
					
			// Close the Scanner.
			fileScanner.close();
		} //if the file exists
		return valueArray;
	}
	
	/**
	 * Print all of the values in the parameter array.
	 * 
	 * @param array				// An array of values to be printed.
	 */
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	/**
	 * Set all values in the array to zero.
	 * 
	 * @param array				// An array to be erased.
	 */
	public static void eraseArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = 0;
		}
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		final int MAX_VALUES = 50;	// Maximum number of values in the file
		int[] valueArray;			// To hold the values from the file				
		
		// Read the file into the array.
		valueArray = readFile("numCountriesLegal.txt", MAX_VALUES);
		
		// If the array was created, print, erase, and print the array.
		if (valueArray != null) {
			// Print the values in the array.
			printArray(valueArray); 
			
			// Two ways to copy an array (one commented out).
//			int[] copy = new int[valueArray.length];
//			for (int i=0; i < valueArray.length; i++) {
//				copy[i] = valueArray[i];
//			}
			int[] copy = Arrays.copyOf(valueArray, valueArray.length);
			
			printArray(valueArray);
			// Erase the array.
			eraseArray(valueArray); 
		
			// Print the values in the array again.
			printArray(valueArray);
		}
	}

}
