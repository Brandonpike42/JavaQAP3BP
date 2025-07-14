package Problem3;

public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle("Circle1", 5),
            new Ellipse("Ellipse1", 6, 4),
            new Triangle("Triangle1", 3, 4, 5),
            new EquilateralTriangle("Equilateral1", 6)
        };

        System.out.println("Before Scaling:");
        for (Shape s : shapes) {
            System.out.println(s);
        }

        scaleAll(shapes, 2.0);

        System.out.println("\nAfter Scaling by factor of 2:");
        for (Shape s : shapes) {
            System.out.println(s);
        }
    }

    public static void scaleAll(Scalable[] shapes, double factor) {
        for (Scalable s : shapes) {
            s.scale(factor);
        }
    }
}

