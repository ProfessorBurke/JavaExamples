/**
 * Demonstrates a nested loop by iterating over a String of words, printing
 * the words one to a line.
 * 
 * @author Maggie
 *
 */
public class PrintWords {

	public static void main(String[] args) {
		// Define some text to iterate over.
		String text = "I have the audacity to believe that peoples everywhere" 
                      + " can have three meals a day for their bodies education" 
                      + " and culture for their minds and dignity equality and" 
                      + " freedom for their spirits ";
		
		// Define an index into the string.
		int i = 0;
		
		// Display each word in the text.
		while (i < text.length()) {
			// Display a single word in the text.
			while (text.charAt(i) != ' ') {
				System.out.print(text.charAt(i));
				i++;
			}
			System.out.println();
			i++;
		}
	}

}
