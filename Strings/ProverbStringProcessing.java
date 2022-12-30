
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;


public class ProverbStringProcessing {
	
	public static ArrayList<Proverb> readProverbs(String path) throws FileNotFoundException {
		ArrayList<Proverb> proverbs = new ArrayList<Proverb>();
		File file;
		Scanner inputFile;
		String proverbLine;
		String[] proverbPieces;
		
		try {
			file  = new File(path);
			inputFile = new Scanner(file);
			while (inputFile.hasNext() ) {
				proverbLine = inputFile.nextLine();
				proverbPieces = proverbLine.split("/");
				proverbs.add(new Proverb(proverbPieces[0], proverbPieces[1], proverbPieces[2]));
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("The file cannot be found.");
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The file is not configured correctly.");
		}
		return proverbs;
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<Proverb> proverbs;
		
		proverbs = readProverbs("proverbsOneLine.txt");
		
		for(int i = 0; i < proverbs.size(); i++) {
			System.out.println(proverbs.get(i).getProverb());
		}

	}

}


