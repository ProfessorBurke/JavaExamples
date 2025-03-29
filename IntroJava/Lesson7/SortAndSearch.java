import java.util.Scanner;

public class SortAndSearch {

	public static void main(String[] args) {
		// Sorting code
		// Declare and initialize the array of years.
		int[] years = {2000, 1972, 2013, 1954, 1967};
		
		// Declare other variables.
		int smallest, temp;

		// Sort the array.
		for (int start = 0; start < years.length-1; start++) {
			smallest = start;
			for (int i = start + 1; i < years.length; i++) {
				if (years[i] < years[smallest]) {
					smallest = i;
				}
			}
			temp = years[start];
			years[start] = years[smallest];
			years[smallest] = temp;
		}
		
		// Display the sorted array.
		int j;
		for (j = 0; j < years.length-1; j++) {
			System.out.print(years[j] + ", ");
		}
		System.out.println(years[j]);
		
		// Searching code
		// Ask the user for a value to search for and use a binary search
		// to search the array.
		
		// Obtain the value to search for.
		Scanner stdin = new Scanner(System.in);
		System.out.print("What year would you like to search for? ");
		int target = stdin.nextInt();
		stdin.close();
		
		// Conduct the search.
		int foundIndex = -1;
		int left = 0;
        int right = years.length - 1;

        while (left <= right && foundIndex == -1) {
            int middle = left + (right - left) / 2;  

            // Found the value
            if (years[middle] == target) {
                foundIndex = middle; 
            // Search in the right half
            } else if (years[middle] < target) {
                left = middle + 1;  
            // Search in the left half
            } else {
                right = middle - 1; 
            }
        }
        
        // Display the location of the year.
        if (foundIndex == -1) {
        	System.out.println("That year was not found.");
        } else {
        	System.out.println("The year was found at index " + foundIndex + ".");
        }


	}

}
