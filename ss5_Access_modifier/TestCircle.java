package ss5_Access_modifier;

public class TestCircle {

    public static void main(String[] args) {
        Circle circle1 = new Circle(2);
        Circle circle2 = new Circle(3);
        System.out.println("S circle1: "+ circle1.getArea());
        System.out.println("S circle2: "+ circle2.getArea());
    }


}
