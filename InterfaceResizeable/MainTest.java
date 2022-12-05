package InterfaceResizeable;

import java.util.Objects;
import java.util.Random;

public class MainTest {
    public static void main(String[] args) {
        Shape circle1 = new Circle(2);
        Shape rectangle1 = new Rectangle(2,4);
        Shape circle2 = new Circle(4);
        Shape rectangle2 = new Rectangle(4, 8);
        ((Circle) circle1).resize(50);
        System.out.println(circle1);
        ((Rectangle)rectangle1).resize(50);
        System.out.println(rectangle1);
        ((Rectangle)rectangle2).resize(10);
    }

}
