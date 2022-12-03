package FuramaResort.Controller;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class FuramaController {
//    public int scannerNumber (){
//        Scanner scanner = new Scanner(System.in);
//        int choose = Integer.parseInt(scanner.nextLine());
//        return choose;
//    }
    public void disPlayMainMenu(){
            boolean flag = false;
            do {
                System.out.println("Lựa chọn chức năng trên Menu: "+
                        "\n 1. Employee Management"+
                        "\n 2. Customer Management"+
                        "\n 3.Facility Management "+
                        "\n 4.Booking Management"+
                        "\n 5.Promotion Management"+
                        "\n 6.Exit"
                );
                System.out.println("Chọn chức năng : ");
                Scanner scanner = new Scanner(System.in);
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose){
                    case 1:
                        System.out.println(choose+ " Employee Management ");
                        employee();
                        break;
                    case 2:
                        System.out.println(choose+ " Customer Management");
                        customer();
                        break;
                    case 3:
                        System.out.println(choose+ " Facility Management");
                        facility();
                        break;
                    case 4:
                        System.out.println(choose+" Booking Management");
                        booking();
                        break;
                    case 5:
                        System.out.println(choose+" Promotion Management");
                        promotion();
                        break;
                    default:
                        flag=false;
                }
            }while (flag);
        }
        // quản lý employee
        public int employee(){
            System.out.println("Chức năng trong Employee Management: "+
                    "\n 1. Display list employees"+
                    "\n 2. Add new employee"+
                    "\n 3. Edit employee"+
                    "\n 4. Return main menu"
                    );
            Scanner scanner = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println(choose+ ". Display list employees");
                    break;
                case 2:
                    System.out.println(choose+ ". Add new employee");
                    break;
                case 3:
                    System.out.println(choose+ ". Edit employee");
                    break;
                case 4:
                    System.out.println(choose+ ". Return main menu");
                    disPlayMainMenu();
                    break;
            }
            return choose;
        }
        // quản lý customer
        public int customer(){
            System.out.println("Chức năng trong Customer Management "+
                    "\n 1.Display list customers"+
                    "\n 2.Add new customer"+
                    "\n 3.Edit customer"+
                    "\n 4.Return main menu"
                    );
            Scanner scanner = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                System.out.println(choose+ ". Display list customers");
                break;
            case 2:
                System.out.println(choose+ ". Add new customer");
                break;
            case 3:
                System.out.println(choose+ ". Edit customer");
                break;
            case 4:
                System.out.println(choose+ ". Return main menu");
                disPlayMainMenu();
                break;
        }
        return choose;
        }
        // quản lý Facility
        public int facility(){
            System.out.println("Chức năng trong Facility Management "+
                    "\n 1.Display list Facility"+
                    "\n 2.Add new facility"+
                    "\n 3.Display list facility maintenance"+
                    "\n 4.Return main menu"
            );
            Scanner scanner = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println(choose+ ". Display list Facility");
                    break;
                case 2:
                    System.out.println(choose+ ". Add new facility");
                    break;
                case 3:
                    System.out.println(choose+ ". Display list facility maintenance");
                    break;
                case 4:
                    System.out.println(choose+ ". Return main menu");
                    disPlayMainMenu();
                    break;
            }
            return choose;
    }
    public int booking(){
        System.out.println("Chức năng trong Booking Management "+
                "\n 1.Add new booking"+
                "\n 2.Display list booking"+
                "\n 3. Create new constracts"+
                "\n 4. Display list contracts"+
                "\n 5. Edit contracts"+
                "\n 6.Return main menu"
        );
        Scanner scanner = new Scanner(System.in);
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                disPlayMainMenu();
        }
        return choose;
    }
    public int promotion(){
        System.out.println("Chức năng trong Booking Management "+
                "\n 1. Display list customers use service"+
                "\n 2. Display list customers get voucher"+
                "\n 3.Return main menu"
        );
        Scanner scanner = new Scanner(System.in);
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                break;
            case 2:
                break;
            case 3:
                disPlayMainMenu();
                break;
        }
        return choose;
    }
}

