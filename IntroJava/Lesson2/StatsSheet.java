import java.util.Scanner;

public class StatsSheet {

	public static void main(String[] args) {
		
		// Character traits.
		int strength;
		int wisdom;
		int charisma;
		String name;
		Scanner stdin;	// To obtain user input.
		
		// Obtains player stats from the user.
		stdin = new Scanner(System.in);
		System.out.print("What is the character's strength stat? ");
		strength = stdin.nextInt();
		System.out.print("What is the character's wisdom stat? ");
		wisdom = stdin.nextInt();
		System.out.print("What is the character's charisma stat? ");
		charisma = stdin.nextInt();
		System.out.print("What is the character's name? ");
		// Consumes the newline left in the input stream.
		stdin.nextLine();
		name = stdin.nextLine();
		stdin.close();
		
		// Displays the traits the user entered.
		System.out.println("Strength: " + strength);
		System.out.println("Wisdom: " + wisdom);
		System.out.println("Charisma: " + charisma);
		System.out.println("Name: " + name);
	}

}
