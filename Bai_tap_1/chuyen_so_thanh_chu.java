package Bai_tap_1;

import java.util.Scanner;

public class chuyen_so_thanh_chu {
    public static void main(String[] args) {
        while (true){
            System.out.println("Enter your number: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number >= 0 && number < 10){
                System.out.println(oneDiGit(number));
            }else if( number <= 20) {
                System.out.println(towDiGit(number));
            }else if(number > 20 && number < 100) {
                System.out.println(towsDiGit(number));

            }else {
                System.out.println(threeDiGit(number));
            }

        }
    }
    private static String oneDiGit(int number){
        switch(number){
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Night";
        }

        return "Zero";
        }
        private static String towDiGit(int number){
            switch(number){
                case 10:
                    return "Ten";
                case 11:
                    return "Eleven";
                case 12:
                    return "Twelve";
                case 13:
                    return "Thirteen";
                case 14:
                    return "Fourteen";
                case 15:
                    return "Fifteen";
                case 16:
                    return "Sixteen";
                case 17:
                    return "Seventeen";
                case 18:
                    return "Eighteen";
                case 19:
                    return "Nineteen";
            }

            return "Twenty";
        }
        private static String towsDiGit(int number){
            String result = null;
            int teens = number/10;
            int ones = number%10;
            if (ones > 0){
                switch (teens){
                    case 2:
                        result = "Twenty"+ " "+ oneDiGit(ones);
                        break;
                    case 3:
                        result = "Thirty"+ " "+ oneDiGit(ones);
                        break;
                    case 4:
                        result = "Fourty"+ " "+ oneDiGit(ones);
                        break;
                    case 5:
                        result = "Fifty"+ " "+ oneDiGit(ones);
                        break;
                    case 6:
                        result = "Sixty"+ " "+ oneDiGit(ones);
                        break;
                    case 7:
                        result = "Seventy"+ " "+ oneDiGit(ones);
                        break;
                    case 8:
                        result = "Eighty"+ " "+ oneDiGit(ones);
                        break;
                    case 9:
                        result = "Ninety"+ " "+ oneDiGit(ones);
                        break;
                }

            }else if (ones == 0){
                switch (teens){
                    case 2:
                        result = "Twenty";
                        break;
                    case 3:
                        result = "Thirty";
                        break;
                    case 4:
                        result = "Fourty";
                        break;
                    case 5:
                        result = "Fifty";
                        break;
                    case 6:
                        result = "Sixty";
                        break;
                    case 7:
                        result = "Seventy";
                        break;
                    case 8:
                        result = "Eighty";
                        break;
                    case 9:
                        result = "Ninety";
                        break;
                }
            }


            return result;
        }
        private static String threeDiGit(int number){
            String result = null;
            int hundreds = number/100;
            int others = number - (hundreds*100);
            if (others < 10){
                result = oneDiGit(hundreds)+" "+ "Hundred"+" "+"and"+" "+ oneDiGit(others);
            } else if (others >=10 && others < 20) {
                result = oneDiGit(hundreds) +" "+ "Hundred"+" "+"and"+" "+towDiGit(others);
            }else {
                result = oneDiGit(hundreds)+" "+"Hundred"+" "+ towsDiGit(others);
            }

            return result;
        }


        }



