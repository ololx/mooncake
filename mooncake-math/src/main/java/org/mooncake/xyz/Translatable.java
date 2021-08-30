package org.mooncake.xyz;

/**
 * @project mooncake
 * @created 2021-08-30 22:02
 * <p>
 * @author Alexander A. Kropotin
 */
public interface Translatable<T> {

    /**
     * Translate object and return itself.
     *
     * @param distance the distance
     * @return the translatable object
     */
    T translate(final T distance);
}
