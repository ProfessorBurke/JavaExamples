import java.util.Random;

public class Computer {
	
	private Game game;
	private int score;
	
	public Computer(Game game) {
		this.game = game;
		this.score = 0;
	}

	public int getScore() {
		return this.score;
	}
	
	public void takeTurn(Die die) {
		// Declares and initializes variables.
		int roundScore = 0;				// The computer's score this round
		boolean keepRolling = true;	// Whether we are/must roll again
		int roll;					// Value of the die roll
		int numRolls = 0;			// Count of the number of rolls
		// Roll until either the computer rolls a trick or we've rolled three
		// times and are allowed to quit.
		while (keepRolling) {
			// Roll the die and increment the number of rolls.
			die.roll();
			roll = die.getValue();
			numRolls++;
			// If the die is a trick, no more rolling, the score is zero, and
			// lets the user know what happened
			if (roll == this.game.getTrick()) {
				roundScore = 0;
				keepRolling = false;
				System.out.println("The computer rolled a trick. The turn is ended.");
			}
			// If the die is neither trick nor treat, the computer must roll again;
			// lets the user know.
			else if (roll != this.game.getTreat()) {
				System.out.printf("The computer rolled %d and must roll again.\n", roll);
			// If the die is a treat, the score is incremented and if there have
			// been at least three rolls, the computer quits.
			} else {
				roundScore += 1;
				System.out.printf("The computer rolled a treat!  Its score for this round is %d.\n", roundScore);
				keepRolling = numRolls < 3;
				}
		}
		this.score += roundScore;

	}
}
