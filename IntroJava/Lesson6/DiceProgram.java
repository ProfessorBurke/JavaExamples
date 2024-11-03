
public class DiceProgram {

	public static void main(String[] args) {
		
		Die d61, d62, d12, d20;

		d61 = new Die();
		d62 = new Die(6);
		d12 = new Die(12);
		d20 = new Die(20);
		
		System.out.println(d61.getValue());
		d61.roll();
		System.out.println(d61.getValue());
		
		System.out.println(d62.getValue());
		d62.roll();
		System.out.println(d62.getValue());
		
		System.out.println(d12.getValue());
		d12.roll();
		System.out.println(d12.getValue());
		
		System.out.println(d20.getValue());
		d20.roll();
		System.out.println(d20.getValue());
	}

}
