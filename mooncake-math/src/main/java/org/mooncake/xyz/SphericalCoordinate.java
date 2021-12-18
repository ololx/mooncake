package org.mooncake.xyz;

/**
 * The interface Coordinate 3 d.
 *
 * @author Alexander A. Kropotin
 *
 * project mooncake
 * created 2021 -08-28 12:10
 */
public interface SphericalCoordinate extends Coordinate {

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

    /**
     * Gets z angle.
     *
     * @return the z angle
     */
    double getZAngle();
}
