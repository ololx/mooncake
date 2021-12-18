package org.mooncake.xyz;

/**
 * The interface Coordinate 2 d.
 *
 * @author Alexander A. Kropotin
 *
 * project mooncake
 * created 2021 -08-28 12:08
 */
public interface PolarCoordinate extends Coordinate {

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
