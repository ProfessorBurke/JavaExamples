import java.util.Scanner;

public class SimpleGrades {
	
	public static void main(String[] args) {
		// Declares variables.
		double[] grades;
		Scanner stdin;
		String passOrFail;
		
		// Creates the Scanner and the array for reading and storage.
		stdin = new Scanner(System.in);
		grades = new double[5];
		
		// Reads in five grades.
		System.out.print("Please enter a grade: ");
		grades[0] = stdin.nextDouble();
		System.out.print("Please enter a grade: ");
		grades[1] = stdin.nextDouble();
		System.out.print("Please enter a grade: ");
		grades[2] = stdin.nextDouble();
		System.out.print("Please enter a grade: ");
		grades[3] = stdin.nextDouble();
		System.out.print("Please enter a grade: ");
		grades[4] = stdin.nextDouble();
		stdin.close();
		
		// Reports whether each grade is passing (60 or over) or failing.
		passOrFail = (grades[0] >= 60)  ? "passing" : "failing";
		System.out.printf("%.2f is %s.\n", grades[0], passOrFail);
		passOrFail = (grades[1] >= 60)  ? "passing" : "failing";
		System.out.printf("%.2f is %s.\n", grades[1], passOrFail);
		passOrFail = (grades[2] >= 60)  ? "passing" : "failing";
		System.out.printf("%.2f is %s.\n", grades[2], passOrFail);
		passOrFail = (grades[3] >= 60)  ? "passing" : "failing";
		System.out.printf("%.2f is %s.\n", grades[3], passOrFail);
		passOrFail = (grades[4] >= 60)  ? "passing" : "failing";
		System.out.printf("%.2f is %s.\n", grades[4], passOrFail);
	}

}
