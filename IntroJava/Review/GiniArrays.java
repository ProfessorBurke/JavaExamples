
/**
 * Creates two arrays of Gini values -- one demonstrating the shortcut of
 * initializing the array at creation, and one using new and then assigning
 * into each location in the array.
 * 
 * @author Maggie
 *
 */
public class GiniArrays {

	public static void main(String[] args) {
		
		// Declares an array to hold US Gini values.
		double[] usGinis;
		// Declares and instantiates an array of five Ukraine Gini values.
		double[] ukraineGinis = {.417511, .434951, .43270406, 
				.42638037, .5044114};
		
		// Creates an array to hold five Gini values for the US.
		usGinis = new double[5];
		
		// Fills the US Gini array.
		usGinis[0] = .583644;
		usGinis[1] = .580532;
		usGinis[2] = .619529;
		usGinis[3] = .625614;
		usGinis[4] = .626775;

		// Uses a for loop to print the values in the US Gini array.
		for (int i = 0; i < usGinis.length; i++) {
			System.out.println(usGinis[i]);
		}
		
		// Uses an enhanced for loop to print the values in the Ukraine Gini
		// array.
		for (double ukraineGini: ukraineGinis) {
			System.out.println(ukraineGini);
		}
	}

}
