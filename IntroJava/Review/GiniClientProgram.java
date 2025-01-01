
/**
 * Creates three GiniCountry objects from hard-coded values and prints them.
 * 
 * @author Maggie
 *
 */
public class GiniClientProgram {

	public static void main(String[] args) {
		
		// Three GiniCountry objects to represent the United States, Ukraine,
		// and the United Kingdom.
		GiniCountry unitedStates, ukraine, unitedKingdom;
		
		// Create the three GiniCountry countries from hard-coded values.
		unitedStates = new GiniCountry("United States", 0.5675382, 0.61952907);
		ukraine = new GiniCountry("Ukraine", 0.40017763, 0.465395885);
		unitedKingdom = new GiniCountry("United Kingdom", 0.46727425, 0.462701675);
		
		// Print the three GiniCountry countries.
		System.out.println(unitedStates);
		System.out.println(ukraine);
		System.out.println(unitedKingdom);
	}

}
