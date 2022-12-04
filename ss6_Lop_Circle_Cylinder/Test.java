package ss6_Lop_Circle_Cylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2,"red");
        Cylinder circle2 = new Cylinder(circle1.getRadius(), circle1.getColor(), 3);
        Circle circle3 = new Cylinder(3);


        System.out.println("area Circle1: "+ circle1.getArea());
        System.out.println("area Cylinder: " + circle2.getCylinderArea()+ "màu sắc" + circle2.getColor());
        System.out.println("màu sắc: " + circle1.getColor());
    }
}
