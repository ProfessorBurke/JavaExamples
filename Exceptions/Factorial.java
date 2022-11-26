import java.util.Scanner;

public class Factorial {

	public static int factorial(int n) {
		
		  if (n < 0)                  // Precondition failure
		   throw new IllegalArgumentException("Factorial:"+ n);
		  if (n == 0)
		    return 1;
		  else {
		    int f = 1;           // Init a temporary variable
		    for (int k = n; k >= 1; k--)   // For n down to 1
		      f = f * k;        //     Accumulate the product
		    return f;                 // Return the factorial
		  }} // factorial()

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a non-negative integer and I'll calculate the factorial: ");
		int number = keyboard.nextInt();
		if (number >= 0) {
			System.out.printf("%d! is %d.\n", number, factorial(number));
		} else {
			System.out.println("Error -- a negative factorial is not defined.");
		}
		keyboard.close();
	}

}
