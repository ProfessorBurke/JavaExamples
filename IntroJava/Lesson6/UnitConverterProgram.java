import java.util.Scanner;

public class UnitConverterProgram {

	public static void main(String[] args) {
		
		// Declare variables.
		Scanner stdin;
		double inches, centimeters, pounds, kilograms;
		
		// Obtain some measurements in imperial units from the user.
		stdin = new Scanner(System.in);
		System.out.print("How tall are you in inches? ");
		inches = stdin.nextDouble();
		System.out.print("What do you weigh in pounds? ");
		pounds = stdin.nextDouble();
		stdin.close();
		
		// Convert the measurements to metric units.
		centimeters = UnitConverter.inchesToCentimeters(inches);
		kilograms = UnitConverter.poundsToKilograms(pounds);
		
		// Display the conversions.
		System.out.printf("You are %.2f centimeters tall.\n", centimeters);
		System.out.printf("There are %.4f centimeters per inch.\n", 
				UnitConverter.INCHES_TO_CENTIMETERS);
		System.out.printf("You weigh %.2f kilograms.\n", kilograms);
		System.out.printf("There are %.4f kilograms per pound.\n", 
				UnitConverter.POUNDS_TO_KILOGRAMS);
	}

}
