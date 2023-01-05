package stringAndRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhập vào một chuỗi");
            String a = scanner.next();
            checkRegex(a);
            System.out.println(checkRegex(a));
            if (checkRegex(a)==true){
                System.out.println("finish");
            }else {
                System.out.println("not find");
            }
        }
    }
    public static boolean checkRegex(String string){
        String regex = "^([ACP])\\d{4}([GHIKLM])$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }

}
