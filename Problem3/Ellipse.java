package Problem3;

public class Ellipse extends Shape {
    private double a, b;

    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        a = Math.max(axis1, axis2);
        b = Math.min(axis1, axis2);
    }

    public double getArea() {
        return Math.PI * a * b;
    }

    public double getPerimeter() {
        return Math.PI * 2 * Math.sqrt((a * a + b * b) / 2.0) - ((a - b) * (a - b) / 2.0);
    }

    public void scale(double factor) {
        a *= factor;
        b *= factor;
    }
}
