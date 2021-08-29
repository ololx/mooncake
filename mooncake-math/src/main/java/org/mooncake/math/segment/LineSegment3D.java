package org.mooncake.math.segment;

/**
 * The interface Line segment 3 d.
 *
 * @author Alexander A. Kropotin
 * @project mooncake
 * @created 2021 -08-27 21:09 <p>
 */
public interface LineSegment3D extends LineSegment {

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
     * Gets z 0.
     *
     * @return the z 0
     */
    double getZ0();

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
}
