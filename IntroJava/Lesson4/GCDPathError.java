import java.util.Scanner;

public class GCDPathError {

	public static void main(String[] args) {
		
		// Declare variables.
		int a, b, remainder;
		Scanner stdin;
		
		// Obtain a and b from the user.
		stdin = new Scanner(System.in);
		System.out.println("Please enter two positive integer values, largest first.");
		System.out.print("Please enter the larger value: ");
		a = stdin.nextInt();
		System.out.print("Please enter the smaller value: ");
		b = stdin.nextInt();
		
		// Confirm inputs are positive and a is larger, and if so, compute GCD.
		if (a >= b && a > 0 && b > 0) {
			while (b != 0) {
				a = b;
	            remainder = a % b;
	            b = remainder;
	        }
			System.out.printf("The GCD is %d.\n", a);
		} else {
			System.out.println("There was a problem with the inputs.");
		}
		
		// Close the scanner.
		stdin.close();

	}

}
