package TryCatch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TriangleEdgesCheck check = new TriangleEdgesCheck();
        Triangle triangle = new Triangle();
        boolean flag = false;
        do {

        }while (flag)
        try {
            System.out.println("nhập vào cạnh a");
            int a = scanner.nextInt();
            System.out.println("nhập vào cạnh b");
            int b = scanner.nextInt();
            System.out.println("nhập vào cạnh c");
            int c = scanner.nextInt();

                try {
                    check.checkTriangleEdges(a, b, c);
                } catch (IllegalTriangleException e) {
                    throw new RuntimeException(e);
                }
            }catch (Exception e){
            System.out.println("Sai: khong dung dinh dang!");
        }
        }

    }


