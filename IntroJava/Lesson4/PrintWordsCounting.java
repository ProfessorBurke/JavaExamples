/**
 * Demonstrates a nested loop by iterating over a String of words, printing
 * the words one to a line.
 * 
 * @author Maggie
 *
 */
public class PrintWordsCounting {

	public static void main(String[] args) {
		// Define some text to iterate over.
		String text = "I have the audacity to believe that peoples everywhere" 
                      + " can have three meals a day for their bodies education" 
                      + " and culture for their minds and dignity equality and" 
                      + " freedom for their spirits ";
				
		
		// The outer loop is a for loop -- it will end when we've
		// reached the end of the string, which has a known length.
		for (int i = 0; i < text.length(); i++) {
			// Display a single word in the text.
			// The inner loop is a while loop.  It ends when we
			// reach a space.  This is a condition so we need
			// a conditional loop.
			while (text.charAt(i) != ' ') {
				System.out.print(text.charAt(i));
				i++;
			}
			System.out.println();
		}
	}

}
