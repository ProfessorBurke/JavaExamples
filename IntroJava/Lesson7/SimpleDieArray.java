
public class SimpleDieArray {

	public static void main(String[] args) {
	
		// Declare the array of dice.
		Die[] diceArray;
		
		// Create the array.
		diceArray = new Die[10];
		
		// Fill the array with Die objects.
		for (int i = 0; i < diceArray.length; i++) {
			diceArray[i] = new Die();
		}
		
		// Get and display each Die's value, roll, 
		// and get and print the value again.
		for (int i = 0; i< diceArray.length; i++) {
			Die currentDie = diceArray[i];
			int value = currentDie.getValue();
			System.out.println(value);
			diceArray[i].roll();
			System.out.println(diceArray[i].getValue());
		}
		
		int total = 0;
		for (int i = 0; i < diceArray.length; i++) {
			total += diceArray[i].getValue();
		}
		System.out.printf("The average of the dice is %.1f.\n", (double)total / diceArray.length);

	}

}
