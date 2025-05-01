import java.util.Scanner;
import java.io.*;

/**
 * Common array bugs.  See if you can spot them!
 * @author Maggie
 *
 */
public class ArrayBugs {
	
	public static void fillArray(int[] array) throws FileNotFoundException{
		File numbersFile = new File("numCountriesLegal.txt");
		if (numbersFile.exists()) {
			Scanner fileScanner = new Scanner(numbersFile);
			int i = 0;
			while (fileScanner.hasNext() && i < array.length) {
				array[i++] = fileScanner.nextInt();
			}
			fileScanner.close();
		}
	}
	
	public static int[] doubleArray(int[] array) {
		    for (int i = 0; i < array.length; i++) {
		        array[i] *= 2;
		    }
		    return array;
	}


	public static void main(String[] args) throws FileNotFoundException {
		// Create an array so we can cause trouble with it.
		int[] numbers = {0, 20, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		// *** First category of errors. ***
//		// Example 1.
//		// Find the largest value in the array.
//		int largest = numbers[0];
//		for (int i=2; i<numbers.length; i++) {
//			if (numbers[i]>largest) {
//				largest = numbers[i];
//			}
//		}
//		System.out.println("The largest value is " + largest + ".");
//		
//		// Example 2.
//		// Total the values in the array.
//		int total = 0;
//		for (int i=0; i<=numbers.length; i++) {
//			total += numbers[i];
//		}
//		System.out.println("The total of the values is " + total + ".");
		
//		// Example 3.
//		// Average the values in an array.
//		int valueTotal = 0;
//		int[] values = new int[100];
//		fillArray(values);
//		for (int i=0; i<values.length;i++) {
//			valueTotal += values[i];
//		}
//		System.out.println("The average of the values is " 
//		+ (double)valueTotal / values.length + ".");
		
		
//		// An enhanced for loop:
//		int newTotal = 0;
//		for (int element: numbers) {
//			newTotal += element;
//		}
//		System.out.println("The total of the values is " + newTotal + ".");
		
		// *** Second category of errors ***
//		// Example 4.
//		int[] moreNumbers;
//		moreNumbers[0] = 5;
//		
//		// Example 5.
//		Die[] dice;
//		dice = new Die[5];
//		dice[0].roll();
//		
		// *** Third category of errors ***
		// Example 6.
		// Make a copy of numbers and double the values in the copy.
//		int[] numbers2 = numbers;
//		for (int i=0; i<numbers2.length; i++) {
//			numbers2[i] *= 2;
//		}
//		// Print both arrays.
//		for (int i=0; i<numbers.length && i<numbers2.length; i++) {
//			System.out.println(numbers[i] + "\t" + numbers2[i]);
//		}
		
//		// Example 7.
//		int[] moreNumbers = doubleArray(numbers);
//		// Print both arrays.
//		for (int i=0; i<numbers.length && i<moreNumbers.length; i++) {
//			System.out.println(numbers[i] + "\t" + moreNumbers[i]);
//		}
		
		// *** Fourth category of errors ***
		// Example 8
//		for (int i: numbers) {
//			System.out.println(numbers[i]);
//		}
	}

}
