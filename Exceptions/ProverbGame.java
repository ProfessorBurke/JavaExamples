import java.io.FileNotFoundException;
import java.util.Scanner;


public class ProverbGame {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Proverb proverb;
		String prompt, realProverb, userProverb;
		ProverbManager proverbManager;
	
		try {
			proverbManager = new ProverbManager("nonexistent.txt");
			}
		catch (FileNotFoundException e) {
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			proverbManager = new ProverbManager();
		}
		//ProverbManager proverbManager = new ProverbManager("proverbs.txt");
		//ProverbManagerIterator proverbManager = new ProverbManagerIterator("proverbs.txt");
		proverbManager.shuffle();
		
		Scanner kb = new Scanner(System.in);
		
		while (proverbManager.hasNext()) {
			proverb = proverbManager.next();
			prompt = proverb.getPrompt();
			realProverb = proverb.getProverb();
			
			System.out.println(prompt);
			System.out.print("How would you complete that proverb? ");
			userProverb = prompt + kb.nextLine();
			
			System.out.println(realProverb);
			System.out.println(userProverb + "\n");
		}
		
		kb.close();



	}

}
