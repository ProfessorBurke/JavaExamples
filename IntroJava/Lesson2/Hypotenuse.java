import java.util.Scanner;

public class Hypotenuse {

	public static void main(String[] args) {
		
		double a, b, c;
		Scanner stdin;
		
		// Creates a Scanner and prompts for a and b; reads them in.
		stdin = new Scanner(System.in);
		
		System.out.print("What is a? ");
		a = stdin.nextDouble();
		System.out.print("What is b? ");
		b = stdin.nextDouble();
		
		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		System.out.println(c);
	}

}
