package product;

import java.lang.Comparable;
import java.util.Objects;

public class Product{
    private String idProduct;
    private String nameProduct;
    private int priceProduct;

    public Product(String idProduct) {
        this.idProduct = idProduct;
    }

    public Product(String id, String name, int price) {
        this.idProduct = id;
        this.nameProduct = name;
        this.priceProduct = price;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return "Id sản phẩm: "
                + idProduct
                + ", Tên sản phẩm: "
                + nameProduct
                + ", Giá sản phẩm: " + priceProduct;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product product = (Product) obj;
        return idProduct.equals(product.idProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduct);
    }
}
