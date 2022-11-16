package bai_tap_2_vong_lap_for;

import java.util.Scanner;

public class hien_thi_cac_loai_hinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập vào số phần tử của mảng: ");
        int number = scanner.nextInt();
        int [] arr = new int[number];
        System.out.print("nhập các phần tử của mảng: \n");
        for (int i = 0; i < number;i++){
            System.out.printf("a[%d]= ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.println(" các phần tử trong mảng");
        show(arr);


    }
    public static void show(int[] arr){
        for (int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }




}
