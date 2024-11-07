
public class TestSideCost {
	
	public static double getSideCost(double side, String choice) {
		double cost;
		choice = choice.toUpperCase();
		switch (choice) {
		case "PREMIUM":
			cost = side * 46;
			break;
		case "BUDGET":
			cost = side * 40;
			break;
		case "CHAIN":
			cost = side * 25;
			break;
		default:
			cost = -1;
			break;
		}
		return cost;
	}

	
	public static boolean doublesAreEqual(double d1, double d2, double tolerance) {
	    return Math.abs(d1 - d2) <= tolerance;
	}
	
	public static void testMethod(double side, String choice, 
			double expectedCost, String testName) {
		double actualCost = getSideCost(side, choice);
		System.out.println("---------------------------------------------");
		System.out.println(testName);
		System.out.printf("%-20s%.2f\n", "Expected result:", expectedCost);
		System.out.printf("%-20s%.2f\n", "Actual result:", actualCost);
		System.out.println(doublesAreEqual(expectedCost, actualCost, .00001) 
				? "Pass\n" : "Fail\n");
	}

	public static void main(String[] args) {
		testMethod(100.0, "Premium", 4600.0,"Test typical Premium");
		testMethod(100.0, "Budget", 4000.0,"Test typical Budget");
		testMethod(100.0, "Chain", 2500.0,"Test typical Chain");
		testMethod(100.0, "bead curtain", -1.0,"Test bad fence type");
		testMethod(0.0, "Premium", 0.0,"Test edge case 0 Premium");
		testMethod(0.0, "Budget", 0.0,"Test edge case 0 Budget");
		testMethod(0.0, "Chain", 0.0,"Test edge case 0 Chain");
		testMethod(1.0, "Premium", 46.0,"Test edge case 1 Premium");
		testMethod(1.0, "Budget", 40.0,"Test edge case 1 Budget");
		testMethod(1.0, "Chain", 25.0,"Test edge case 1 Chain");
		testMethod(10000.0, "Premium", 460000.0,"Test max edge case Premium");
		testMethod(10000.0, "Budget", 400000.0,"Test max edge case Budget");
		testMethod(10000.0, "Chain", 250000.0,"Test max edge case Chain");
		testMethod(100.0, "premium", 4600.0,"Test letter case Premium");
		testMethod(100.0, "budget", 4000.0,"Test letter case Budget");
		testMethod(100.0, "chain", 2500.0,"Test letter case Chain");
		testMethod(0.0, "Premium", 0.0, "Test zero side");
		testMethod(-1, "Premium", -46.0, "Test negative side");
	}

}
