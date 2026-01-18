package gr.aueb.cf.cf9.fromclass.unit4.skeletal;

public class AbstractRectangle implements IRectangle {

    private double width;
    private double height;

    public AbstractRectangle() {}

    public AbstractRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return ((2 * width) + (2 * height));
    }

    @Override
    public boolean isSquare() {
        if (width == height) {
            return true;
        }

        return false;
    }
}
