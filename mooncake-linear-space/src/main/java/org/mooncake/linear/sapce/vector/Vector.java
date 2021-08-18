package org.mooncake.linear.sapce.vector;

/**
 * The interface Vector.
 *
 * @param <V> the type parameter
 * @author Alexander A. Kropotin
 * @project mooncake
 * @created 2021 -08-17 22:13 <p>
 */
interface Vector<V extends Vector> {

    /**
     * Gets module.
     *
     * @return the module
     */
    double getModule();

    /**
     * Dot product double.
     *
     * @param om the om
     * @return the double
     */
    double dotProduct(V om);

    /**
     * Rotate v.
     *
     * @param angle the angle
     * @return the v
     */
    V rotate(double angle);

    /**
     * Add v.
     *
     * @param om the om
     * @return the v
     */
    V add(V om);

    /**
     * Add v.
     *
     * @param k the k
     * @return the v
     */
    V add(double k);

    /**
     * Subtract v.
     *
     * @param om the om
     * @return the v
     */
    V subtract(V om);

    /**
     * Subtract v.
     *
     * @param k the k
     * @return the v
     */
    V subtract(double k);

    /**
     * Multiply v.
     *
     * @param om the om
     * @return the v
     */
    V multiply(V om) ;

    /**
     * Multiply v.
     *
     * @param k the k
     * @return the v
     */
    V multiply(double k);

    /**
     * Divide v.
     *
     * @param om the om
     * @return the v
     */
    V divide(V om);

    /**
     * Divide v.
     *
     * @param k the k
     * @return the v
     */
    V divide(double k);

    /**
     * Abs v.
     *
     * @return the v
     */
    V abs();

    /**
     * Normalize v.
     *
     * @return the v
     */
    V normalize();

    V clone();

    /**
     * Is same boolean.
     *
     * @param om the om
     * @return the boolean
     */
    boolean isSame(V om);
}
