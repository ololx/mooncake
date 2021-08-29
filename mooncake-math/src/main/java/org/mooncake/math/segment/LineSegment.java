package org.mooncake.math.segment;

import org.mooncake.math.CoordinateMethod;
import org.mooncake.math.Magnitude;

/**
 * The interface Line segment.
 *
 * @param <P> the type parameter - define the Line Segment Point
 * @author Alexander A. Kropotin
 * @project mooncake
 * @created 2021 -08-27 21:07 <p>
 */
public interface LineSegment<P extends CoordinateMethod> {

    /**
     * Gets a.
     *
     * @return the a
     */
    P getA();

    /**
     * Gets b.
     *
     * @return the b
     */
    P getB();

    /**
     * Length double.
     *
     * @return the double
     */
    double length();
}
