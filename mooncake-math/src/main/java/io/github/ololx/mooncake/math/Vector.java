package io.github.ololx.mooncake.math;

import org.mooncake.xyz.Coordinate;
import org.mooncake.xyz.Translatable;

/**
 * The radius vector representation.
 * Allows the combining operations executions into one calls chain,
 * returning a reference to itself in all methods.
 *
 * @param <V> the type parameter
 *
 * project mooncake
 * created 08.17.2021 22:13
 *
 * @author Alexander A. Kropotin
 */
interface Vector<V extends Vector<V>> {

    double dotProduct(V om);

    V add(V om);

    V add(double k);

    V subtract(V om);

    V subtract(double k);

    V multiply(V om) ;

    V multiply(double k);

    V divide(V om);

    V divide(double k);

    V abs();

    V normalize();
}
