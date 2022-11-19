package mang_va_phuong_thuc_trong_java;

import java.util.Scanner;

public class Them_phan_tu_vao_mang {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.print("nhập vào độ dài mảng: \n");
        int number = scanner.nextInt();
        int [] arr = new int [number];
        System.out.println("nhập vào phần tử của mảng: \n");
        for (int  i = 0; i < number;i++){
            System.out.printf("a[%d]= ", i);
            arr[i] = scanner.nextInt();
        }
        // hàm hiển thị mảng đã tạo
        show(arr);
        System.out.println("nhập vào vị trí index cần thêm: \n");
        int index = scanner.nextInt();
        System.out.println("chèn số vào vị trí index đã tìm: \n");
        int value = scanner.nextInt();

        if (index <= 1 && index >= number-1){
            System.out.println("không chèn được phần tử vào mảng: \n");
        }else {
            arr = addNumber(arr, index,value );
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

    public static int [] addNumber (int [] arr, int index, int number){
        int [] newArr = new int[arr.length+1];
        for (int i =0; i < index; i++ ){
            newArr[i]=arr[i];
        }
        newArr[index] = number;
        for (int i = index+1;i < newArr.length;i++){
            newArr[i] = arr[i-1];
        }


        return newArr;
    }
}
