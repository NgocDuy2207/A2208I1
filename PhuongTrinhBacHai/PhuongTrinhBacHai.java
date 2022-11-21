package OOP.PhuongTrinhBacHai;

import java.util.Scanner;

public class PhuongTrinhBacHai {
    public static void main(String[] args) {
        double a, b, c;

        while (true) {
            System.out.println("Enter a,b, c");
            Scanner sc = new Scanner(System.in);
            a = Double.parseDouble(sc.nextLine());
            b = Double.parseDouble(sc.nextLine());
            c = Double.parseDouble(sc.nextLine());
            QuadraticEquation test = new QuadraticEquation(a, b, c);
            if (test.getDiscriminant() < 0) {
                System.out.println("The equation has no roots");
            } else if (test.getDiscriminant() == 0) {
                System.out.println("The equation has one root: " + test.getRoot1());
            } else {
                System.out.println("The equation has tow roots: ");
                System.out.println("Root 1 is: " + test.getRoot1());
                System.out.println("Root 2 is: " + test.getRoot2());
            }
        }
    }
}
