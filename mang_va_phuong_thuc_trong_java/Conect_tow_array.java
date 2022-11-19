package mang_va_phuong_thuc_trong_java;
import java.util.Scanner;


public class Conect_tow_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập vào độ dài của mảng một: \n");
        int number1 = scanner.nextInt();
        System.out.println("nhập các phần tử của mảng 1: ");
        int [] arrFirst = input(number1);
        show(arrFirst);
        System.out.println(" \n");
        // mảng thứ 2
        System.out.print("nhập vào độ dài của mảng hai: \n");
        int number2 = scanner.nextInt();
        System.out.print("nhập các phần tử mảng 2: \n");
        int [] arrSecond = input(number2);
        show(arrSecond);
        System.out.println(" \n");
        int [] arrayThird = connectArray(arrFirst, arrSecond);
        show(arrayThird);
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

    public static int [] connectArray(int [] array1, int [] array2){
        int [] newArr = new int[array1.length+array2.length];
        for (int i = 0; i < array1.length; i++){
            newArr[i] = array1[i];
        }
        for (int i = 0; i <array2.length;i++ ){
            newArr[array2.length+i] = array2[i];
        }

        return newArr;
    }

}

