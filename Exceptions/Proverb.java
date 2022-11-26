/**
 * A proverb that can be used as a prompt in a game.
 * 
 * Allows access to a proverb for use in a game that allows people to complete a proverb and guess the correct proverb.
 * <p>
 * Provides a prompt of the form, There is an old &lt;origin&gt; proverb: “&lt;start of proverb&gt;” + “…”
 * <p>
 * Provides the proverb of the form There is an old &lt;origin&gt; proverb:   &lt;start of proverb&gt; &lt;end of proverb&gt;

 * @author Maggie
 *
 */
public class Proverb {

	/**
	 * The complete proverb, both prompt and correct conclusion.
	 */
	private String fullText;
	/**
	 * The beginning of the proverb, suitable for a prompt in a game.
	 */
	private String promptText;
	/**
	 * An adjective describing the culture from which the proverb originates, for example Chinese, not China.
	 */
	private String origin;

	/**
	 * Initialize all fields from parameters.
	 * 
	 * @param fullText Initial value for {@link #fullText}
	 * @param promptText Initial value for {@link promptText}
	 * @param origin Initial value for {@link origin}
	 */
	public Proverb(String fullText, String promptText, String origin) {
		this.fullText = fullText;
		this.promptText = promptText;
		this.origin = origin;
	}

	/**
	 * Returns a prompt for this proverb suitable for use in a game.
	 * 
	 * @return a prompt of the form "There is an old (origin) proverb: " + start of proverb + "..."
	 */
	public String getPrompt() {
		return "There is an old " + this.origin + " proverb: " + this.promptText + "...";
	}

	/**
	 * Returns the origin and full text of this proverb.
	 * 
	 * @return the text of this proverb of the form "There is an old (origin) proverb: " + proverb.
	 */
	public String getProverb() {
		return "There is an old " + this.origin + " proverb: " + this.fullText;
	}
}
