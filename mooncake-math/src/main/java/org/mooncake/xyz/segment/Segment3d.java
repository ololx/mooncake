package org.mooncake.xyz.segment;

import org.mooncake.xyz.Coordinate;

/**
 * The type Segment 3d.
 *
 * @author Alexander A. Kropotin
 *
 * project mooncake
 * created 2021 -08-27 20:59
 */
public class Segment3d implements LineSegment3D {

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
     * The Z 0.
     */
    protected double z0;

    /**
     * The Z.
     */
    protected double z;

    /**
     * Instantiates a new Segment 3 d.
     *
     * @param xA the x a
     * @param yA the y a
     * @param zA the z a
     * @param xB the x b
     * @param yB the y b
     * @param zB the z b
     */
    public Segment3d(double xA, double yA, double zA, double xB, double yB, double zB) {
        this.x0 = xA;
        this.y0 = yA;
        this.z0 = zA;
        this.x = xB;
        this.y = yB;
        this.z = zB;
    }

    @Override
    public Coordinate getA() {
        return null;
    }

    @Override
    public Coordinate getB() {
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

    @Override
    public double getZ0() {
        return this.z0;
    }

    @Override
    public double getZ() {
        return this.z;
    }
}
