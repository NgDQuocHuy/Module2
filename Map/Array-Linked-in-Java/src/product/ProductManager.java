package product;

import java.util.*;

public class ProductManager {
    Scanner input = new Scanner(System.in);
    private ArrayList<Product> listProducts;

    public ProductManager() {
        this.listProducts = new ArrayList<Product>();
    }

    public ProductManager(ArrayList<Product> listProducts) {
        this.listProducts = listProducts;
    }

    //    1.    Thêm sản phẩm
    public void addProduct(Product product) {
        this.listProducts.add(product);
    }

    //    2.    Sửa thông tin sản phẩm
    public void editProduct(String idProduct) {
        for (Product product : listProducts) {
            if (product.getIdProduct().equals(idProduct)) {
                System.out.println("Nhập ID sản phẩm cần thay đổi: ");
                String id = input.nextLine();
                product.setIdProduct(id);
                System.out.println("Nhập tên sản phẩm cần thay đổi: ");
                String name = input.nextLine();
                product.setNameProduct(name);
                System.out.println("Nhập giá sản phẩm cần thay đổi: ");
                int price = input.nextInt();
                product.setPriceProduct(price);
            }
        }
    }

    //    3.    Xóa sản phẩm theo id
    public boolean removeProduct(Product idProduct) {
        return this.listProducts.remove(idProduct);
    }

    //    4.    Show danh sách sản phẩm
    public void showListProducts() {
        for (Product product : listProducts) {
            System.out.println(product);
        }
    }

//    public void showListProducts(List<Product> listProducts) {
//        for (Product product : listProducts) {
//            System.out.println(product);
//        }
//    }

    //    5.    Tìm kiếm sản phẩm theo tên
    public void findProduct(String nameProduct) {
        for (Product product : listProducts) {
            if (product.getNameProduct().contains(nameProduct)) {
                System.out.println(product);
            }
        }
    }

    //    6.    Sắp xếp tăng dần và giảm dần
    public void sortPriceASC() {
        Collections.sort(this.listProducts, new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                if (product2.getPriceProduct() < product1.getPriceProduct()) {
                    return 1;
                } else if (product2.getPriceProduct() > product1.getPriceProduct()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }

    public void sortPriceDESC() {
        Collections.sort(this.listProducts, new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                if (product1.getPriceProduct() < product2.getPriceProduct()) {
                    return 1;
                } else if (product1.getPriceProduct() > product2.getPriceProduct()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }
}
