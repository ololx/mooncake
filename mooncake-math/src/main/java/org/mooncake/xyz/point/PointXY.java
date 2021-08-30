package org.mooncake.xyz.point;

import org.mooncake.xyz.Coordinate2D;

/**
 * The type Point xy.
 *
 * @author Alexander A. Kropotin
 * @project mooncake
 * @created 2021 -08-30 22:15 <p>
 */
public class PointXY implements Point2D<PointXY> {

    /**
     * The X.
     */
    protected double x;

    /**
     * The Y.
     */
    protected double y;

    /**
     * Instantiates a new Point xy.
     *
     * @param x the x
     * @param y the y
     */
    public PointXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Instantiates a new Point xy.
     *
     * @param coords the coords
     */
    public PointXY(Coordinate2D coords) {
        this.x = coords.getX();
        this.y = coords.getY();
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
    public double getRadius() {
        return Math.hypot(this.x, this.y);
    }

    @Override
    public double getXAngle() {
        return Math.pow(Math.tan(this.y / this.x), -1);
    }

    @Override
    public PointXY translate(final double tx, final double ty) {
        this.x += tx;
        this.y += ty;

        return this;
    }

    @Override
    public PointXY translate(final PointXY distance) {
        return this.translate(
                distance.getX(),
                distance.getY()
        );
    }
}
