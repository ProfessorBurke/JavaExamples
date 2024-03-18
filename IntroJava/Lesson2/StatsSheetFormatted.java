

/**
 * Demonstrate printf and String.format.
 * 
 * @author Maggie
 *
 */
public class StatsSheetFormatted {

	public static void main(String[] args) {
		
		// Sets some character traits.
		int strength = 17;
		int wisdom = 15;
		int charisma = 12;
		int strengthBonus = 2;
		int wisdomBonus = 0;
		int charismaBonus = 1;
		String name = "Artoo the Barbarian";
		double wealth = 132.5;
		char currencySymbol = '$'; 
		String formattedWealth;
		
		formattedWealth = String.format("%-10s%c%.2f\n", 
				"Wealth",currencySymbol, wealth);

		// Displays the traits.
		System.out.printf("%-10s%s\n","Name: ", name);
		System.out.printf("%-10s%c%.2f\n", "Wealth",currencySymbol, wealth);
		//System.out.println(formattedWealth);
		System.out.printf("\n%-10s%-10s%s\n", "Attribute","Value","Bonus");
		System.out.printf("%-10s%-10d%+d\n","Strength" , strength, strengthBonus);
		System.out.printf("%-10s%-10d%+d\n","Wisdom" , wisdom, wisdomBonus);
		System.out.printf("%-10s%-10d%+d\n","Charisma" , charisma, charismaBonus);
		
		//System.out.printf("You have %.2f currency, which uses the symbol %c.\n",
		//		wealth, currencySymbol);
		
	}

}
