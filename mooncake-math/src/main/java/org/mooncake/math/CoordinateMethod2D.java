package org.mooncake.math;

/**
 * The interface Coordinate 2 d.
 *
 * @author Alexander A. Kropotin
 * @project mooncake
 * @created 2021 -08-28 12:08 <p>
 */
public interface CoordinateMethod2D extends CoordinateMethod {

    private static double convertPolarToCartesianX(double radius, double xAngle) {
        return radius * Math.cos(xAngle);
    }

    /**
     * Gets x.
     *
     * @return the x
     */
    double getX();

    /**
     * Gets y.
     *
     * @return the y
     */
    double getY();

    /**
     * Gets radius.
     *
     * @return the radius
     */
    double getRadius();

    /**
     * Gets x angle.
     *
     * @return the x angle
     */
    double getXAngle();
}
