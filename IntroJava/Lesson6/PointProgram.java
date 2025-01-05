
public class PointProgram {

	public static void main(String[] args) {
		
		// Declares three point objects.
		Point point1, point2, point3;
		
		// Initializes the three objects with three
		// different constructors.
		point1 = new Point();
		point2 = new Point(100, 100);
		point3 = new Point(point2);
		
		// Changes point3, with no side effects.
		point3.setX(200);
		
		// Prints the three objects.
		System.out.println(point1);
		System.out.println(point2);
		System.out.println(point3);

	}

}
