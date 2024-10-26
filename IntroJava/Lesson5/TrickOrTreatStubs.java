import java.util.Random;
import java.util.Scanner;

public class TrickOrTreatStubs {
	
	/**
	 * Stub for getTrick, a random number between 1 and 6 inclusive.
	 * 
	 * @param random	A random number generator
	 * @return			A random number between 1 and 6
	 */
	public static int getTrick(Random random) {
		return 1;
	}
	
	/**
	 * Stub for getTreat, a random number between 1 and 6 inclusive that is
	 * different from trick.
	 * 
	 * @param random	A random number generator
	 * @param trick		The trick -- treat must be a different number
	 * @return			A random number between 1 and 6 that is not trick
	 */
	public static int getTreat(Random random, int trick) {
		return 2;
	}
	
	/**
	 * Stub for the player turn.  This interacts with the user to play a
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
		return 0;
	}
	
	/**
	 * Stub for computer turn.  This should allow the computer to play a
	 * round.  The computer must roll at least three times unless it rolls
	 * a trick and must quit.
	 * 
	 * @param random	The random number generator
	 * @param trick		The trick value (ends a round)
	 * @param treat		The treat value (adds a point)
	 * @return			The computer's score for this round
	 */
	public static int computerTurn(Random random, int trick, int treat) {
		return 1;
	}

	/**
	 * Plays a game of Trick or Treat until one of the players wins.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declares and initializes variables.
		final int WINNING_POINTS = 5;				// Points to win the game
		Scanner stdin =  new Scanner(System.in);	// To interact with the user
		Random random =  new Random();				// To "roll" the die
		int trick = getTrick(random);				// Value ends a round
		int treat = getTreat(random, trick);		// Value for points
		int playerScore = 0, computerScore = 0;		// Player scores
		
		// While neither player has reached the winning amount of points,
		// gives the player a turn and then the computer a turn, printing
		// a message once one has won.
		while (playerScore < WINNING_POINTS && computerScore < WINNING_POINTS) {
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
		}
	}

}
