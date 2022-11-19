package lop_va_doi_tuong;

public class Rectangle {
    double height , width;
    public Rectangle(){

    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    // tạo getter, setter
    public double getArea(){
        return this.height * this.width;
    }
    public double getPerimeter(){
        return (this.height+this.width)*2;
    }
    public String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
