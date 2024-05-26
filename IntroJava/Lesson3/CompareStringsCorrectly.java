
import java.util.Scanner;

public class CompareStringsCorrectly {

	public static void main(String[] args) {
		
		// Declare two String variables that are made up of the same characters.
		String hello1 = "Hello World";
		String hello2 = "Hello World";
		// Declare a third String variable and the Scanner.
		String hello3;
		Scanner stdin;
		
		// Read a third String from the user.
		stdin = new Scanner(System.in);
		System.out.print("Please enter Hello World: ");
		hello3 = stdin.nextLine();
		
		// Print all three strings.
		System.out.printf("String 1 is %s.\n", hello1);
		System.out.printf("String 2 is %s.\n", hello2);
		System.out.printf("String 3 is %s.\n", hello3);
		
		// Now print the results of comparisons, correctly using .equals.
		if (hello1.equals(hello2)) {
			System.out.println("String 1 and String 2 are the same.");
		}
		else {
			System.out.println("String 1 and String 2 are not the same.");
		}

		if (hello1.equals(hello3)) {
			System.out.println("String 1 and String 3 are the same.");
		}
		else {
			System.out.println("String 1 and String 3 are not the same.");
		}

		if (hello2.equals(hello3)) {
			System.out.println("String 2 and String 3 are the same.");
		}
		else {
			System.out.println("String 2 and String 3 are not the same.");
		}

		
		// Now print the results of comparisons, correctly using 
		// .equalsIgnoreCase.
		if (hello1.equalsIgnoreCase(hello2)) {
			System.out.println("String 1 and String 2 are the same, ignoring case.");
		}
		else {
			System.out.println("String 1 and String 2 are not the same.");
		}

		if (hello1.equalsIgnoreCase(hello3)) {
			System.out.println("String 1 and String 3 are the same, ignoring case.");
		}
		else {
			System.out.println("String 1 and String 3 are not the same.");
		}

		if (hello2.equalsIgnoreCase(hello3)) {
			System.out.println("String 2 and String 3 are the same, ignoring case.");
		}
		else {
			System.out.println("String 2 and String 3 are not the same.");
		}
		
		stdin.close();

	}

}



