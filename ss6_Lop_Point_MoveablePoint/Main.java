package ss6_Lop_Point_MoveablePoint;

public class Main {
    public static void main(String[] args) {
        Point point1 = new MoveablePoint(1, 2);
        Point point2 = new MoveablePoint(3,4);
        ((MoveablePoint)point2).move();
        ((MoveablePoint)point1).move();

        System.out.println(point2.toString());
        System.out.println(point1.toString());
    }
}
