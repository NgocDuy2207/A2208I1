package mang_va_phuong_thuc_trong_java;

import java.util.Scanner;

public class Xoa_phan_tu_trong_mang {
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
        show(arr );
        System.out.println("nhập phần tử cần xoá: \n");
        int deleteNumber = scanner.nextInt();
        int indexDelete = findIndexElement(arr, deleteNumber);

        if (indexDelete == -1){
            System.out.println("phần tử không ở trong mảng");
        }else {
            arr =deleteElement(arr, indexDelete);
        }

        for (int i = 0; i < arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void show(int[] arr){
        for (int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static int  findIndexElement(int [] arr, int element){
        int index = -1;
        for (int i = 0; i < arr.length;i++){
            if (arr[i]==element){
                index = i;
            }
        }
        return index;
    }
    public static int[] deleteElement (int [] arr, int index){
        int [] newArr = new int [arr.length];
        for (int i = 0; i < index;i++){
           newArr[i] = arr[i];
        }
        for (int i = index; i < arr.length-1;i++ ){
            arr[i] = arr[i+1];
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
