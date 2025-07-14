package Problem3;

public class Triangle extends Shape {
    private double side1, side2, side3;

    public Triangle(String name, double s1, double s2, double s3) {
        super(name);
        if (s1 + s2 <= s3 || s2 + s3 <= s1 || s3 + s1 <= s2) {
            throw new IllegalArgumentException("Invalid triangle sides.");
        }
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public void scale(double factor) {
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }
}

