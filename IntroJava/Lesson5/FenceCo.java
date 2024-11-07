import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class FenceCo {
	
	static double cost;
	
	public static double getSideCost(double side, String choice) {
		switch (choice) {
		case "Premium":
			cost = side * 46;
			break;
		case "Budget":
			cost = side * 40;
			break;
		case "Chain":
			cost = side * 25;
			break;
		}
		return cost;
	}
	
	public static double calculateCost(double side1, double side2, double side3, 
			double side4, String choice1, String choice2, String choice3,
			String choice4) {
		double total = getSideCost(side1, choice1) + getSideCost(side2, choice2)
		+ getSideCost(side3, choice3) + getSideCost(side4, choice4);
		return total;
	}
	
	public static double calculateTax(double totalCost) {
		return cost * 1.05;
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		// Declare variables for the fence lengths and fence option
		// for each length.
		double side1, side2, side3, side4;
		String choice1, choice2, choice3, choice4;
		// Declare cost variables.
		double costSide1, costSide2, costSide3, costSide4;
		double totalCost, costWithTax;
		
		// Open the fencing file (if it exists).
		File fenceFile = new File("fenceContract.txt");
		if (fenceFile.exists()) {
			// Read lengths and options from the file.
			Scanner fenceReader = new Scanner(fenceFile);
			side1 = fenceReader.nextDouble();
			choice1 = fenceReader.next();
			side2 = fenceReader.nextDouble();
			choice2 = fenceReader.next();
			side3 = fenceReader.nextDouble();
			choice3 = fenceReader.next();
			side4 = fenceReader.nextDouble();
			choice4 = fenceReader.next();

			// Calculate and print the cost of the fence.
			totalCost = calculateCost(side1, side2, side3, side4,
					choice1, choice3, choice2, choice4);
			costWithTax = calculateTax(totalCost);
			System.out.println(costWithTax);
			
			// Close the Scanner.
			fenceReader.close();
		}	

	}

}
