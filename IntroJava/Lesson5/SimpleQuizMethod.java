import java.util.Scanner;

public class SimpleQuizMethod {
	
	public static char poseQuestion(String question, String answerA,
			String answerB, String answerC, String answerD,
			Scanner stdin) {
		char answer;
		do {
			System.out.println(question);
			System.out.println(answerA);
			System.out.println(answerB);
			System.out.println(answerC);
			System.out.println(answerD);
			System.out.print("What is the letter of your answer? ");
			answer = stdin.nextLine().charAt(0);
		} while (answer < 'a' || answer > 'd');
		return answer;
	}

	public static void main(String[] args) {
		
		// Declare variables
		Scanner stdin = new Scanner(System.in);
		char answer = 'x';
		
		// Pose a question and get the user's answer.
		while (answer != 'c') {
			
			answer = poseQuestion("What is the complement of 400 <= co2Reading && co2Reading <= 800?",
					"a) 400 <= co2Reading || co2Reading <= 800",
					"b) 400 > co2Reading && co2Reading > 800",
					"c) 400 > co2Reading || co2Reading > 800",
					"d) 400 < co2Reading || co2Reading < 800",
					stdin);
			
			// Give the user some feedback based on their answer.
			switch (answer) {
				case 'a':
				case 'A':
					System.out.println("Or || is not the complement of and &&.");
				    break;
				case 'b':
				case 'B':
					System.out.println("Remember, with DeMorgan's theorem, "
							+ "you need to complement each side and change the "
							+ "and to an or.");
				    break;
				case 'c':
				case 'C':
					System.out.println("Well done!");
				    break;
				case'd':
				case 'D':
					System.out.print("Review DeMorgan's theorem and your relational"
							+ " operator complements and try again!");
				    break;
				default:
					assert (answer != 'a' && answer != 'b' && answer != 'c' 
							&& answer != 'd' && answer != 'A' && answer != 'B'
							&& answer != 'C' && answer != 'D');
					System.out.println("I'm sorry, that wasn't an option.");
			} // switch(answer)
		}  // while user hasn't answered correctly
		assert answer == 'c';
		stdin.close();
	}

}
