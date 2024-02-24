import java.util.Scanner;

/**
 * Obtains the user's weight on Earth, then calculates and displays the user's
 * weight on the moon using the formula earthWeight / 9.81 * 1.622.
 * 2/23/2024
 * 
 * @author Maggie
 *
 */
public class MoonWeightCalculator {

	public static void main(String[] args) {
		
		final double EARTH_GRAVITY = 9.81;
		final double MOON_GRAVITY = 1.622;
		
		Scanner stdin;       // Scanner for obtaining input from the console.
		double earthWeight;  // User's weight on Earth.
		double moonWeight;   // User's calculated weight on the moon.
		
		// Obtains the weight on Earth from the user.
		stdin = new Scanner(System.in);
		System.out.print("Please enter your weight on Earth: ");
		earthWeight = stdin.nextDouble();
		stdin.close();
		
		// Calculates the user's weight on the moon.
		moonWeight = earthWeight / EARTH_GRAVITY * MOON_GRAVITY;
		
		// Displays the user's weight on the moon.
		System.out.println("Your weight on the moon is " + moonWeight + ".");
	}

}
