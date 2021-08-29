package org.mooncake.math.point;

import org.mooncake.math.CoordinateMethod3D;

/**
 * The interface Point 3 d.
 *
 * @param <C> the type parameter
 * @author Alexander A. Kropotin
 * @project mooncake
 * @created 2021 -08-29 21:17 <p>
 */
public interface Point3D<C extends CoordinateMethod3D> extends Point<C>, CoordinateMethod3D {

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
