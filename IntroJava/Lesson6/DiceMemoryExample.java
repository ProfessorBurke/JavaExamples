
public class DiceMemoryExample {
	
	public static void rollDice(Die die1, Die die2) {
		die1.roll();
		die2.roll();
	}
	
	public static int getTotal(Die die1, Die die2) {
		return die1.getValue() + die2.getValue();
	}
	
	public static boolean isDoubles(Die die1, Die die2) {
		return die1.getValue() == die2.getValue();
	}
	
	public static Die makeD6() {
		Die die = new Die();
		return die;
	}

	public static void main(String[] args) {
		
		Die d61, d62, d63;
		int i;

		// Create two dice by invoking the method.
		d61 = makeD6();
		d62 = makeD6();
		// "Create" the third by assignment statement.
		d63 = d61;

		// Roll, compare for doubles, get total, and compare for equality
		// 10 times for d61 and d62.
		System.out.println("Rolling, totaling, and comparing die 1 and die 2.");
		for (i = 0; i < 10; i++) {
			System.out.println("---------------------------------------------- Roll " + (i + 1));
			rollDice(d61, d62);
			System.out.println("Total of die 1 and die 2: " + getTotal(d61, d62));
			System.out.println("Do die 1 and die 2 show the same value? " +
			(isDoubles(d61, d62) ? "yes" : "no"));
			System.out.println("Are die 1 and die 2 the same? " + 
			(d61 == d62 ? "yes" : "no"));
		}
		
		// Now do the same for d61 and d63.	
		System.out.println("\nRolling, totaling, and comparing die 1 and die 3.");
		for (i = 0; i < 10; i++) {
			System.out.println("---------------------------------------------- Roll " + (i + 1));
			rollDice(d61, d63);
			System.out.println("Total of die 1 and die 3: " + getTotal(d61, d63));
			System.out.println("Do die 1 and die 3 show the same value? " +
			(isDoubles(d61, d63) ? "yes" : "no"));
			System.out.println("Are die 1 and die 3 the same? " + 
			(d61 == d63 ? "yes" : "no"));
		}
	}

}
