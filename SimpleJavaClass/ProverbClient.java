
public class ProverbClient {
	
	public static void main(String[] args) {
		
		Proverb proverb;
		
		// Create a sample proverb.
		proverb = new Proverb("If you cannot control yourself, you cannot command others.", 
				"If you cannot control yourself", "Klingon");
		
		// Send the proverb some messages.
		System.out.println(proverb.getPrompt());
		System.out.println(proverb.getProverb());
	}

}
