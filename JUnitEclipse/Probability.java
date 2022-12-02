public class Probability {
	
	/**
	 * Compute the factorial of n.
	 * Preconditions: n is a 
	 * non-negative integer
	 * Postcondition: returns the factorial of n
	 * 
	 * @param n, a non-negative integer
	 * @return n!; 1 if n=0; otherwise n * (n-1) * (n-2) * ...  * 2 * 1
	 */
	public static int recursiveFactorial(int n) {
		if (n < 0) throw new IllegalArgumentException("Cannot calculate the factorial of a negative number " + n);
		if (n == 0) return 1;
		else return n * recursiveFactorial(n-1);
	}

	/**
	 * Compute the factorial of n.
	 * Preconditions: n is a non-negative integer
	 * Postcondition: returns the factorial of n
	 * 
	 * @param n, a non-negative integer
	 * @return n!; 1 if n=0; otherwise n * (n-1) * (n-2) * ...  * 2 * 1
	 */
	public static int iterativeFactorial(int n) {
		if (n < 0) throw new IllegalArgumentException("Cannot calculate the factorial of a negative number " + n);
		int fac = 1;
		if (n > 0) {
			for (int i = n; i > 0; i--) {
				fac *= i;
			}
		}
		return fac;
	}
}


