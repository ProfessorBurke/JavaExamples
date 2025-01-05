/**
 * Represents a two-dimensional point in the Cartesian coordinate system.
 * 
 * @author Maggie
 *
 */
public class Point { 

	/**
	 * The x coordinate of this point.
	 */
	double x;
	/**
	 * The y coordinate of this point.
	 */
	double y; 
	
	public Point() {
		this(0, 0);
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(Point toCopy) {
		this.x = toCopy.x;
		this.y = toCopy.y;
	}
	

	/**
	 * Sets the x coordinate of this point to the parameter.
	 * 
	 * @param x				The new x coordinate for this point.
	 */
	public void setX(double x) { 
		this.x = x; 
	} 

	/**
	 * Sets the y coordinate of this point to the parameter.
	 * 
	 * @param y				The new y coordinate for this point.
	 */
	public void setY(double y) { 
		this.y = y; 
	} 

	/**
	 * Returns the distance to the parameter point calculated with the
	 * distance formula.
	 * 
	 * @param otherPoint	The point to calculate the distance to.
	 * @return				The distance between this point and the parameter.
	 */
	public double distanceTo(Point otherPoint) { 
		return (Math.sqrt(Math.pow(this.x-otherPoint.x, 2) 
				+ Math.pow(this.y - otherPoint.y, 2))); 
	} 

	/**
	 * Creates and returns a string version of this point as (x, y).
	 * 
	 * @return				A string in the form (x, y)
	 */
	@Override
	public String toString() { 
		return "(" + this.x + ", " + this.y + ")"; 
	} 

	/**
	 * Determine if the parameter is equal to this point by comparing x and y
	 * fields (if the parameter is a Point object).
	 * 
	 * @param obj			The object to compare to this object.
	 * @return				True if the parameter is a Point with x, y values
	 * 						equal to the x, y values of this Point.
	 */
	@Override
	public boolean equals(Object obj) { 
		boolean areEqual = false; 
		if (this == obj) {areEqual = true;} 
		else if (obj != null && this.getClass() == obj.getClass()) { 
			Point point = (Point)obj; 
			areEqual = this.x == point.x && this.y == point.y;
		} 
		return areEqual; 
	} 
} 