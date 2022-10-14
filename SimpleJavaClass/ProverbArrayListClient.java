
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;


public class ProverbArrayListClient {
	
	public static ArrayList<Proverb> readProverbs(String path) throws FileNotFoundException {
		ArrayList<Proverb> proverbs = new ArrayList<Proverb>();
		File file = new File(path);
		Scanner inputFile;
		String proverb, prompt, origin;
		
		if (file.exists()) {
			inputFile = new Scanner(file);
			while (inputFile.hasNext() ) {
				proverb = inputFile.nextLine();
				prompt = inputFile.nextLine();
				origin = inputFile.nextLine();
				proverbs.add(new Proverb(proverb, prompt, origin));
			}
			
		}
		return proverbs;
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<Proverb> proverbs;
		
		proverbs = readProverbs("proverbs.txt");
		
		for(int i = 0; i < proverbs.size(); i++) {
			System.out.println(proverbs.get(i).getProverb());
		}

	}

}
