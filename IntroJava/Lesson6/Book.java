/**
 * An e-reader version of a Book that is initialized from the text of a book
 * and contains a bookmark that keeps track of how many pages have been
 * read.
 * 
 * @author Maggie
 *
 */
public class Book {
	
	private String text;
	private int bookmark;
	
	public Book(String text) {
		this.text = text;
		this.bookmark = 0;
	}
	
	public String nextPage() {
		// Do not allow the end index to extend beyond the end of the text.
		int endIndex = this.text.length() < bookmark + 100 ? 
				this.text.length() - 1 : bookmark + 100;
		// Create a "page" of 100 characters.
		String page = this.text.substring(bookmark, endIndex);
		// Move the bookmark along.
		bookmark += 100;
		if (bookmark >= this.text.length()) {
			bookmark = this.text.length() - 1;
		}
		return page; 
	}

}
