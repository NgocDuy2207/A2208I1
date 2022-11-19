package hien_thi_cac_hinh;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class disPlayShape {
    public static void main(String[] args) {
        System.out.println("nhập vào chiều cao: ");
        Scanner scanner = new Scanner(System.in);
        int chieuCao = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < chieuCao; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0 ; i < chieuCao;i++){
            for (int j = i; j < chieuCao-1;j++){
                System.out.print(" ");
            }
            for (int  j=0; j < i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0 ; i < chieuCao;i++){
            for (int j = i; j < chieuCao - 1; j++){
                System.out.print("*");
            }
            for (int j = 0 ; j <=i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < chieuCao; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int j=i;j<chieuCao-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }




}
