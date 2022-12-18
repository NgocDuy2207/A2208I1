package Bai12_JavaCollection;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static IProductManager productManager = new ProductManager();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        productManager.disPlay();

        int choose = 0;
        do {
            System.out.println("chọn chức năng: ");
            System.out.println("1.thêm sản phẩm\n" +
                    "2.xóa sản phẩm\n" +
                    "3.Edit sản phẩm\n" +
                    "4.sắp sếp sản phẩm tăng dần theo giá\n" +
                    "5.Tìm kiếm sản phẩm theo tên");
             //choose = Integer.parseInt(scanner.nextLine());
             choose = scanner.nextInt();
             scanner.nextLine();

            if (choose == 1){
                System.out.println("nhập id sản phẩm: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("nhập tên sản phầm: ");
               String nameProduct = scanner.nextLine();
                System.out.println("nhập giá sản phẩm: ");
                double price = Double.parseDouble(scanner.nextLine());

                Product product = new Product(id, nameProduct, price);
                productManager.add(product);
               productManager.disPlay();

            }else if (choose == 2){
                System.out.println("xoá sản phẩm vị trí id: ");
                int idDelete = Integer.parseInt(scanner.nextLine());
                productManager.delete(idDelete);
                productManager.disPlay();
            } else if (choose == 3) {

                System.out.println("nhập sản phẩm vị trí id cần sửa: ");
                int idEdit = Integer.parseInt(scanner.nextLine());
                System.out.println("sửa tên sản phẩm: ");
                String nameEdit = scanner.nextLine();
                System.out.println("sửa giá sản phẩm: ");
                double priceEdit = scanner.nextDouble();
                Product product = new Product(idEdit, nameEdit,priceEdit);
                productManager.edit(idEdit, product);
                productManager.disPlay();

            } else if (choose == 4){
                System.out.println("sắp xếp theo giá");
                productManager.sortByPrice();
                productManager.disPlay();

            } else if (choose == 5) {
                System.out.println("tìm kiếm theo tên sản phẩm");
                System.out.println("nhập vao ten sản phẩm");
                String name = scanner.nextLine();
                productManager.search(name);

            }

        }while (choose != 0);

    }


}
