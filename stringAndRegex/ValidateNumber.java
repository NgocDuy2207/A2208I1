package stringAndRegex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumber {
    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Number Phone");
            String a = scanner.next();
            checkRegex(a);
            System.out.println(checkRegex(a));
            if (checkRegex(a)==true){
                System.out.println("Number is true");
            }else {
                System.out.println("Number is false");
            }
        }
    }
    public static boolean checkRegex(String string){
        String regex = "^(0|\\+84)\\d{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
