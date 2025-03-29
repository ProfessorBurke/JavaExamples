import java.util.Scanner;

public class SequentialSearch {

	public static void main(String[] args) {
		
		// Declare and initialize the array of years.
		int[] years = {2000, 1972, 2013, 1954, 1967};
		// Declare other variables.
		Scanner stdin;
		int searchYear;
		int foundIndex, i; 
		boolean found;
		
		// Obtain the year to search for.
		stdin= new Scanner(System.in);
		System.out.print("What year would you like to search for? ");
		searchYear = stdin.nextInt();
		stdin.close();
		
		
		// Search for the year using a sequential search.
		foundIndex = -1;
		found = false;
		i = 0;
		while (i < years.length && !found) {
			if (years[i] == searchYear) {
				found = true;
				foundIndex = i;
			} else {
				i++;
			}
		}
		
		// Display a message.
		if (found) {
			System.out.printf("The year was found at index %d.\n", foundIndex);
		} else {
			System.out.println("The year was not found.");
		}

	}

}
