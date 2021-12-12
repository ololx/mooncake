package org.mooncake.xyz.point;

import org.mooncake.xyz.Coordinate2D;

/**
 * The interface Point 2 d.
 *
 * @param <C> the type parameter
 * @author Alexander A. Kropotin
 *
 * project mooncake
 * created 2021 -08-29 21:17
 */
public interface Point2D<C extends Coordinate2D> extends Point<C>, Coordinate2D {

    /**
     * Translate c.
     *
     * @param tx the tx
     * @param ty the ty
     * @return the c
     */
    C translate(final double tx, final double ty);
}
