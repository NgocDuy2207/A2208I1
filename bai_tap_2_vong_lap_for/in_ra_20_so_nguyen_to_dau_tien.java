package bai_tap_2_vong_lap_for;

import java.util.Scanner;

public class In_ra_20_so_nguyen_to_dau_tien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập vào số lượng số nguyên số in ra: ");
        int number = scanner.nextInt();
        System.out.printf("%d số nguyên số đầu tiên là: \n", number);
        int dem = 0;
        int i = 2;
        while (dem < number){
            if (isPrimeNumber(i)){
                System.out.print(i + " ");
                dem++;
            }
            i++;
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
