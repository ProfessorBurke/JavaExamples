import java.util.Scanner;

/**
 * Obtains a country name and two years and Gini coefficients for those
 * years from the user, then calculates and reports the difference.
 * Does this in a loop, allowing the user to enter "done" instead of a country
 * name when they're finished entering data.  Validates the first gini
 * coefficients.
 * 
 * @author Maggie
 *
 */
public class GiniMethods {
	
	/**
	 * Obtain a Gini coefficient from the user until the enter a valid value
	 * (between 0 and 1 inclusive.)
	 * 
	 * @param stdin	The Scanner that is connected to standard input.
	 * @return		A valid Gini coefficient.
	 */
	public static double obtainValidGini(Scanner stdin) {
		double gini;
		
		System.out.print("Please enter the Gini coefficient: ");
		gini = stdin.nextDouble();
		while (gini < 0 || gini > 1) {
			System.out.println("The Gini coefficient must be between 0 and 1.");
			System.out.print("Please enter the Gini coefficient: ");
			gini = stdin.nextDouble();
		}
		return gini;
	}

	/**
	 * Obtains Gini country data from the user until they're done entering
	 * data.
	 * 
	 * @param args	Unused
	 */
	public static void main(String[] args) {
		int year1, year2;					// Years of the Gini coefficients
		double gini1, gini2, difference;	// Coefficients and gini2-gini1
		String name, output;				// Country name and output string
		
		// Obtains country data from the user.
		Scanner stdin = new Scanner(System.in);
		System.out.print("Please enter the country name or 'done' to quit: ");
		name = stdin.nextLine();
		
		while (!name.equalsIgnoreCase("done")) {
			// Obtain years and obtain and validate Gini coefficients.
			System.out.print("Please enter the first year: ");
			year1 = stdin.nextInt();
			gini1 = obtainValidGini(stdin);
			System.out.print("Please enter the second year: ");
			year2 = stdin.nextInt();
			gini2 = obtainValidGini(stdin);
			stdin.nextLine();
			
			// Calculates the Gini coefficient difference between the two years.
			difference = gini2 - gini1;
			
			// Displays the difference to the console with a customized message
			// depending on whether the difference is positive, negative, or
			// unchanged.
			if (difference > 0) {
				output = String.format("The Gini coefficient for %s ", name);
				output += String.format("between the years %d and %d ", year1, year2);
				output += String.format("increased by %.3f.", difference);
			} else if (difference < 0) {
				output = String.format("The Gini coefficient for %s ", name);
				output += String.format("between the years %d and %d ", year1, year2);
				output += String.format("decreased by %.3f.", difference);
			} else {
				output = String.format("The Gini coefficient for %s ", name);
				output += String.format("between the years %d and %d ", year1, year2);
				output += String.format("did not change.");
			}
			System.out.println(output);
			
			// Obtains the next country name or "done" if the user is quitting.
			System.out.print("Please enter the country name or 'done' to quit: ");
			name = stdin.nextLine();
		}
	}

}
