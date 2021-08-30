package org.mooncake.xyz.segment;

import org.mooncake.xyz.Cartesian2DCoordinate;

/**
 * The type Segment 2d.
 *
 * @author Alexander A. Kropotin
 * @project mooncake
 * @created 2021 -08-20 22:14 <p>
 */
public class Segment2d<P extends Cartesian2DCoordinate> implements LineSegment2D<P> {

    /**
     * The X 0.
     */
    protected double x0;

    /**
     * The X.
     */
    protected double x;

    /**
     * The Y 0.
     */
    protected double y0;

    /**
     * The Y.
     */
    protected double y;

    /**
     * Instantiates a new Segment 2 d.
     *
     * @param xA the x a
     * @param yA the y a
     * @param xB the x b
     * @param yB the y b
     */
    public Segment2d(double xA, double yA, double xB, double yB) {
        this.x0 = xA;
        this.y0 = yA;
        this.x = xB;
        this.y = yB;
    }

    @Override
    public P getA() {
        return null;
    }

    @Override
    public P getB() {
        return null;
    }

    /**
     * This method return the length between two points.
     *
     * @return the euclidean length (magnitude) of this segment.
     */
    @Override
    public double length() {
        return Math.pow(this.x - this.x0, this.y - this.y0);
    }

    @Override
    public double getX0() {
        return this.x0;
    }

    @Override
    public double getY0() {
        return this.y0;
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }
}
