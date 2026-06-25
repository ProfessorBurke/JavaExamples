
public class DiceProgram {

	public static void main(String[] args) {
		
		// Create four six-sided dice.
		Die die1, die2, die3, die4;
		System.out.println(Die.getCount());
 		die1 = new Die();
 		System.out.println(Die.getCount());
 		die2 = new Die();
 		System.out.println(Die.getCount());
 		die3 = new Die();
 		System.out.println(Die.getCount());
 		die4 = new Die();
 		System.out.println(Die.getCount());
		System.out.println();
		
		// Print their values.
 		System.out.println(die1.getFaceValue());
 		System.out.println(die2.getFaceValue());
 		System.out.println(die3.getFaceValue());
 		System.out.println(die4.getFaceValue());
 		System.out.println();
 		
 		// Roll them.
		die1.roll();
		die2.roll();
		die3.roll();
		die4.roll();
		
		// Print their new values.
 		System.out.println(die1.getFaceValue());
 		System.out.println(die2.getFaceValue());
 		System.out.println(die3.getFaceValue());
 		System.out.println(die4.getFaceValue());
	}

}
