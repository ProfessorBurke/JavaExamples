import java.util.Scanner;

/**
 * Obtain a valid age from the user using a pre-test loop.
 * @author Maggie
 *
 */
public class ValidateAgePreTest {

	public static void main(String[] args) {
		
		// Declare and initialize variables.
		int age;
		Scanner stdin = new Scanner(System.in);
		
		// Obtain an age in the range 1-120.
		System.out.print("What is your age? ");
		age = stdin.nextInt();
		while (age < 1 || age > 120) {
			System.out.println("Please enter an age between 1 and 120.");
			System.out.print("What is your age? ");
			age = stdin.nextInt();
		} 
		
		assert (age >= 1 && age <= 120);
		
		System.out.printf("You are %d years old.\n", age);
		stdin.close();
	}

}
