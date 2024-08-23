/**
 * Illustration of how to avoid breaks in a loop.
 * 
 * @author Maggie
 *
 */
public class PrintWordsPunctuation {

	public static void main(String[] args) {
		// Define some text to iterate over.
		String text = "I have the audacity to believe that peoples everywhere" 
                      + " can have three meals a day for their bodies, education" 
                      + " and culture for their minds, and dignity, equality, and" 
                      + " freedom for their spirits.";
		
		// Define an index into the string.
		int i = 0;
		
		// Display each word in the text.
		while (i < text.length()) {
			// Display a single word in the text.
			while (i < text.length() && text.charAt(i) != ' ') {
				if (text.charAt(i) != ',' && text.charAt(i) != '.') {
					System.out.print(text.charAt(i));
				}
				i++;
			}
			System.out.println();
			i++;
		}
	}

}