import java.util.Random;

/*
	Create the Die class according to the class diagram.
	-------------------------
	Die
	-------------------------
	- numSides: int
	- face: int
	-------------------------
	+ Die()
	+ Die(numSides: int)
	+ getFaceValue() : int
	+ roll()
	-------------------------

*/
public class Die {

	private static int count = 0;
	private int numSides;
	private int face;
	
	public Die() {
		this(6);
	}
	
	public Die(int numSides) {
		Die.count += 1;
		this.numSides = numSides;
		this.roll();
	}
	
	public static int getCount() {
		return Die.count;
	}
	
	public int getFaceValue() {
		return this.face;
	}
	
	public final void roll() {
		Random random = new Random();
		this.face = random.nextInt(this.numSides)+ 1; 
	}
}
