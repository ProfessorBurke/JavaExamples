
public class SimpleProverbClient {

	public static void main(String[] args) {

		Proverb klingonProverb, elvenProverb;

		// Creates two sample proverbs.
		klingonProverb = new Proverb("If you cannot control yourself, you cannot command others", 
				"If you cannot control yourself", "Klingon");
		elvenProverb = new Proverb("Let him not vow to walk in the dark, who has not seen the nightfall.",
				"Let him not vow to walk in the dark", "Elven");

		// Sends the proverbs some messages.
		System.out.println(klingonProverb.getPrompt());
		System.out.println(klingonProverb.getProverb());
		System.out.println(elvenProverb.getPrompt());
		System.out.println(elvenProverb.getProverb());

	}

}
