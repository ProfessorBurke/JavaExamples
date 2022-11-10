import java.time.LocalDate;

public class DVD extends Borrowable {
	
	public DVD(int id) {
		super(id);
	}

	@Override
	public double getFee() {
		return .5;
	}
	
	@Override
	public LocalDate checkOut() {
		super.checkOut();
		return LocalDate.now().plusWeeks(1);
	}

}
