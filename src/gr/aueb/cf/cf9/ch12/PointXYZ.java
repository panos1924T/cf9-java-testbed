package gr.aueb.cf.cf9.ch12;

public class PointXYZ {

    private double x;
    private double y;
    private double z;

    public PointXYZ() {}

    public PointXYZ(long x, long y, long z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(long x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(long y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(long z) {
        this.z = z;
    }

    public double getXYDistance() {
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(),2));
    }

    public double getYZDistance() {
        return Math.sqrt(Math.pow(getY(),2) + Math.pow(getZ(),2));
    }

    public double getXZDistance() {
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getZ(),2));
    }

    public double getXYZDistance() {
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(),2) + Math.pow(getZ(),2));
    }
}
