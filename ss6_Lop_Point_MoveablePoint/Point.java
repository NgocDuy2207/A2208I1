package ss6_Lop_Point_MoveablePoint;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;
    public Point(){

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float X, float Y){
        this.x = x;
        this.y = y;
    }
    public float [] getXY(float x, float y){
        return new float[]{this.x , this.y};
    }
    public String toString(){
        return "Điểm có toạ độ" + getX()+ ","+getY();
    }
}
