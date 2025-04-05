
public class DiceArrayMethods {
	
	public static Die[] makeDice(int numDice) {
		Die[] dice = new Die[numDice];
				
		for (int i = 0; i < dice.length; i++) {
			dice[i] = new Die();
		}
		
		return dice;
	}
	
	public static void rollDice(Die[] dice) {
		for (int i = 0; i< dice.length; i++) {
			dice[i].roll();
		}		
	}

	public static void main(String[] args) {
	
		// Create an array of Die objects.
		Die[] diceArray = makeDice(10);
		
		Die[] copy = new Die[diceArray.length];
		for (int i=0; i < diceArray.length; i++) {
			copy[i] = new Die(diceArray[i]);
		}
		
		// Roll the dice.
		rollDice(diceArray);
		
		// Display the Die values.
		for (int i = 0; i< diceArray.length; i++) {
			System.out.println(diceArray[i].getValue());
		}

	}

}
