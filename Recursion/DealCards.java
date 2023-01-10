import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DealCards {
	
	/**
	 * Randomize the values in the parameter deck.
	 * 
	 * @param deck Integer values representing a standard deck of cards.
	 */
	public static void shuffle(Integer[] deck) {
		List<Integer> listDeck = Arrays.asList(deck);
		Collections.shuffle(listDeck);
		listDeck.toArray(deck);
	}
	
	/**
	 * A private recursive method to deal n cards until the sum of the cards reaches 17.
	 * Precondition:  deck must be full (52 integer values in standard deck proportions)
	 * Postcondition: Will return the sum of the first n cards until total reaches 17.
	 * 
	 * @param deck  A shuffled deck of cards.
	 * @param total  The sum of the cards from index 0 through index top-1
	 * @param top The index of the current "top" of the deck
	 * @return The sum of the first n cards until sum reaches 17.
	 */
	private static int recursiveBlackjack(Integer[] deck, int total, int top) {
		if (total >= 17) {
			return total;
		} else { return recursiveBlackjack(deck, total + deck[top], ++top); }
	}

	/**
	 * Add the first five cards in deck.
	 * 
	 * @param deck A shuffled deck of cards.
	 * @param top The index of the current "top" of the deck
	 * @return The sum of the first five cards in the deck.
	 */
	public static int addCards(Integer[] deck, int top) {
		if (top == 4) {
			return deck[top];
		} else {
			return deck[top] + addCards(deck, ++top);
		}
	}
	
	/**
	 * Public method for returning the sum of a single Blackjack hand dealt off
	 * the deck passed.
	 * Precondition:  deck must be full (52 integer values in standard deck proportions)
	 * Postcondition: Will return the sum of the first n cards until total reaches 17.
	 * 
	 * @param deck A shuffled deck of cards.  
	 * @return the total of the first n cards until total reaches 17.
	 */
	public static int blackjack(Integer[] deck) {
		return recursiveBlackjack(deck, 0, 0);
	}
	
	public static void main(String[] args) {
		Integer[] deck = {1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,
				10,10,10,10,10,10,10,10,10,10,10,10};
		
		for (int i = 0; i < 10; i++) {
			shuffle(deck);
			System.out.println(deck[0] + deck[1] + deck[2] + deck[3] + deck[4]);
			System.out.println(addCards(deck, 0));
			int result = recursiveBlackjack(deck, 0, 0);
			System.out.println(result);
		}
		
	}

}
