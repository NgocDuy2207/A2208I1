package ss5_Access_modifier;

public class Circle {
    private double radius = 1;
    private String color = "red";
    public Circle(){
    }
    public Circle(double radius) {
        this.radius = radius;

    }
    private   double getRadius(){
        return radius;
    }
    private String getColor(){
        return color;
    }
    public double getArea(){
        return radius*radius;
    }
}
