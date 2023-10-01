package _02_loop_in_java.exercise;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        System.out.println("Moi ban nhap so 1-4 de chon hinh");
        int userInput;
        do {
            Scanner input = new Scanner(System.in);
            userInput = Integer.parseInt(input.next());
            switch (userInput) {
                case 1:
                    System.out.println("In hình chữ nhật");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");

                    }
                    break;
                case 2:
                    System.out.println("In hình tam giác vuông, có cạnh góc vuông ở botton-left");

                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;

                case 3:
                    System.out.println("Ban chon hinh In hình tam giác vuông, có cạnh góc vuông ở top-left");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;

                case 4:
                    System.out.print("EXIT");

            }
        }
        while (userInput != 4);

    }
}
