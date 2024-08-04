
/**
 * Demonstration of stepper, accumulator / gatherer, most-wanted holder,
 * and sentinel looping patterns by looping over Strings.
 * @author Maggie
 *
 */
public class LoopPatterns {

	public static void main(String[] args) {
		
		
		String dnaSample = "GAATGTCCTTTQ";
		int i = 0;
		char nucleotide = dnaSample.charAt(i);
		
		while (nucleotide != 'Q') {
			System.out.println(nucleotide);
			nucleotide = dnaSample.charAt(++i);
		}
		
		
//		String softwareGreat = "Margaret Hamilton";	// MIT Apollo programmer
//		int i; 										// index into the string
//		int aCount = 0;
//		char bigLetter = softwareGreat.charAt(0);
//		
//		i = 0;
//		while (i < softwareGreat.length()) {
//			System.out.println(softwareGreat.charAt(i));
//			if (softwareGreat.charAt(i) == 'a') {
//				aCount++;
//			}
//			if (softwareGreat.charAt(i) > bigLetter) {
//				bigLetter = softwareGreat.charAt(i);
//			}
//			i++;
//		}
//		System.out.println(aCount);
//		System.out.println(bigLetter);
	}

}
