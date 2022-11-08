package io.github.ololx.mooncake.math;

/**
 * The 2D radius vector representation.
 * Allows the combining operations executions into one calls chain,
 * returning a reference to itself in all methods.
 *
 * @param <V> the type parameter
 *
 * project mooncake
 * created 08.17.2021 22:30
 *
 * @author Alexander A. Kropotin
 */
public interface VectorXY<V extends VectorXY<V>> extends Vector<V> {

    public double getX();

    public void setX(double x);

    public double getY();

    public void setY(double y);
}
