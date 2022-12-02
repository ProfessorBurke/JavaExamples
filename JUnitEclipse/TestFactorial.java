import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestFactorial {

	@Test
	@DisplayName("Check that both methods calculate 0! correctly.")
	void testZeroFactorialReturnsOne() {
		assertEquals(1, Probability.recursiveFactorial(0),
				"recursiveFactorial fails to calculate the factorial of 0 correctly.");
		assertEquals(1, Probability.iterativeFactorial(0),
				"iterativeFactorial fails to calculate the factorial of 0 correctly.");
	}
	
	@Test
	@DisplayName("Check that both methods will throw an exception for negative input")
	void testNegativeThrowsException() {
		IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
			Probability.recursiveFactorial(-1); },
				"Recursive method fails to throw an illegal argument exception on negative input");
		assertEquals("Cannot calculate the factorial of a negative number -1",
				e.getMessage());
		
		 e = assertThrows(IllegalArgumentException.class, () -> {
			Probability.iterativeFactorial(-1); },
				"Iterative method fails to throw an illegal argument exception on negative input");
		assertEquals("Cannot calculate the factorial of a negative number -1",
				e.getMessage());
		}
	
	@Test
	@DisplayName("Check that cases at the low edge of factorial calculate correctly for both methods")
	void testLowEdgeFactorial() {
		assertEquals(1, Probability.recursiveFactorial(1),
				"recursiveFactorial fails to calculate the factorial of 1");
		assertEquals(2, Probability.recursiveFactorial(2),
				"recursiveFactorial fails to calculate the factorial of 2");
		
		assertEquals(1, Probability.iterativeFactorial(1),
				"iterativeFactorial fails to calculate the factorial of 1");
		assertEquals(2, Probability.iterativeFactorial(2),
				"iterativeFactorial fails to calculate the factorial of 2");
	}
	
	@Test
	@DisplayName("Check both methods calculate low middle values of factorial correctly.")
	void testLowMiddleFactorial() {
		assertEquals(120, Probability.recursiveFactorial(5),
				"recursiveFactorial fails to calculate the factorial of 5");
		assertEquals(3628800, Probability.recursiveFactorial(10),
				"recursiveFactorial fails to calculate the factorial of 10");
		
		assertEquals(120, Probability.iterativeFactorial(5),
				"iterativeFactorial fails to calculate the factorial of 5");
		assertEquals(3628800, Probability.iterativeFactorial(10),
				"iterativeFactorial fails to calculate the factorial of 10");
	}
	}


