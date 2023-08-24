package _13_ExceptionHandling_Debug.ThucHanh.NumberFormatException;

import java.util.Scanner;

public class caculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhap so x: ");
            int x = scanner.nextInt();
            System.out.print("Nhap so y: ");
            int y = scanner.nextInt();

            int phepcong = x + y;
            int pheptru = x - y;
            int phepnhan = x * y;
            int phepchia = x / y;

            System.out.println("Ket qua phep cong la: " + x + "+" + y + " =" + phepcong);
            System.out.println("Ket qua phep tru la: " + x + "-" + y + " =" + pheptru);
            System.out.println("Ket qua phep nhan la: " + x + "*" + y + " =" + phepnhan);
            System.out.println("Ket qua phep chia la: " + x + "/" + y + " =" + phepchia);
        } catch (Exception e) {
            System.err.println("Du lieu nhap vao khong dung");
        }
    }
}
