package org.mooncake.xyz;

/**
 * The interface Coordinate 3 d.
 *
 * @author Alexander A. Kropotin
 *
 * project mooncake
 * created 2021 -08-28 12:10
 */
public interface Cartesian3DCoordinate extends Coordinate {

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
     * Gets z.
     *
     * @return the z
     */
    double getZ();

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
