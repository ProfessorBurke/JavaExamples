import java.util.ArrayList;

public class Library {
	
	static ArrayList<Patron> patrons = new ArrayList<Patron>();
	static ArrayList<LibraryItem> items = new ArrayList<LibraryItem>();
	
	public static Patron verifyPatron(int patronId) {
		Patron foundPatron = null;
		for (Patron patron: patrons) {
			if (patron.verify(patronId)) {
				foundPatron = patron;
			}
		}
		return foundPatron;
	}
	
	public static LibraryItem verifyItem(int itemId) {
		LibraryItem foundItem = null;
		for (LibraryItem item: items) {
			if (item.verify(itemId)) {
				foundItem = item;
			}
		}
		return foundItem;
	}
	
	public static void borrow(int patronId, int itemId) {
		Patron patron = verifyPatron(patronId);
		LibraryItem item = verifyItem(itemId);
		if (patron != null && item != null) {
			if (item.isBorrowable()) {
				System.out.println("The item " + itemId + " is borrowable.");
				if (((Borrowable)item).isCheckedIn()) {
					System.out.println("The item " + itemId + " is checked in.");
					System.out.println("The item's fee is " + ((Borrowable)item).getFee());
					System.out.println("The item is due "+ ((Borrowable)item).checkOut());
				}
				else {
					System.out.println("The item " + itemId + " is not checked in.");
				}
			}
		else {
			System.out.println("The item " + itemId + " is not borrowable.");
		}
		}
	}

	public static void main(String[] args) {

		
		Patron patron1 = new Patron(1);
		Patron patron2 = new Patron(2);
		patrons.add(patron1);
		patrons.add(patron2);
		
		Book book = new Book(1);
		DVD dvd = new DVD(3);
		LibraryItem item = new LibraryItem(2);
		items.add(book);
		items.add(dvd);
		items.add(item);
		
		borrow(1, 1);
		borrow(2, 1);
		borrow(2, 2);
		borrow(1, 3);

	}

}
