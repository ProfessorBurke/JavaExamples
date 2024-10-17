import java.util.Random;

public class ScopeExample {
	
	public static final int MAX = 50;
	
	public static int add(int addend1, int addend2) {
		int sum;
		sum = addend1 + addend2;
		return sum;
	}
	
	public static int absoluteDifference (int minuend, int subtrahend) {
		int difference;
		difference = Math.abs(minuend - subtrahend);
		return difference;
	}

	public static void main(String[] args) {
		final int MAX = 2;
		int operand1, operand2, result;
		
		for (int i = 0; i < 3; i++) {
			// Gives the operands some random values.
			Random rand = new Random();
			operand1 = rand.nextInt(1, MAX);
			operand2 = rand.nextInt(1, MAX);
			
			// Adds them and displays the result.
			result = add(operand1, operand2);
			System.out.printf("The sum of %d and %d is %d.\n", operand1, operand2, result);
			
			// Calculates the difference and displays the result.
			result = absoluteDifference(operand1, operand2);
			System.out.printf("The difference between %d and %d is %d.\n", operand1, operand2, result);
		}
	}

}
