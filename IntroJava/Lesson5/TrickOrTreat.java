import java.util.Random;
import java.util.Scanner;

public class TrickOrTreat {
	
	/**
	 * Generates and returns a random number between 1 and 6 inclusive.
	 * 
	 * @param random	A random number generator
	 * @return			A random number between 1 and 6
	 */
	public static int getTrick(Random random) {
		return random.nextInt(6) + 1;
	}
	
	/**
	 * Generates and returns a random number between 1 and 6 inclusive that is
	 * different from trick.
	 * 
	 * @param random	A random number generator
	 * @param trick		The trick -- treat must be a different number
	 * @return			A random number between 1 and 6 that is not trick
	 */
	public static int getTreat(Random random, int trick) {
		int treat = random.nextInt(6) + 1;
		while (treat == trick) {
			treat = random.nextInt(6) + 1;
		}
		return treat;
	}
	
	/**
	 * Plays a turn with the player.  This interacts with the user to play a
	 * round.  The player earns a point for every treat rolled, but rolling
	 * a trick ends the round and reduces points to zero.  If neither a trick
	 * nor a treat is rolled, the player must roll again.  If a treat is rolled,
	 * the player chooses whether to roll again.
	 * 
	 * @param random	The random number generator
	 * @param trick		The trick value (ends a round)
	 * @param treat		The treat value (adds a point)
	 * @param stdin		Scanner to interact with the user
	 * @return			The player's score for this round
	 */
	public static int playerTurn(Random random, int trick, int treat,
			Scanner stdin) {
		// Declares and initializes variables.
		char rollAgain;				// The player's choice to roll again
		int score = 0;				// The player's score this round
		boolean keepRolling = true;	// Whether we are/must roll again
		int roll;					// Value of the die roll
		// Roll until either the user rolls a trick or wants to quit after
		// rolling a treat.
		while (keepRolling) {
			// "Roll" the die.
			roll = random.nextInt(6) + 1;
			// If the die is a trick, no more rolling, the score is zero, and
			// lets the user know what happened
			if (roll == trick) {
				score = 0;
				keepRolling = false;
				System.out.println("You rolled a trick.  You lose your round points and your turn.");
			}
			// If the die is neither trick nor treat, the user must roll again;
			// lets them know.
			else if (roll != treat) {
				System.out.printf("You rolled %d.  You must roll again.\n", roll);
			// If the die is a treat, the score is incremented and the user
			// chooses whether to keep rolling
			} else {
				score += 1;
				System.out.printf("You rolled a treat!  Your score for this round is %d.\n", score);
				System.out.print("Roll again?  y or n: ");
				rollAgain = stdin.nextLine().charAt(0);
				keepRolling = rollAgain == 'y';
				}
		}
		return score;
	}
	
	/**
	 * Plays a turn with the computer.  Displays messages to the user, letting
	 * the user know what's happening in the computer's turn.
	 * The computer must roll at least three times unless it rolls
	 * a trick and must quit.
	 * 
	 * @param random	The random number generator
	 * @param trick		The trick value (ends a round)
	 * @param treat		The treat value (adds a point)
	 * @return			The computer's score for this round
	 */
	public static int computerTurn(Random random, int trick, int treat) {
		// Declares and initializes variables.
		int score = 0;				// The computer's score this round
		boolean keepRolling = true;	// Whether we are/must roll again
		int roll;					// Value of the die roll
		int numRolls = 0;			// Count of the number of rolls
		// Roll until either the computer rolls a trick or we've rolled three
		// times and are allowed to quit.
		while (keepRolling) {
			// "Roll" the die and increment the number of rolls.
			roll = random.nextInt(6) + 1;
			numRolls++;
			// If the die is a trick, no more rolling, the score is zero, and
			// lets the user know what happened
			if (roll == trick) {
				score = 0;
				keepRolling = false;
				System.out.println("The computer rolled a trick. The turn is ended.");
			}
			// If the die is neither trick nor treat, the computer must roll again;
			// lets the user know.
			else if (roll != treat) {
				System.out.printf("The computer rolled %d and must roll again.\n", roll);
			// If the die is a treat, the score is incremented and if there have
			// been at least three rolls, the computer quits.
			} else {
				score += 1;
				System.out.printf("The computer rolled a treat!  Its score for this round is %d.\n", score);
				keepRolling = numRolls < 3;
				}
		}
		return score;

	}

	/**
	 * Plays a game of Trick or Treat until one of the players wins.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare and initialize variables.
		final int WINNING_POINTS = 5;				// Points to win the game
		Scanner stdin =  new Scanner(System.in);	// To interact with the user
		Random random =  new Random();				// To "roll" the die
		int trick = getTrick(random);				// Value ends a round
		int treat = getTreat(random, trick);		// Value for points
		int playerScore = 0, computerScore = 0;		// Player scores
		int roundNum = 1;							// The number of the round
		
		// Displays the trick and the treat
		System.out.printf("The trick is %d and the treat is %d.\n", trick, treat);
		
		// While neither player has reached the winning amount of points,
		// gives the player a turn and then the computer a turn, printing
		// a message once one has won.
		while (playerScore < WINNING_POINTS && computerScore < WINNING_POINTS) {
			System.out.println("\n----------------------------------------------------");
			// Gives the player a turn.
			playerScore += playerTurn(random, trick, treat, stdin);
			// If the player hasn't won, gives the computer a turn.
			if (playerScore < WINNING_POINTS) {
				computerScore += computerTurn(random, trick, treat);
				// If the computer has now won, prints a message.
				if (computerScore >= WINNING_POINTS) {
					System.out.println("The computer won.");
				}
			// If the player has won, prints a message.
			} else {
				System.out.println("You won!");
			}
			System.out.printf("After round %d,\n\tComputer: %d\n\tPlayer: %d\n", roundNum, computerScore, playerScore);
			roundNum++;
		}
	}

}
