package Bai_10_Stack_Queue.Stack_Queue;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào một chuỗi: ");
        String string = scanner.nextLine();
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < string.length();i++){
            stack.push(String.valueOf(string.charAt(i)));
        }
        String daoChuoi = "";
        while (!stack.isEmpty()){
            daoChuoi = daoChuoi + stack.pop();
        }
        System.out.println(daoChuoi);
//
        if (string.equalsIgnoreCase(daoChuoi)){
            System.out.println("chuỗi palindrome ");
        }else {
            System.out.println("chuỗi không palindrome");
        }



    }
}
