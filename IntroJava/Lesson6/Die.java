import java.util.Random;

public class Die {

	/**
	 * The number of sides of this die.
	 */
	private int numSides;
	/**
	 * The value (upward face) of this die; a value between 1 and numSides.
	 */
	private int value;
	
	/**
	 * Creates a six-sided Die and rolls it to give it a value.
	 */
	public Die() {
		this(6);
	}
	
	/**
	 * Creates a Die with parameter sides and rolls it to give it a value.
	 * 
	 * @param numSides  The number of sides of this die.
	 */
	public Die(int numSides) {
		this.numSides = numSides;
		this.roll();
	}
	
	/**
	 * Returns the value of this die.
	 * 
	 * @return the value field
	 */
	public int getValue() {
		return this.value;
	}
	
	/**
	 * "Rolls" this die by generating a random number between 1 and this die's
	 *  numSides field.
	 */
	public final void roll() {
		Random random = new Random();
		this.value = random.nextInt(this.numSides)+ 1; 
	}
	
	/**
	 * Determines the equality of the parameter to this object by comparing 
	 * both fields.
	 * 
	 * @param obj   The object to compare to this Die.
	 * @return		True if the objects' two fields are the same.
	 */
	@Override
	public boolean equals(Object obj) {
		boolean isEqual = false;
		if (this == obj) {
			isEqual = true;
		}
		else if (obj != null && obj.getClass() == this.getClass()) {
			Die die = (Die) obj;
			isEqual = this.numSides == die.numSides && this.value == die.value;
		}
		return isEqual;
	}
	
	/**
	 * Creates and returns a String version of this Die, including the values
	 * of both fields.
	 * 
	 * @return  A String of the form "Number of sides: numSides\nValue: value"
	 */
	@Override
	public String toString() {
		return String.format("%-20s%d\n%-20s%d", "Number of sides:",
				this.numSides, "Value:", this.value);
	}

}
