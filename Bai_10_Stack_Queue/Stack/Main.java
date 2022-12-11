package Bai_10_Stack_Queue.Stack;

import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stringStack = new Stack<String>();
        Stack<Integer> numbers = new Stack<>();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.push(4);
        System.out.println(numbers);
        System.out.println("đảo ngược dãy số: ");
        while (!numbers.isEmpty()){
            System.out.println(numbers.pop());
        }
        // đảo ngược chuỗi
        System.out.println("nhập vào 1 chuỗi");
        String chars = scanner.nextLine();
        for(int i = 0; i < chars.length();i++){
            stringStack.push(String.valueOf(chars.charAt(i)));
        }
        System.out.println("chỗi đảo ngược");
        for (int i = 0; i < chars.length();i++){
            System.out.printf(stringStack.pop());
        }




     }
}
