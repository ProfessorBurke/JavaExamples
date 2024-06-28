import java.util.Scanner;

public class SimpleQuizSerialIf {

	public static void main(String[] args) {
		
		// Declare variables
		Scanner stdin;
		char answer;
		
		
		// Pose a question and get the user's answer.
		stdin = new Scanner(System.in);
		System.out.print("What is the complement of ");
		System.out.println("400 <= co2Reading && co2Reading <= 800?");
		System.out.println("a) 400 <= co2Reading || co2Reading <= 800");
		System.out.println("b) 400 > co2Reading && co2Reading > 800");
		System.out.println("c) 400 > co2Reading || co2Reading > 800");
		System.out.println("d) 400 < co2Reading || co2Reading < 800");
		System.out.print("What is the letter of your answer? ");
		answer = stdin.nextLine().toLowerCase().charAt(0);
		stdin.close();
		
		// Give the user some feedback based on their answer.
		if (answer == 'a') {
			System.out.println("Or || is not the complement of and &&.");
		} else if (answer == 'b') {
			System.out.println("Remember, with DeMorgan's theorem, "
					+ "you need to complement each side and change the "
					+ "and to an or.");
		} else if (answer == 'c') {
			System.out.println("Well done!");
		} else if (answer == 'd') {
			System.out.print("Review DeMorgan's theorem and your relational"
					+ " operator complements and try again!");
		} else {
			assert (answer != 'a' && answer != 'b' && answer != 'c' 
					&& answer != 'd');
			System.out.println("I'm sorry, that wasn't an option.");
		}
	}

}
