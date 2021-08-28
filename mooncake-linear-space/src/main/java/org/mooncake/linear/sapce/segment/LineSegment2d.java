package org.mooncake.linear.sapce.segment;

/**
 * The interface Line segment 2 d.
 *
 * @author Alexander A. Kropotin
 * @project mooncake
 * @created 2021 -08-27 21:08 <p>
 */
public interface LineSegment2d extends LineSegment {

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
