package Problem2;

// Demo.java
public class Demo {
    public static void main(String[] args) {
        MovablePoint m1 = new MovablePoint(2.0f, 3.0f, 1.5f, 2.5f);
        System.out.println("Initial: " + m1);

        m1.move();
        System.out.println("After move: " + m1);

        m1.move();
        System.out.println("After another move: " + m1);
    }
}

