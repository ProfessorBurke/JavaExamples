import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 * Manages a list of Proverb objects, allows for shuffling the list, 
 * and allows iteration over the list using the iterator pattern.
 * 
 * @author Maggie
 *
 */
public class ProverbManager {
	
	/**
	 * The proverbs read from the file passed to the constructor.
	 */
	private ArrayList<Proverb> proverbs;
	/**
	 * An index into the proverbs ArrayList used as part of the iterator pattern.
	 */
	private int currentProverb;
	
	
	private ArrayList<Proverb> readProverbs(String path) throws FileNotFoundException {
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
	/**
	 * Initialize the ProverbManager by reading all data from filePath and
	 * into Proverb objects; store in the arraylist proverbs. Set the index
	 * currentProverb to zero.
	 * 
	 * @param filePath the path to a file of proverbs organized as:
	 * full proverb\n
	 * proverb prompt\n
	 * origin (adjective)\n
	 */
	public ProverbManager(String filePath) throws FileNotFoundException  {
		this.proverbs = readProverbs(filePath);
		this.currentProverb = 0;
	}
	
	/**
	 * Shuffle (randomize) the proverbs and reset the currentProverb index.
	 */
	public void shuffle() {
		Collections.shuffle(this.proverbs);
		this.currentProverb = 0;
	}
	
	/**
	 * Used as part of the iterator pattern for accessing the proverbs
	 * sequentially -- next returns the next proverb in the arraylist.
	 * 
	 * @return the next Proverb in the arraylist.
	 */
	public Proverb next() {
		return this.proverbs.get(this.currentProverb++);
	}
	
	/**
	 * Used as part of the iterator pattern for accessing the proverbs
	 * sequentially -- hasNext returns true or false depending on where
	 * the index is in the arraylist.
	 * 
	 * @return true if the index is not past the last element in the
	 *         arraylist of proverbs; false if there are proverbs beyond
	 *         the index.
	 */
	public boolean hasNext() {
		return this.currentProverb < this.proverbs.size();
	}

}
