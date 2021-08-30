package org.mooncake.xyz.point;

import org.mooncake.xyz.Coordinate2D;
import org.mooncake.xyz.Coordinate3D;

/**
 * The type Point xyz.
 *
 * @author Alexander A. Kropotin
 * @project mooncake
 * @created 2021 -08-30 22:34 <p>
 */
public class PointXYZ implements Point3D<PointXYZ> {

    /**
     * The X.
     */
    protected double x;

    /**
     * The Y.
     */
    protected double y;

    /**
     * The Z.
     */
    protected double z;

    /**
     * Instantiates a new Point xyz.
     *
     * @param x the x
     * @param y the y
     */
    public PointXYZ(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Instantiates a new Point xyz.
     *
     * @param x the x
     * @param y the y
     * @param z the z
     */
    public PointXYZ(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Instantiates a new Point xyz.
     *
     * @param coords the coords
     */
    public PointXYZ(Coordinate2D coords) {
        this.x = coords.getX();
        this.y = coords.getY();
        this.z = 0;
    }

    /**
     * Instantiates a new Point xyz.
     *
     * @param coords the coords
     */
    public PointXYZ(Coordinate3D coords) {
        this.x = coords.getX();
        this.y = coords.getY();
        this.z = coords.getZ();
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
    public double getZ() {
        return this.z;
    }

    @Override
    public double getRadius() {
        return this.x;
    }

    @Override
    public double getXAngle() {
        return this.y;
    }

    @Override
    public double getZAngle() {
        return this.z;
    }

    @Override
    public PointXYZ translate(double tx, double ty, double tz) {
        this.x += tx;
        this.y += ty;
        this.z += tz;

        return this;
    }

    @Override
    public PointXYZ translate(PointXYZ distance) {
        return this.translate(
                distance.getX(),
                distance.getY(),
                distance.getZ()
        );
    }
}
