
public class LibraryItem implements Verifiable{
	
	private int id;
	
	public LibraryItem(int id) {
		this.id = id;
	}
	
	public boolean isBorrowable() {
		return false;
	}
	
	@Override
	public boolean verify(int id) {
		return this.id == id;
	}
}
