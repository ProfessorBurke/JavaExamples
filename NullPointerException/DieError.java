import java.util.Random;

public class DieError {

	private int numSides;
	private int value;
	private Random roller;
	
	public DieError() {
		this(6);
	}
	
	public DieError(int numSides) {
		this.roller = new Random();
		this.numSides = numSides;
		this.roll();
	}
	
	public int getValue() {
		return this.value;
	}
	
	public final void roll() {
		this.value = this.roller.nextInt(this.numSides)+ 1; 
	}
	
}
