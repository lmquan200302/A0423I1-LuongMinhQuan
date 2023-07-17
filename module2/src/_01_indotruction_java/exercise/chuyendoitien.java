package _01_indotruction_java.exercise;

import java.util.Scanner;

public class chuyendoitien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tygiaVND = 23000;
        System.out.print("Nhap so tien USD ban muon chuyen doi: ");
        int USD = input.nextInt();
        int ketqua = USD * tygiaVND;
        System.out.print("So tien cua ban la: " + ketqua + "VND");
    }
}
