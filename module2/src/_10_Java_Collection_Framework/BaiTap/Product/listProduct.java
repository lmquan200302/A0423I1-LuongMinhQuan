package _10_Java_Collection_Framework.BaiTap.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class listProduct {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Product> list;
    public listProduct() {
        this.list = new ArrayList<Product>();
    }

    public listProduct(ArrayList<Product> list) {
        this.list = list;
    }


    //create add product
    public void addProduct(Product product){
        this.list.add(product);
    }

    //create display list product
    public  void displayProduct(){
       for(Product product: list){
           System.out.println(product);
       }
    }

    //create delete id->product
   public boolean deleteProduct(int id){
       for (Product product: list) {
           if(product.getId() == id){
               list.remove(product);
               return  true; // tra ve true neu xoa ok
           }

       }
       return false;
   }

   //create edit edit
   public void editProduct(int id){
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getId() ==  id){
                System.out.print("Nhap ten san pham: ");
                String newNameProduct = sc.nextLine();

                System.out.print("Nhap gia san pham: ");
                Double newPriceProduct = sc.nextDouble();

                Product sanpham = new Product(id,newNameProduct,newPriceProduct);

            }
        }
   }

    //search
    public void searchProduct(String name){
        for(Product product : list){
            if(product.getName().indexOf(name) >=0){
                System.out.println(product);
            }

        }
    }

    //sap xep tang giam gia san pham
    public void SortDescending(){
        Collections.sort(this.list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getPrice() < o2.getPrice()){
                    return -1;
                }else {
                    if(o1.getPrice() > o2.getPrice()){
                        return 1;
                    }
                    return  0;
                }
            }
        });

    }


}
