package Vehicle_Management.Controller;

import Vehicle_Management.Model.Oto;
import Vehicle_Management.Model.XeMay;
import Vehicle_Management.Model.XeTai;
import Vehicle_Management.Service.impl.OtoService;
import Vehicle_Management.Service.impl.XeMayService;
import Vehicle_Management.Service.impl.XeTaiService;

import java.util.Scanner;

public class MenuController {
    private static Scanner sc = new Scanner(System.in);
    private  static OtoService otoService = new OtoService();
    private  static XeTaiService xeTaiService = new XeTaiService();
    private static XeMayService xeMayService = new XeMayService();

    public static void displayMenu(){

        boolean flag = true;
        do {
            System.out.println("Chon phuong tien: \n" +
                    "1. Quan ly Oto\n" +
                    "2. Quan Ly Xe Tai\n" +
                    "3. Quan Ly Xe May \n" +
                    "4. Thoat");
            System.out.println("chon phuong tien");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    System.out.println("chon Oto");
                    displayOto();
                    break;
                case 2:
                    System.out.println("chon Xe Tai");
                    displayXeTai();
                    break;
                case 3:
                    System.out.println("chon xe May");
                    displayXeMay();
                    break;
                case 4:
                    displayMenu();
                    break;
                default:
                    flag = false;
            }
        }while (flag);
    }
    public static void displayOto(){
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng:\n" +
                    "1. Thêm mới phương tiện.\n" +
                    "2. Hiện thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Tìm kiếm theo biển kiểm soát\n" +
                    "5. Thoát\n");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Them moi Oto");
                    System.out.println("them moi bien so");
                    String bienSo = sc.nextLine();
                    System.out.println("ma san xuat");
                    String maSanXuat =sc.nextLine();
                    System.out.println("nam san xuat");
                    int namSanXuat = Integer.parseInt(sc.nextLine());
                    System.out.println("chu so huu");
                    String chuSoHuu = sc.nextLine();
                    System.out.println("so cho ngoi");
                    int soChoNgoi = Integer.parseInt(sc.nextLine());
                    System.out.println("kieu xe");
                    String kieuXe = sc.nextLine();
                    Oto oto = new Oto(bienSo, maSanXuat, namSanXuat, chuSoHuu,soChoNgoi, kieuXe);
                    otoService.add(oto);
                    break;
                case 2:
                    System.out.println("Hien thi Oto");
                    otoService.displayAll();
                    break;
                case 3:
                    System.out.println("xoa phuong tien Oto");
                    String deleteBienSo = sc.nextLine();
                    otoService.remove(deleteBienSo);
                    break;
                case 4:
                System.out.println("Tim kiem theo bien so");
                    otoService.search();
                    break;
                case 5:
                System.out.println("Thoat");
                displayMenu();
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + choose);
            }
        }while (flag);

    }
    //
    public static void displayXeTai(){
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng:\n" +
                    "1. Thêm mới phương tiện.\n" +
                    "2. Hiện thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Tìm kiếm theo biển kiểm soát\n" +
                    "5. Thoát\n");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Them moi Xe Tai");
                    System.out.println("them moi bien so");
                    String bienSo = sc.nextLine();
                    System.out.println("ma san xuat");
                    String maSanXuat =sc.nextLine();
                    System.out.println("nam san xuat");
                    int namSanXuat = Integer.parseInt(sc.nextLine());
                    System.out.println("chu so huu");
                    String chuSoHuu = sc.nextLine();
                    System.out.println("trong tai");
                    Double trongTai = Double.parseDouble(sc.nextLine());
                    XeTai xeTai = new XeTai(bienSo,maSanXuat,namSanXuat,chuSoHuu,trongTai);
                    xeTaiService.add(xeTai);

                    break;
                case 2:
                    System.out.println("Hien thi Xe Tai");
                    xeTaiService.displayAll();

                    break;
                case 3:
                    System.out.println("xoa phuong tien Xe Tai");
                    String delete = sc.nextLine();
                    xeTaiService.remove(delete);
                    break;
                case 4:
                    System.out.println("Tim kiem theo bien so Xe Tai");
                    xeTaiService.search();
                    break;
                case 5:
                    System.out.println("Thoat");
                    displayMenu();
                    break;

            }
        }while (flag);

    }
    public static void displayXeMay(){
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng:\n" +
                    "1. Thêm mới phương tiện.\n" +
                    "2. Hiện thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Tìm kiếm theo biển kiểm soát\n" +
                    "5. Thoát\n");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Them moi Xe May");
                    System.out.println("them moi bien so");
                    String bienSo = sc.nextLine();
                    System.out.println("ma san xuat");
                    String maSanXuat =sc.nextLine();
                    System.out.println("nam san xuat");
                    int namSanXuat = Integer.parseInt(sc.nextLine());
                    System.out.println("chu so huu");
                    String chuSoHuu = sc.nextLine();
                    System.out.println("cong suat");
                    double congSuat = Double.parseDouble(sc.nextLine());
                    XeMay xeMay = new XeMay(bienSo, maSanXuat, namSanXuat, chuSoHuu, congSuat);
                    xeMayService.add(xeMay);

                    break;
                case 2:
                    System.out.println("Hien thi Xe May");
                    xeMayService.displayAll();
                    break;
                case 3:
                    System.out.println("xoa phuong tien Xe May");
                    System.out.println("chon bien so xe can xoa");
                    String deleteXeMay = sc.nextLine();
                    xeMayService.remove(deleteXeMay);
                    break;
                case 4:
                    System.out.println("Tim kiem theo bien so Xe May");
                    xeMayService.search();
                    break;
                case 5:
                    System.out.println("Thoat");
                    displayMenu();
                    break;

            }
        }while (flag);

    }
}
