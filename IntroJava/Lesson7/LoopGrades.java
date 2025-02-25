import java.util.Scanner;

public class LoopGrades {
	
	public static void main(String[] args) {
		// Declares variables.
		double[] grades;
		Scanner stdin;
		String passOrFail;
		int i;
		
		// Creates the Scanner and the array for reading and storage.
		stdin = new Scanner(System.in);
		grades = new double[5];
		
		// Reads in a grade for each location in the array.
		for (i = 0; i < grades.length; i++ ) {
			System.out.print("Please enter a grade: ");
			grades[i] = stdin.nextDouble();
		}
		stdin.close();
		
		// Reports whether each grade is passing (60 or over) or failing.
		for (i = 0; i < grades.length; i++) {
			passOrFail = (grades[i] >= 60)  ? "passing" : "failing";
			System.out.printf("%.2f is %s.\n", grades[i], passOrFail);
		}
	}

}
