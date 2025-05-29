
public class RecursionExamples {
	
	public static int addNumbers(int current, int stop) {
		if (current == stop) {
			return current;
		} else {
			return current + addNumbers(++current, stop);
		}
	}
	
	public static void printNumbers(int current, int stop) {
		// base case
		if (current == stop) {
			System.out.println(current);
		// recursive case
		} else {
			System.out.println(current);
			printNumbers(++current, stop);
		}
	}

	public static void main(String[] args) {
		//printNumbers(1, 5);
		System.out.println(addNumbers(1, 5));
		//System.out.println(addNumbersTail(1, 5, 0));

	}
	
	public static int addNumbersTail(int current, int stop, int total) {
		if (current == stop) {
			return total + current;
		} else {
			return addNumbersTail(current + 1, stop, total + current);
		}
	}

}
