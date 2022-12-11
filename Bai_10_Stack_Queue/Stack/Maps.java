package Bai_10_Stack_Queue.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào một chuoi: ");
        String s1 = scanner.nextLine();
        String [] arrStr = s1.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String s: arrStr) {
            if (map.containsKey(s)){
                Integer value = map.get(s);
                value++;
                map.replace(s, value);
            }else {
                map.put(s, 1);
            }
            
        }
        System.out.println("_______");
        System.out.println(map.toString());

    }
}
