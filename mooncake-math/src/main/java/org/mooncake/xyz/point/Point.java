package org.mooncake.xyz.point;

import org.mooncake.xyz.Coordinate;
import org.mooncake.xyz.Translatable;

/**
 * The interface Point.
 *
 * @param <C> the type parameter
 * @author Alexander A. Kropotin
 * @project mooncake
 * @created 2021 -08-29 20:10 <p>
 */
public interface Point<C extends Coordinate> extends Coordinate, Translatable<C> {
}
