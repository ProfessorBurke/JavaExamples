import java.util.Random;

public class Die {

	private int numSides;
	private int value;
	
	public Die() {
		this(6);
	}
	
	public Die(int numSides) {
		this.numSides = numSides;
		this.roll();
	}
	
	public int getValue() {
		return this.value;
	}
	
	public final void roll() {
		Random random = new Random();
		this.value = random.nextInt(this.numSides)+ 1; 
	}
	
}
