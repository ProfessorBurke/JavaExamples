/**
 * Demonstrates method overloading in Java.
 * 
 * @author Maggie
 *
 */
public class DistanceCalculator {

    /**
     * Calculates the distance between two points in a 2D plane.
     * 
     * @param x1  The x-coordinate of the first point
     * @param y1  The y-coordinate of the first point
     * @param x2  The x-coordinate of the second point
     * @param y2  The y-coordinate of the second point
     * @return    The distance between the two points
     */
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    /**
     * Calculates the distance between two points in 3D space.
     * 
     * @param x1  The x-coordinate of the first point
     * @param y1  The y-coordinate of the first point
     * @param z1  The z-coordinate of the first point
     * @param x2  The x-coordinate of the second point
     * @param y2  The y-coordinate of the second point
     * @param z2  The z-coordinate of the second point
     * @return    The distance between the two points
     */
    public static double calculateDistance(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2) + Math.pow((z2 - z1), 2));
    }

    public static void main(String[] args) {
        // 2D example
        double distance2D = calculateDistance(1, 2, 4, 6);
        System.out.printf("Distance between two points in 2D: %.2f\n", distance2D);

        // 3D example
        double distance3D = calculateDistance(1, 2, 3, 4, 6, 8);
        System.out.printf("Distance between two points in 3D: %.2f\n", distance3D);
    }
}

