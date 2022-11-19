package mang_va_phuong_thuc_trong_java;

import java.util.Scanner;

public class Tim_max_trong_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào độ dài mảng: ");
        int number = Integer.parseInt(scanner.nextLine());
        int [] arr = arrNew(number);
        show(arr);
        System.out.println("max mảng là: \n");
        int max = maxArr(arr);
        System.out.println(max);

    }
    public static void show(int [] arr){
        for (int i = 0; i < arr.length;i++){
            System.out.printf( arr[i]+" ");
        }
    }
    public static int [] arrNew(int number){
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int [number];
        for(int i = 0; i < number;i++){
            System.out.printf("a[%d]= ", i);
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    public static int maxArr(int [] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length;i++){
            if (max <arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

}
