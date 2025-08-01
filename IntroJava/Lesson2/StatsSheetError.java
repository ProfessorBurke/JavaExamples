import java.util.Scanner;

public class StatsSheetError {

	public static void main(String[] args) {
		
		// Character traits.
		int strength;
		int wisdom;
		String name;
		
		// Declares and creates the Scanner.
		Scanner stdin;	
		stdin = new Scanner(System.in);
		
		// Obtains player stats from the user and closes the Scanner.
		System.out.print("What is the character's strength stat? ");
		strength = stdin.nextInt();
		System.out.print("What is the character's name? ");
		name = stdin.nextLine();
		System.out.print("What is the character's wisdom stat? ");
		wisdom = stdin.nextInt();
		stdin.close();
		
		// Displays the traits the user entered.
		System.out.println("Strength: " + strength);
		System.out.println("Wisdom: " + wisdom);
		System.out.println("Name: " + name);
	}

}
