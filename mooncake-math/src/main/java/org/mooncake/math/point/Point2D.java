package org.mooncake.math.point;

import org.mooncake.math.CoordinateMethod2D;

/**
 * The interface Point 2 d.
 *
 * @param <C> the type parameter
 * @author Alexander A. Kropotin
 * @project mooncake
 * @created 2021 -08-29 21:17 <p>
 */
public interface Point2D<C extends CoordinateMethod2D> extends Point<C>, CoordinateMethod2D {

    /**
     * Translate c.
     *
     * @param tx the tx
     * @param ty the ty
     * @return the c
     */
    C translate(double tx, double ty);
}
