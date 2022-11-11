package io.github.ololx.mooncake.math;

import java.util.Objects;

/**
 * The 2D radius vector implementation for the double type.
 * Allows the combining operations executions into one calls chain,
 * returning a reference to itself in all methods.
 *
 * This vector realization works with double
 *
 * project mooncake
 * created 08.17.2021 22:31
 *
 * @author Alexander A. Kropotin
 */
public class VectorXYD implements VectorXY<VectorXYD> {

    protected double x;

    protected double y;

    public VectorXYD(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public double getY() {
        return this.y;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }

    public VectorXYD add(VectorXYD om) {
        return new VectorXYD(
                this.x + om.getX(),
                this.y + om.getY()
        );
    }

    public VectorXYD add(double k) {
        return new VectorXYD(
                this.x + k,
                this.y + k
        );
    }

    public VectorXYD subtract(VectorXYD om) {
        return new VectorXYD(this.x - om.getX(), this.y - om.getY());
    }

    public VectorXYD subtract(double k) {
        return new VectorXYD(this.x - k, this.y - k);
    }

    public VectorXYD multiply(VectorXYD om) {
        return new VectorXYD(
                this.x * om.getX(),
                this.y * om.getY()
        );
    }

    public VectorXYD multiply(double k) {
        return new VectorXYD(
                this.x * k,
                this.y * k
        );
    }

    public VectorXYD divide(VectorXYD om) {
        return new VectorXYD(this.x / om.getX(), this.y / om.getY());
    }

    public VectorXYD divide(double k) {
        return new VectorXYD(this.x / k, this.y / k);
    }

    public VectorXYD abs() {
        return new VectorXYD(Math.abs(this.x), Math.abs(this.y));
    }

    public double length() {
        return Math.hypot(this.x, this.y);
    }

    public VectorXYD normalize() {
        return new VectorXYD(
                this.x / this.length(),
                this.y / this.length()
        );
    }

    public double dotProduct(VectorXYD om) {
        return this.x * om.getX() + this.y * om.getY();
    }

    public double getAngle(VectorXYD om) {
        return Math.acos(this.dotProduct(om) / (this.length() * om.length()));
    }

    public double getAngleBetweenNormal(VectorXYD om) {
        return Math.acos(this.normalize().dotProduct(om.normalize()));
    }

    public VectorXYD rotate(double angle) {
        return new VectorXYD(
                (this.x * Math.cos(angle) - this.y * Math.sin(angle)),
                (this.x * Math.sin(angle) + this.y * Math.cos(angle))
        );
    }

    public VectorXYD clone() {
        return new VectorXYD(this.getX(), this.getY());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof VectorXYD)) {
            return false;
        }

        VectorXYD other = (VectorXYD) obj;

        return Double.compare(other.x, this.x) == 0
                && Double.compare(other.y, this.y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return String.format("<%s, %s>", this.getX(), this.getY());
    }
}
