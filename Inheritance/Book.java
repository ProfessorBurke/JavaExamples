import java.time.LocalDate;

public class Book extends Borrowable {
	
	public Book(int id) {
		super(id);
	}

	@Override
	public double getFee() {
		return 0;
	}

	@Override
	public LocalDate checkOut() {
		super.checkOut();
		return LocalDate.now().plusWeeks(2);
	}

}
