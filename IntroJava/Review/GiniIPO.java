import java.util.Scanner;

/**
 * Obtains a country name and two years and Gini coefficients for those
 * years from the user, then calculates and reports the difference.
 * 
 * @author Maggie
 *
 */
public class GiniIPO {

	public static void main(String[] args) {
		int year1, year2;					// Years of the Gini coefficients
		double gini1, gini2, difference;	// Coefficients and gini2-gini1
		String name, output;				// Country name and output string
		
		// Obtains country data from the user.
		Scanner stdin = new Scanner(System.in);
		System.out.print("Please enter the country name: ");
		name = stdin.nextLine();
		System.out.print("Please enter the first year: ");
		year1 = stdin.nextInt();
		System.out.print("Please enter the first year's Gini coefficient: ");
		gini1 = stdin.nextDouble();
		System.out.print("Please enter the second year: ");
		year2 = stdin.nextInt();
		System.out.print("Please enter the second year's Gini coefficient: ");
		gini2 = stdin.nextDouble();
		
		// Calculates the Gini coefficient difference between the two years.
		difference = gini2 - gini1;
		
		// Displays the difference to the console.
		output = String.format("The Gini coefficient difference for %s ", name);
		output += String.format("between the years %d and %d is ", year1, year2);
		output += String.format("%.3f.", difference);
		System.out.println(output);
		
	}

}
