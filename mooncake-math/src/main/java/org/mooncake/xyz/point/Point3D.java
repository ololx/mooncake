package org.mooncake.xyz.point;

import org.mooncake.xyz.Coordinate3D;

/**
 * The interface Point 3 d.
 *
 * @param <C> the type parameter
 * @author Alexander A. Kropotin
 *
 * project mooncake
 * created 2021 -08-29 21:17
 */
public interface Point3D<C extends Coordinate3D> extends Point<C>, Coordinate3D {

    /**
     * Translate c.
     *
     * @param tx the tx
     * @param ty the ty
     * @param tz the tz
     * @return the c
     */
    C translate(double tx, double ty, double tz);
}
