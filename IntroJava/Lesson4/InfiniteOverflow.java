/**
 * Demonstrates how an integer overflow can result in an infinite loop.
 * @author Maggie
 *
 */
public class InfiniteOverflow {

	public static void main(String[] args) {

		// Loop infinitely
		for (int i = 0; i < Integer.MAX_VALUE; i += Integer.MAX_VALUE / 4) {
			System.out.println(i);
		}
		
		
		
	}

}
