package mang_va_phuong_thuc_trong_java;

import java.util.Scanner;

public class Tinh_tong_cua_mot_cot_mang_2_chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int [] [] arr = new int [number1][number2];
        for (int i = 0; i < arr.length;i++){
            for ( int j = 0 ; j < arr[i].length;j++){
                System.out.println("nhập vào phần tử thứ: "+i+"-"+j);
                arr[i][j] = scanner.nextInt();
            }
        }
        // in mảng 2 chiều
        for (int i = 0; i < arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println("\n");
        }

    }
}
