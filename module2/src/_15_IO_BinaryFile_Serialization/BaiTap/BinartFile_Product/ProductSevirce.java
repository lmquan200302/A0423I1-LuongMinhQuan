package _15_IO_BinaryFile_Serialization.BaiTap.BinartFile_Product;

import java.util.ArrayList;

public class ProductSevirce {
    ArrayList<Product> list = new ArrayList<>();
   //contructor


    public ProductSevirce() {
        this.list = new ArrayList<>();
    }

    public void addProduct(Product product){
        this.list.add(product);
    }

    public void displayProduct(){
        for(Product product : list){
            System.out.println(product);
        }
    }

    public void searchProduct(String name){
        for (Product product:list) {
            if(product.getNameProduct().indexOf(name) >= 0){
                System.out.println(product);

            }

        }

    }
}
