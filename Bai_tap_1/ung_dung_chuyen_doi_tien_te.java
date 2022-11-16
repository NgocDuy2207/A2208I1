package Bai_tap_1;

import java.util.Scanner;

public class ung_dung_chuyen_doi_tien_te {
    public static void main(String[] args) {
        double rate = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào usd: " );
        usd = sc.nextFloat();
        double exchange = usd*23000;
        System.out.println("VND nhận được: " + exchange);

    }
}
