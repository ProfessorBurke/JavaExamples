/**
 * Simulates the minutes of an hour with nested for loops.
 * @author Maggie
 *
 */
public class ClockSimulationCounting {

	public static void main(String[] args) {
		int seconds;		// Controls the inner (seconds) loop
		int minutes;		// Controls the outer (minutes) loop
		

		for (minutes = 0; minutes < 60; minutes ++) {
			for (seconds = 0; seconds < 60; seconds ++) {
				System.out.printf("%02d:%02d\n", minutes, seconds);
			}
		}
	}

}
