package demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----MENU-----");
        System.out.println("1.Nuoc dua gia - 20.000VND");
        System.out.println("2.Nuoc ngot gia - 10.000VND");
        System.out.println("3.Nuoc cam gia - 15.000VND");
        System.out.println("4.Nuoc ep dua hau - 18.000VND");
        System.out.println("5.Tra dao cam sa - 18.000VND");
        System.out.println("6.Tra tac - 15.000VND");
        System.out.println("7.Tinh tien");
        System.out.println("--------------");

        int input = 0;
        double tongtien = 0;
        int soluong;
        int tongcong = 0;
        do {
            System.out.print("Moi ban mon: ");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Ban chon nuoc dua gia la 10.000VND");
                    System.out.print("Moi ban nhap so luong: ");
                    soluong = scanner.nextInt();
                    tongtien += 20000 * soluong;
                    break;
                case 2:
                    System.out.println("Ban chon nuoc ngot gia 10000");
                    System.out.print("Moi ban nhap so luong: ");
                    soluong = scanner.nextInt();
                    tongtien += 10000 * soluong;
                    break;
                case 3:
                    System.out.println("Ban chon nuoc cam ep gia la 15.000");
                    System.out.print("Moi ban nhap so luong: ");
                    soluong = scanner.nextInt();
                    tongtien += 15000 * soluong;
                    break;
                case 4:
                    System.out.println("Ban chon nuoc ep dua hau 18.000");
                    System.out.print("Moi ban nhap so luong: ");
                    soluong = scanner.nextInt();
                    tongtien += 18000 * soluong;
                    break;
                case 5:
                    System.out.println("Ban chon tra dao cam sa");
                    System.out.print("Moi ban nhap so luong: ");
                    soluong = scanner.nextInt();
                    tongtien += 18000 * soluong;
                    break;
                case 6:
                    System.out.println("Ban chon tra tac gia la 15.000");
                    System.out.print("Moi ban nhap so luong: ");
                    soluong = scanner.nextInt();
                    tongtien += 15000 * soluong;
                    break;

            }

        } while (input != 7);{
            System.out.println("tong so tien cua ban la: " + tongtien + "VND");

        }
    }
}
