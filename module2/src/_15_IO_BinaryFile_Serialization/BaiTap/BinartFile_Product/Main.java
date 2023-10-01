package _15_IO_BinaryFile_Serialization.BaiTap.BinartFile_Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();


        System.out.println("-----MENU------");
        System.out.println("1.ADD Product");
        System.out.println("2.Search Product");
        System.out.println("3.Display Product");
        System.out.println("4.Exit");
        System.out.println("------------------");
        int input;
        ProductSevirce productSevirce = new ProductSevirce();
        do {
            System.out.println("Please input: ");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextInt();
            scanner.nextLine();
            switch (input) {
                case 1:
                    System.out.println("Input infor Product");
                    System.out.print("Input ID Product: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Input Name Product: ");
                    String name = scanner.nextLine();
                    System.out.print("Input Made Product: ");
                    String made = scanner.nextLine();
                    System.out.print("Input Price Product: ");
                    Float price = scanner.nextFloat();

                    Product product = new Product(id,name,made,price);
                    productSevirce.addProduct(product);
                    SaveProduct.saveProductoFile("Product.txt",products);
                    List<Product> productDataFromFile = SaveProduct.readDataFromFile("Product.txt");
                    for(Product product1 : productDataFromFile){
                        System.out.println(product1);
                    }

                    break;
                case 2:
                    System.out.println("Search Product");
                    System.out.print("Input name Product: ");
                    name = scanner.nextLine();
                    productSevirce.searchProduct(name);
                    break;
                case 3:
                    System.out.println("Display infor Product");
                    productSevirce.displayProduct();
                    break;
                case 4:
                    System.out.println("Exit success");
                    break;
                default:
                    System.out.println("Input is not valid");
                    break;
            }

        } while (input != 4);

    }
}
