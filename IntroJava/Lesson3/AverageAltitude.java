import java.util.Scanner;

public class AverageAltitude {
    public static void main(String[] args) {
    	
    	// Declare variables.
    	// Scanner for input from the console.
        Scanner stdin;
        // The three altitudes obtained from the user and the average.
        double altitude1, altitude2, altitude3, average;
        // Boolean flag, assume all values will be valid to start.
        boolean hasNonPositiveValue = false;
        
        // Create the Scanner to obtain input from the console.
        stdin = new Scanner(System.in);

        // Obtain and validate the first altitude.
        System.out.print("What is the altitude of the first mountain? ");
        altitude1 = stdin.nextDouble();
        if (altitude1 <= 0) {
            hasNonPositiveValue = true;
        }

        // Obtain and validate the second altitude.
        System.out.print("What is the altitude of the second mountain? ");
        altitude2 = stdin.nextDouble();
        if (altitude2 <= 0) {
            hasNonPositiveValue = true;
        }

        // Obtain and validate the third altitude.
        System.out.print("What is the altitude of the third mountain? ");
        altitude3 = stdin.nextDouble();
        if (altitude3 <= 0) {
            hasNonPositiveValue = true;
        }

        // Check the flag and either average the altitudes or print an error message
        if (!hasNonPositiveValue) {
            average = (altitude1 + altitude2 + altitude3) / 3;
            System.out.printf("The average of the altitudes is %.1f.\n", average);
        } else {
            System.out.println("Error: One or more altitudes are zero or negative.");
        }

        stdin.close();
}
}

