import java.util.Scanner;

/**
 * Obtains the user's age and weight on Earth, then calculates 
 * and displays the user's age and weight on the moon using the formulas 
 * moonWeight = earthWeight / 9.81 * 1.622
 * moonAge = earthAge * 13.52
 * 2/23/2024
 * 
 * @author Maggie
 *
 */
public class MoonWeightAgeCalculator {

	public static void main(String[] args) {
		
		final double EARTH_GRAVITY = 9.81;
		final double MOON_GRAVITY = 1.622;
		final double MOON_ROTATIONS = 13.52;
		
		Scanner stdin;       // Scanner for obtaining input from the console.
		double earthWeight;  // User's weight on Earth.
		double moonWeight;   // User's calculated weight on the moon.
		int earthAge;        // User's age on Earth.
		double moonAge;      // User's calculated age on the moon.
		
		// Obtains the age and weight on Earth from the user.
		stdin = new Scanner(System.in);
		System.out.print("Please enter your weight on Earth: ");
		earthWeight = stdin.nextDouble();
		System.out.print("Please enter your age on Earth: ");
		earthAge = stdin.nextInt();
		stdin.close();
		
		// Calculate the user's age and weight on the moon.
		moonWeight = earthWeight / EARTH_GRAVITY * MOON_GRAVITY;
		moonAge = earthAge * MOON_ROTATIONS;
		
		// Display the user's age and weight on the moon.
		System.out.println("Your weight on the moon is " + moonWeight + ".");
		System.out.println("Your age on the moon is " + moonAge + ".");
	}

}
