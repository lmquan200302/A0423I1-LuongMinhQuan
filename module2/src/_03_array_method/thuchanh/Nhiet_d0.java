package _03_array_method.thuchanh;

import java.util.Scanner;

public class Nhiet_d0 {
    public static void main(String[] args) {
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0.Exit");
        System.out.println("--------------------------");
        double f;
        double c;

        int input;
        do {
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("1. Fahrenheit to Celsius");
                    System.out.println("Moi nhap nhiet do F");
                     f = scanner.nextInt();
                     c = 5.0 / 9 * (f - 32);
                    System.out.println("Nhiet do F sau khi chuyen doi qua C la: " + c);
                    break;
                case 2:
                    System.out.println("2. Celsius to Fahrenheit");
                    System.out.println("Moi nhap nhiet do C");
                    c = scanner.nextInt();
                    f = (9.0 / 5 * c) + 32;
                    System.out.println("Nhiet do C sau khi chuyen doi  sang F la" + f);
                    break;
                case 0:
                    System.exit(0);


            }
        }
        while (input != 0);
    }
}
