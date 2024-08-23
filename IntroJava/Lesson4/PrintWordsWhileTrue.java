/**
 * Illustration of how to rewrite a while true loop.
 * 
 * @author Maggie
 *
 */
public class PrintWordsWhileTrue {

	public static void main(String[] args) {
		// Define some text to iterate over.
		String text = "I have the audacity to believe that peoples everywhere" 
                + " can have three meals a day for their bodies, education" 
                + " and culture for their minds, and dignity, equality, and" 
                + " freedom for their spirits.";
		
		// Define an index into the string.
		int i = 0;
		
		// Display each word in the text.
		while (text.length() >= i && text.charAt(i) != '.') {
			System.out.print(text.charAt(i));
			i++;
			if (i < text.length() && text.charAt(i) == ',') {
				i++;
			}
			if (i < text.length() && text.charAt(i) == ' ') {
				System.out.println();
				i++;
			}
		}
		
	}

}
