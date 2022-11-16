package bai_tap_2_vong_lap_for;

import java.util.Scanner;

public class in_ra_cac_so_nguyen_to_nho_hon_100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập vào một số: ");
        int number = scanner.nextInt();
        System.out.printf("Tất các các số nguyên tố nhỏ hơn %d: \n", number);
        if (number >=2){
            System.out.print(2);
        }
        for (int i = 3; i < number;i++){
            if (isPrimeNumber(i)){
                System.out.print(" "+i);
            }
        }

    }
    public static boolean isPrimeNumber(int number){
        if (number < 2){
            return false;
        }
        int squareRoot = (int) Math.sqrt(number);
        for (int i = 2; i < squareRoot; i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
}
