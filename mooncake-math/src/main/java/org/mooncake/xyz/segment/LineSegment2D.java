package org.mooncake.xyz.segment;

import org.mooncake.xyz.Cartesian2DCoordinate;

/**
 * The interface Line segment 2 d.
 *
 * @author Alexander A. Kropotin
 *
 * project mooncake
 * created 2021 -08-27 21:08
 */
public interface LineSegment2D<P extends Cartesian2DCoordinate> extends LineSegment<P> {

    /**
     * Gets x 0.
     *
     * @return the x 0
     */
    double getX0();

    /**
     * Gets y 0.
     *
     * @return the y 0
     */
    double getY0();

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
}
