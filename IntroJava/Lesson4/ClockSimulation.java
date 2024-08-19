/**
 * Simulates the minutes of an hour with nested loops.
 * @author Maggie
 *
 */
public class ClockSimulation {

	public static void main(String[] args) {
		int seconds;		// Controls the inner (seconds) loop
		int minutes;		// Controls the outer (minutes) loop
		
		// The outer loop has an initializer on line 14, test on 15,
		// and updater on 23.
		minutes = 0;
		while (minutes < 60) {
			// The inner loop has an initializer on line 18, test on 19,
			// and updater on 21.
			seconds = 0;
			while (seconds < 60) {
				System.out.printf("%02d:%02d\n", minutes, seconds);
				seconds ++;
			}
			minutes ++;
		}
	}

}
