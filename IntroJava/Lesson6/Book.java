/**
 * An e-reader version of a Book that is initialized from the text of a book
 * and contains a bookmark that keeps track of how many pages have been
 * read.
 * 
 * @author Maggie
 *
 */public class Book {
	
	/**
	 * The content of the book as plain text. 
	 */
	private String text;
	/**
	 * The user's current location in the book.
	 */
	private int bookmark;
	
	/**
	 * Construct the book from the text parameter, starting bookmark at zero.
	 * 
	 * @param text	The plain text of the book.
	 */
	public Book(String text) {
		this.text = text;
		this.bookmark = 0;
	}
	
	/**
	 * Return the next page (100 characters) of the book and advance the
	 * bookmark field to the next page.
	 * 
	 * @return	The 100 characters from bookmark to bookmark+100, or
	 * 			the last length-bookmark characters.
	 */
	public String nextPage() {
		// Do not allow the end index to extend beyond the end of the text.
		int endIndex = this.text.length() < this.bookmark + 100 ? 
				this.text.length() - 1 : this.bookmark + 100;
		// Create a "page" of 100 characters.
		String page = this.text.substring(this.bookmark, endIndex);
		// Move the bookmark along.
		this.bookmark += 100;
		if (this.bookmark >= this.text.length()) {
			this.bookmark = this.text.length() - 1;
		}
		return page; 
	}

}
