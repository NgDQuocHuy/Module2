package testProduct;

import java.lang.String;
import product.Product;
import product.ProductManager;

import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProductManager listProducts = new ProductManager();
        int choice = 0;

        do {
            System.out.println("* * * * * * * * * * * * *  MENU * * * * * * * * * * * * * * * * * *");
            System.out.println("*              Lựa chọn chức năng                                 *");
            System.out.println("*       1.     Thêm sản phẩm                                      *");
            System.out.println("*       2.     Sửa thông tin sản phẩm theo id                     *");
            System.out.println("*       3.     Xoá sản phẩm theo id                               *");
            System.out.println("*       4.     Hiển thị danh sách sản phẩm                        *");
            System.out.println("*       5.     Tìm kiếm sản phẩm theo tên                         *");
            System.out.println("*       6.     Sắp xếp sản phẩm tăng dần, giảm dần theo giá       *");
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
            System.out.print("=> Chọn chức năng: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("1.     Thêm sản phẩm");
                    System.out.println("=> Nhập ID sản phẩm:");
                    String idProduct = input.nextLine();
                    System.out.println("=> Nhập tên sản phẩm:");
                    String nameProduct = input.nextLine();
                    System.out.println("=> Nhập giá sản phẩm:");
                    int priceProduct = input.nextInt();
                    Product product = new Product(idProduct, nameProduct, priceProduct);
                    listProducts.addProduct(product);
                    break;
                case 2:
                    System.out.println("2.     Sửa thông tin sản phẩm theo id");
                    System.out.print("=> Nhập ID sản phẩm cần sửa: ");
                    idProduct = input.nextLine();
                    listProducts.editProduct(idProduct);
                    break;
                case 3:
                    System.out.println("3.     Xoá sản phẩm theo id");
                    System.out.print("=> Nhập ID sản phẩm: ");
                    idProduct = input.nextLine();
                    product = new Product(idProduct);
                    System.out.println("=> Xóa sản phẩm trong danh sách: " + listProducts.removeProduct(product));
                    break;
                case 4:
                    System.out.println("4.     Danh sách sản phẩm");
                    listProducts.showListProducts();
                    break;
                case 5:
                    System.out.println("5.     Tìm kiếm sản phẩm theo tên");
                    System.out.print("=> Nhập tên sản phẩm cần tìm: ");
                    nameProduct = input.nextLine();
                    listProducts.findProduct(nameProduct);
                    break;
                case 6:
                    System.out.println("6.     Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
                    System.out.println("1. Tăng dần");
                    System.out.println("2. Giảm dần");
                    System.out.print("=> Chọn chức năng: ");
                    int choice2 = Integer.parseInt(input.nextLine());
                    switch (choice2) {
                        case 1:
                            System.out.println("=> Danh sách tăng dần:");
                            listProducts.sortPriceASC();
                            listProducts.showListProducts();
                            break;
                        case 2:
                            System.out.println("=> Danh sách giảm dần:");
                            listProducts.sortPriceDESC();
                            listProducts.showListProducts();
                            break;
                    }
            }
        } while (choice != 0);
    }
}
