import java.util.Scanner;

/**
 * The user-player in the Trick or Treat game.  The player is responsible
 * for maintaining its score and for taking turns.
 * This class interacts with the user via the console.
 * 
 * @author Maggie
 *
 */
public class Player {
	
	private int score;
	private Game game;
	private Scanner stdin;
	
	public Player(Game game) {
		this.game = game;
		this.stdin = new Scanner(System.in);
		this.score = 0;
	}

	public int getScore() {
		return this.score;
	}
	
	public void takeTurn(Die die) {
		// Declares and initializes variables.
		char rollAgain;				// The player's choice to roll again
		int roundScore = 0;				// The player's score this round
		boolean keepRolling = true;	// Whether we are/must roll again
		int roll;					// Value of the die roll
		// Roll until either the user rolls a trick or wants to quit after
		// rolling a treat.
		while (keepRolling) {
			// Roll the die.
			die.roll();
			roll = die.getValue();
			// If the die is a trick, no more rolling, the score is zero, and
			// lets the user know what happened
			if (roll == this.game.getTrick()) {
				roundScore = 0;
				keepRolling = false;
				System.out.println("You rolled a trick.  You lose your round points and your turn.");
			}
			// If the die is neither trick nor treat, the user must roll again;
			// lets them know.
			else if (roll != this.game.getTreat()) {
				System.out.printf("You rolled %d.  You must roll again.\n", roll);
			// If the die is a treat, the score is incremented and the user
			// chooses whether to keep rolling
			} else {
				roundScore += 1;
				System.out.printf("You rolled a treat!  Your score for this round is %d.\n", roundScore);
				System.out.print("Roll again?  y or n: ");
				rollAgain = stdin.nextLine().charAt(0);
				keepRolling = rollAgain == 'y';
				}
		}
		this.score += roundScore;
	}
}
