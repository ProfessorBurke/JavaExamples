
public class Patron implements Verifiable {
	
	private int id;
	
	public Patron(int id) {
		this.id = id;
	}

	@Override
	public boolean verify(int id) {
		return this.id == id;
	}

}
