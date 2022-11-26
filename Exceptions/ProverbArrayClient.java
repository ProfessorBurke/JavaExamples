
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class ProverbArrayClient {
	
	public static Proverb[] readProverbs(String path) throws FileNotFoundException {
		Proverb[] proverbs = new Proverb[5];
		File file = new File(path);
		Scanner inputFile;
		String proverb, prompt, origin;
		int index = 0;
		
		if (file.exists() && index < 5) {
			inputFile = new Scanner(file);
			while (inputFile.hasNext() ) {
				proverb = inputFile.nextLine();
				prompt = inputFile.nextLine();
				origin = inputFile.nextLine();
				proverbs[index++] = new Proverb(proverb, prompt, origin);
			}
			
		}
		return proverbs;
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		Proverb[] proverbs;
		
		proverbs = readProverbs("proverbs.txt");
		
		for(int i = 0; i < proverbs.length; i++) {
			System.out.println(proverbs[i].getProverb());
		}

	}

}

// CodeCheck

/*
This is the array version of the proverb client.
Fill in the missing code as described over the boxes.
*/
/*
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class ProverbArrayClient {
	
 public static Proverb[] readProverbs(String path) throws FileNotFoundException {
     // Declare and instantiate an array of five Proverb objects
     // called proverbs
     //HIDE
	Proverb[] proverbs = new Proverb[5];
     //EDIT
	File file = new File(path);
	Scanner inputFile;
	String proverb, prompt, origin;
	int index = 0;
		
	if (file.exists() && index < 5) {
	    inputFile = new Scanner(file);
	    while (inputFile.hasNext() ) {
		proverb = inputFile.nextLine();
		prompt = inputFile.nextLine();
		origin = inputFile.nextLine();
             // Create a Proverb object using the three lines just
             // read from the file and put it in the next location
             // in the array proverbs.  Increment index.
             //HIDE
		proverbs[index++] = new Proverb(proverb, prompt, origin);
             //EDIT
	    }
			
	}
	return proverbs;
 }

 public static void main(String[] args) throws FileNotFoundException {
		
     Proverb[] proverbs;
		
     proverbs = readProverbs("proverbs.txt");
	
     // Iterate over the array proverbs.  Send each proverb
     // the getProverb message and print the return value.
     //HIDE
	for(int i = 0; i < proverbs.length; i++) {
	    System.out.println(proverbs[i].getProverb());
	}
     //EDIT

 }

}
*/