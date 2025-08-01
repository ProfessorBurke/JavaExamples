import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class StatsSheetFileError {

	public static void main(String[] args) throws FileNotFoundException{
		
		// Character traits.
		int strength;
		int wisdom;
		String name;
		
		// Declares and creates the File and Scanner.
		Scanner fileIn;	
		File traitsFile = new File("traits.txt");
		if (traitsFile.exists()) {
			fileIn = new Scanner(traitsFile);
			
			// Obtains player stats from the file and closes the Scanner.
			strength = fileIn.nextInt();
			name = fileIn.nextLine();
			wisdom = fileIn.nextInt();
			fileIn.close();
			
			// Displays the traits the user entered.
			System.out.println("Strength: " + strength);
			System.out.println("Wisdom: " + wisdom);
			System.out.println("Name: " + name);
		}
	}

}