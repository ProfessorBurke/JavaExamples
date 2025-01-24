/**
 * Methods to convert from Imperial to Metric units.
 * 
 * @author Maggie
 *
 */
public class UnitConverter {

    // Static constants for conversion factors
    public static final double INCHES_TO_CENTIMETERS = 2.54;
    public static final double POUNDS_TO_KILOGRAMS = 0.453592;
    public static final double MILES_TO_KILOMETERS = 1.60934;
    public static final double GALLONS_TO_LITERS = 3.78541;
    
    /**
     * Private constructor to reinforce that this class is not meant to
     * be instantiated.
     */
    private UnitConverter() {
    }

    /**
     * Converts inches to centimeters.
     * 
     * @param inches	The quantity to be converted, in inches.
     * @return			The converted quantity in centimeters.
     */
    public static double inchesToCentimeters(double inches) {
        return inches * INCHES_TO_CENTIMETERS;
    }

    /**
     * Converts pounds to kilograms.
     * 	
     * @param pounds	The quantity to be converted, in pounds.
     * @return			The converted quantity, in kilograms.
     */
    public static double poundsToKilograms(double pounds) {
        return pounds * POUNDS_TO_KILOGRAMS;
    }

   /**
    * Converts miles to kilometers.
    * 
    * @param miles		The quantity to be converted, in miles.
    * @return			The converted quantity, in kilograms.
    */
    public static double milesToKilometers(double miles) {
        return miles * MILES_TO_KILOMETERS;
    }

    /**
     * Converts gallons to liters.
     * 
     * @param gallons	The quantity to be converted, in gallons.
     * @return			The converted quantity, in liters.
     */
    public static double gallonsToLiters(double gallons) {
        return gallons * GALLONS_TO_LITERS;
    }

    /**
     * Converts mpg to kpl.
     * 
     * @param mpg		The rate to be converted, in mpg.
     * @return			The converted rate, in kpl.
     */
    public static double milesPerGallonToKilometersPerLiter(double mpg) {
        return mpg * MILES_TO_KILOMETERS / GALLONS_TO_LITERS;
    }
}
