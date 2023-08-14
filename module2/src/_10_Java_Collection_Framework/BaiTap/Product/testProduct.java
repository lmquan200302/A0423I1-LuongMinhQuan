package _10_Java_Collection_Framework.BaiTap.Product;

import java.util.Scanner;

public class testProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        listProduct listProduct = new listProduct();
        System.out.println("SELECT");
        System.out.println("-----------------------");
        System.out.println("1.Them san pham");
        System.out.println("2.Sua thong tin san pham theo ID");
        System.out.println("3.Xoa san pham theo ID");
        System.out.println("4.Hien thi danh sach san pham");
        System.out.println("5.Tim kiem san pham theo ten");
        System.out.println("6.Sap xep san pham tang giam theo gia");
        System.out.println("7.EXIT");
        System.out.println("--------------------------");


        do {
            System.out.println("Moi ban chon: ");

            input = sc.nextInt();
            sc.nextLine();

            switch (input) {
                case 1:
                    System.out.print("Nhap ID san pham: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nhap ten san pham: ");
                    String name = sc.nextLine();

                    System.out.print("Nhap gia san pham: ");
                    double price = sc.nextDouble();
                    sc.nextLine();

                    Product product = new Product(id, name, price);
                    listProduct.addProduct(product);
                    break;
                case 2:
                    System.out.print("Nhap ID san pham ban muon sua: ");
                    id = sc.nextInt();
                    listProduct.editProduct(id);

                    break;
                case 3:
                    System.out.print("Nhap ID san pham ban can xoa: ");
                    id = sc.nextInt();
                    Product product1 = new Product(id);
                    listProduct.deleteProduct(id);

                    break;
                case 4:
                    System.out.println("Hien thi danh sach san pham");
                    listProduct.displayProduct();
                    break;
                case 5:
                    System.out.print("Nhap ten san pham ban tim: ");
                    name = sc.nextLine();
                    System.out.print("San pham ban tim: ");
                    listProduct.searchProduct(name);
                    break;
                case 6:
                    System.out.println("Sap xep thanh cong san pham theo gia tien");
                    listProduct.SortDescending();
                    break;
                case 7:
                    System.out.println("EXIT");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, Vui long nhap lai");
                    break;
            }
        } while (input != 7);
    }
}
