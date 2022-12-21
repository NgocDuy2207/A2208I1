package TryCatch;

public class TriangleEdgesCheck {
    public void checkTriangleEdges(int a, int b, int c) throws IllegalTriangleException{
        if (a + b <= c || a + c <= b || b + c <= a && a > 0 && b > 0 && c > 0) {
            throw new IllegalTriangleException("Loi: Tam giac khong hop le!");
        } else {
            System.out.println("Tam giac hop le!");
        }

    }
}
