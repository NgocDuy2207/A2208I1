package Bai_13_MaxCharaTer.TimKiem;

import java.util.Scanner;

public class SearchSetting {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập vào độ dài của mảng một: \n");
        int number1 = scanner.nextInt();
        System.out.println("nhập các phần tử của mảng 1: ");
        int [] arrFirst = input(number1);
        show(arrFirst);
        System.out.println(" \n");

        System.out.println("vị trí value trong mảng: "+binarySearch(arrFirst, 5));

    }

    public static void show(int [] arr){
        for (int i = 0; i < arr.length;i++){
            System.out.printf( arr[i]+" ");
        }
    }

    public static int [] input(int number){
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int [number];
        for(int i = 0; i < number;i++){
            System.out.printf("a[%d]= ", i);
            arr[i] = scanner.nextInt();
        }
        return arr;

    }

    public static int binarySearch(int arr[], int value){
        int left = 0;
        int right = arr.length -1;
        while (left<=right){
            int mid = (left+right)/2;
            if (value == arr[mid]){
                return mid;
            } else if (value<arr[mid]) {
                return mid -1;
            }else {
                left = mid +1;
            }
        }
        return -1;
    }
}
