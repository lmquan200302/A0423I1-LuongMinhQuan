package _03_array_method.thuchanh;

import java.util.Scanner;

public class nhiet_d0_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double f;
        double c;
        int chon;
        System.out.println("Menu.");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        do{

            chon = input.nextInt();
            switch (chon) {
                case 1:
                    System.out.print("nhap f: ");
                    f = input.nextDouble();
                    System.out.println("ket qua la: " + f_to_c(f));
                    break;
                case 2:
                    System.out.print("Nhap c");
                    c = input.nextDouble();
                    System.out.println("ket qua la:" + c_to_f(c));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (chon != 0);
        }
    public static double c_to_f(double c){
        double f = (9.0 / 5) * c + 32;
        return f;
    }
    public static double f_to_c(double f){
        double c = (5.0 / 9) * (f - 32);
        return c;
    }
    }

