
public class DiceRoller {

	public static void main(String[] args) {
		
		DieError[] dice = new DieError[6];
		
		for (int i=0; i<dice.length; i++) {
			dice[i] = new DieError();
		}
		
		for (DieError die : dice) {
			die.roll();
			System.out.println(die.getValue());
		}

	}

}
