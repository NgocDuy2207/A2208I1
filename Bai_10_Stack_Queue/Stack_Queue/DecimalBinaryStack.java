package Bai_10_Stack_Queue.Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class DecimalBinaryStack {
    public static void main(String[] args) {
        boolean flag = true;
        do {
            Scanner scanner = new Scanner(System.in);
            Stack<Integer> stack = new Stack<>();
            System.out.println("nhập vào một số");
            int num = Integer.parseInt(scanner.nextLine());

            while (num != 0) {
                int n = num % 2;
                stack.push(n);
                num /= 2;
            }
            System.out.println("chuyển thành hệ nhị phân");
            while (!(stack.isEmpty())) {
                System.out.print(stack.pop());
            }
            System.out.println();
        } while (flag);


    }
}
