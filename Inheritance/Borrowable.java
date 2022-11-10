import java.time.LocalDate;

public abstract class Borrowable extends LibraryItem {
	
	boolean checkedIn;
	
	public Borrowable(int id) {
		super(id);
		this.checkedIn = true;
	}
	
	@Override
	public boolean isBorrowable() {
		return true;
	}
	
	public boolean isCheckedIn() {
		return this.checkedIn;
	}
	
	public LocalDate checkOut() {
		this.checkedIn = false;
		return LocalDate.now();
	}
	
	public abstract double getFee();

}
