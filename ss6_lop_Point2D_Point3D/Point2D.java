package ss6_lop_Point2D_Point3D;

public class Point2D {
    private float x;
    private float y;
    public Point2D(){

    }

    public Point2D(float x, float y) {
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
