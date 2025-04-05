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
	
	public Die(Die toCopy) {
		this.numSides = toCopy.numSides;
		this.value = toCopy.value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public final void roll() {
		Random random = new Random();
		this.value = random.nextInt(this.numSides)+ 1; 
	}

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
	
	@Override
	public String toString() {
		return String.format("%-20s%d\n%-20s%d", "Number of sides:",
				this.numSides, "Value:", this.value);
	}

}
