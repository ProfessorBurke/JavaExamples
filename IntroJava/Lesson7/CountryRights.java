/**
 * Represents the data for one country in the lgbt-legal-equality-index.csv file.
 * This includes name, country code, and the equalityIndex, a value between 0
 * and 100.  All data is for 2024.
 * 
 * @author Maggie
 *
 */
public class CountryRights {

	private String name;
	private String code;
	private double equalityIndex;
	
	/**
	 * Construct this object from parameters.
	 * 
	 * @param name				This country's name.
	 * @param code				This country's ISO 3166 3-letter code.
	 * @param equalityIndex		The LGBTQ equality index for this country.
	 */
	public CountryRights(String name, String code, double equalityIndex) {
		this.name = name;
		this.code = code;
		this.equalityIndex = equalityIndex;
	}
	
	/**
	 * Returns the country name of this object.
	 * 
	 * @return	this country's name.
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Compare two CountryRights countries by equalityIndex.
	 * 
	 * @param otherCountry		The country to compare to this country.
	 * @return value > 0 if this country has a higher equalityIndex, < 0 if
	 *         the other country's equalityIndex is higher, or 0 if equal.
	 */
	public double compareTo(CountryRights otherCountry) {
		return this.equalityIndex - otherCountry.equalityIndex;
	}
	
	/**
	 * Check the passed code against this country's code.
	 * 
	 * @param code			An ISO 3166 3-letter country code.
	 * @return				true if the code equals this country's code and
	 *                      false otherwise.
	 */
	public boolean isCountry(String code) {
		return this.code.equals(code);
	}
	
	/**
	 * Scale this country's equalityIndex to a value between 0 and 255.
	 * 
	 * @return				A value between 0 and 255 that is the scaled
	 * 						equalityIndex value for this country.
	 */
	public float getAlpha() {
		float alpha =(float)this.equalityIndex * 2.55F;
		alpha = Math.max(0, Math.min(255, alpha));
		return alpha;
	}
	
	/**
	 * Create a formatted string from this country's data.
	 * 
	 * @return			This country's name, code, and equality index.
	 */
	public String toString() {
		return String.format("%-35s%-5s%-8.2f", this.name, this.code, this.equalityIndex);
	}
	
}
