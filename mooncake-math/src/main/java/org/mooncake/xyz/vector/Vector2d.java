package org.mooncake.xyz.vector;

/**
 * The type Vector 2 d.
 *
 * @author Alexander A. Kropotin
 *
 * project mooncake
 * created 2021 -08-17 22:14
 */
public class Vector2d implements Vector2<Vector2d> {

    /**
     * The X.
     */
    protected double x;

    /**
     * The Y.
     */
    protected double y;

    /**
     * Instantiates a new Vector 2 d.
     *
     * @param x the x
     * @param y the y
     */
    public Vector2d(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets x.
     *
     * @return the x
     */
    public double getX() {
        return this.x;
    }

    /**
     * Sets x.
     *
     * @param x the x
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Gets y.
     *
     * @return the y
     */
    public double getY() {
        return this.y;
    }


    public double getRadius() {
        return 0;
    }


    public double getXAngle() {
        return 0;
    }

    /**
     * Sets y.
     *
     * @param y the y
     */
    public void setY(double y) {
        this.y = y;
    }

    public double length() {
        return Math.hypot(this.x, this.y);
    }

    public Vector2d normalize() {
        return new Vector2d(
                this.x / this.length(),
                this.y / this.length()
        );
    }

    public double dotProduct(Vector2d om) {
        return this.x * om.getX() + this.y * om.getY();
    }

    /**
     * Gets angle.
     *
     * @param om the om
     * @return the angle
     */
    public double getAngle(Vector2d om) {
        return Math.acos(this.dotProduct(om) / (this.length() * om.length()));
    }

    /**
     * Gets angle between normal.
     *
     * @param om the om
     * @return the angle between normal
     */
    public double getAngleBetweenNormal(Vector2d om) {
        return Math.acos(this.normalize().dotProduct(om.normalize()));
    }

    public Vector2d rotate(double angle) {
        return new Vector2d(
                (this.x * Math.cos(angle) - this.y * Math.sin(angle)),
                (this.x * Math.sin(angle) + this.y * Math.cos(angle))
        );
    }

    public Vector2d add(Vector2d om) {
        return new Vector2d(
                this.x + om.getX(),
                this.y + om.getY()
        );
    }

    public Vector2d add(double k) {
        return new Vector2d(
                this.x + k,
                this.y + k
        );
    }

    public Vector2d subtract(Vector2d om) {
        return new Vector2d(this.x - om.getX(), this.y - om.getY());
    }

    public Vector2d subtract(double k) {
        return new Vector2d(this.x - k, this.y - k);
    }

    public Vector2d multiply(Vector2d om) {
        return new Vector2d(
                this.x * om.getX(),
                this.y * om.getY()
        );
    }

    public Vector2d multiply(double k) {
        return new Vector2d(
                this.x * k,
                this.y * k
        );
    }

    public Vector2d divide(Vector2d om) {
        return new Vector2d(this.x / om.getX(), this.y / om.getY());
    }

    public Vector2d divide(double k) {
        return new Vector2d(this.x / k, this.y / k);
    }

    public Vector2d abs() {
        return new Vector2d(Math.abs(this.x), Math.abs(this.y));
    }

    @Override
    public String toString() {
        return String.format("<%s, %s>", this.getX(), this.getY());
    }

    public Vector2d clone() {
        return new Vector2d(this.getX(), this.getY());
    }

    private double getScaled(double value, int scale) {
        return (((value * scale)) / scale);
    }

    private double getScaled(double value) {
        return this.getScaled(value, 100);
    }

    public boolean isSame(Vector2d om) {
        return this.getX() == om.getX() && this.getY() == om.getY();
    }

    @Override
    public Vector2d translate(Vector2d distance) {
        return null;
    }
}
