package ss4_Lop_Fan;

public class Fan {
    private final int Slow = 1;
    private final int Medium = 2;
    private final int Fast = 3;
    private int speed = 1;
    private double radius = 5;
    private boolean on = false;
    private String color = "blue";
    public Fan(){

    }

    public String getColor() {
        return color;
    }

    public int getMedium() {
        return Medium;
    }

    public int getSlow() {
        return Slow;
    }

    public int getFast() {
        return Fast;
    }

    public int getSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    public boolean isOn() {
        return on;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(int speed, double radius, boolean on, String color) {
        this.speed = speed;
        this.radius = radius;
        this.on = on;
        this.color = color;
    }
    public String toString(){
        String status = "";
        if (this.isOn()){
            status += ("Fan is on \n");
            status += ("Speed: " + this.speed +"\n");
        }else {
            status +=("Fan is off \n");
        }
        status += ("Color: " + this.color+ "\n");
        status += ("Radius: " + this.radius+ "\n");
        return status;
    }

}
