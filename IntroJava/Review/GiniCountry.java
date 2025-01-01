/**
 * Represents a single country and its Gini coefficients for the years 
 * 2010 and 2020.
 * 
 * @author Maggie
 *
 */
public class GiniCountry {

	/**
	 * The country name.
	 */
	private String name;
	/**
	 * The Gini coefficient for 2010.
	 */
	private double gini2010;
	/**
	 * The Gini coefficient for 2020.
	 */
	private double gini2020;
	
	
	/**
	 * Initialize all of this object's fields from parameters.
	 * 
	 * @param name		This country's name.
	 * @param gini2010	This country's Gini coefficient for 2010.
	 * @param gini2020	This country's Gini coefficient for 2020.
	 */
	public GiniCountry(String name, double gini2010, double gini2020) {
		this.name = name;
		this.gini2010 = gini2010;
		this.gini2020 = gini2020;
	}
	
	/**
	 * Returns this country's Gini coefficient for 2010.
	 * 
	 * @return			This country's Gini coefficient for 2010.
	 */	
	public double getGini2010() {
		return this.gini2010;
	}
	
	/**
	 * Returns this country's Gini coefficient for 2020.
	 * 
	 * @return			This country's Gini coefficient for 2020.
	 */	
	public double getGini2020() {
		return this.gini2020;
	}
	
	/**
	 * Returns this country's name.
	 * 
	 * @return			This country's name.
	 */	
	public String getName() {
		return this.name;
	}
	
	/**
	 * Returns the difference between this country's Gini coefficient for 2010
	 * and 2020 as 2020-2010.
	 * 
	 * @return			This country's Gini coefficient for 2020 -
	 *                  this country's Gini coefficient for 2010.
	 */	
	public double getDifference() {
		return this.gini2020 - this.gini2010;
	}
	
	/**
	 * Returns a String that shows this country's name, Gini coefficient for 
	 * 2010, and Gini coefficient for 2020, labeled and on separate lines.
	 * 
	 * @return			A string of this country's data: name, Gini coefficient
	 *                  for 2010, Gini coefficient for 2020.
	 */
	@Override
	public String toString() {
		String giniCountry = "Name: " + this.name;
		giniCountry += "\n2010: " + this.gini2010;
		giniCountry += "\n2020: " + this.gini2020;
		return giniCountry;
	}
}
