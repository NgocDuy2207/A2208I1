package ss6_lop_Point2D_Point3D;

public class Point3D extends Point2D{
    private float z = 0.0f;
    public Point3D(){

    }
    public Point3D(float z) {
        this.z = z;
    }
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        this.getXY(x,y);
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[]{getX(),getY(),getX()};
    }
    public String toString(){
        return "Toạ độ có điểm là: "+(  this.getX() + ", " + this.getY() + "," + getZ());
    }
}
