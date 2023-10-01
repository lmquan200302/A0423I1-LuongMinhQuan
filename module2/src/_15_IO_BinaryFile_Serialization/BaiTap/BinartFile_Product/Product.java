package _15_IO_BinaryFile_Serialization.BaiTap.BinartFile_Product;

import java.io.Serializable;

public class Product implements Serializable {
    private int idProduct;
    private String nameProduct;
    private String madeProduct;
    private Float priceProduct;

    public Product(int idProduct, String nameProduct, String madeProduct, Float priceProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.madeProduct = madeProduct;
        this.priceProduct = priceProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getMadeProduct() {
        return madeProduct;
    }

    public void setMadeProduct(String madeProduct) {
        this.madeProduct = madeProduct;
    }

    public Float getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(Float priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", madeProduct='" + madeProduct + '\'' +
                ", priceProduct=" + priceProduct +
                '}';
    }
}
