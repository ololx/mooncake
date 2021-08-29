package org.mooncake.math.point;

import org.mooncake.math.CoordinateMethod;

/**
 * The interface Point.
 *
 * @param <C> the type parameter
 * @author Alexander A. Kropotin
 * @project mooncake
 * @created 2021 -08-29 20:10 <p>
 */
public interface Point<C extends CoordinateMethod> extends CoordinateMethod {

    /**
     * Translate c.
     *
     * @param distance the distance
     * @return the c
     */
    C translate(C distance);
}
