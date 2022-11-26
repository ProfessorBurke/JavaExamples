
public class ProverbClient {

	public static void main(String[] args) {
		
		Proverb proverb;

		// Creates a sample proverb.
		proverb = new Proverb("If you cannot control yourself, you cannot command others", 
				"If you cannot control yourself", "Klingon");
		
		// Sends the proverb some messages.
		System.out.println(proverb.getPrompt());
		System.out.println(proverb.getProverb());
				
		
	}

}
