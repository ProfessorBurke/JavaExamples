import java.util.Scanner;

/**
 * Obtains the user's weight on Earth and asks if they want to know
 * their weight on Mars or the Moon. Then calculates and displays the user's
 * weight on the moon using the formula earthWeight / 9.81 * 1.622
 * or the user's weight on mars using the formula earthWeight / 9.81 * 3.72076 
 * Now with an assert in the else!  6/9/2024
 * 
 * @author Maggie
 *
 */
public class MoonWeightAssert {

	public static void main(String[] args) {
		
		final double EARTH_GRAVITY = 9.81;
		final double MOON_GRAVITY = 1.622;
		final double MARS_GRAVITY = 3.72076;
		
		Scanner stdin;       // Scanner for obtaining input from the console.
		double earthWeight;  // User's weight on Earth.
		double celestialWeight;   // User's calculated weight on the moon.
		int choice;          // The moon or Mars.
		
		// Obtains the weight on Earth from the user.
		stdin = new Scanner(System.in);
		System.out.print("Enter a 1 if you want your weight calculated on the moon, ");
		System.out.println("and a 2 if you want your weight calculated on Mars.");
		System.out.print("The moon? (1) or Mars? (2): ");
		choice = stdin.nextInt();
		System.out.print("Please enter your weight on Earth: ");
		earthWeight = stdin.nextDouble();
		stdin.close();
		
		// Calculate the user's weight on the moon or Mars, depending on
		// their choice.
		if (choice == 1) {
			celestialWeight = earthWeight / EARTH_GRAVITY * MOON_GRAVITY;
		}
		else {
			assert choice != 1;
			celestialWeight = earthWeight / EARTH_GRAVITY * MARS_GRAVITY;
		}
		
		
		// Display the user's weight on the moon.
		System.out.println("Your celestial weight is " + celestialWeight + ".");
	}

}

