import java.util.Scanner;

public class LaundryAndWeather {

	public static void main(String[] args) {
		
		// Declare variables.
		double temperature;
		boolean hasSweater, hasTee;
		Scanner stdin;
		
		// Create a Scanner and obtain values to test from the user.
		stdin = new Scanner(System.in);
		System.out.print("What is the temperature? ");
		temperature = stdin.nextDouble();
		stdin.nextLine();
		System.out.print("Do you have a sweater? (yes or no): ");
		hasSweater = stdin.nextLine().toLowerCase().equals("yes");
		System.out.print("Do you have a t-shirt? (yes or no): ");
		hasTee = stdin.nextLine().toLowerCase().equals("yes");	
		stdin.close();
		
		// Determine whether we're going to the market with logic.
		if (temperature < 40 && hasSweater) {
			System.out.println("Walk to the market.");
		}
		if (temperature < 40 && !hasSweater) {
			System.out.println("Do laundry.");
		}
		if (temperature >= 40 && hasTee) {
			System.out.println("Walk to the market.");
		}
		if (temperature >= 40 && !hasTee) {
			System.out.println("Do laundry.");
		}
		
		// Do some comparisons with a nested if statement.
		if (temperature < 40) {
			if (hasSweater) {
				System.out.println("Walk to the market.");
			} else {
				System.out.println("Do laundry.");
			}
		} else {
			if (hasTee) {
				System.out.println("Walk to the market.");
			} else {
				System.out.println("Do laundry.");
			}
		}
	}

}
