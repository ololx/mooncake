package org.mooncake.xyz.segment;

import org.mooncake.xyz.Coordinate;
import org.mooncake.xyz.Dimensional;

/**
 * The interface Line segment.
 *
 * @param <P> the type parameter - define the Line Segment Point
 * @author Alexander A. Kropotin
 * @project mooncake
 * @created 2021 -08-27 21:07 <p>
 */
public interface LineSegment<P extends Coordinate> extends Dimensional {

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
}
