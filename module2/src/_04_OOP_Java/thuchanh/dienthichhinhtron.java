package _04_OOP_Java.thuchanh;

import java.util.Scanner;

public class dienthichhinhtron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu rong");
        double width = sc.nextDouble();
        System.out.println("Nhap chieu dai");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());



    }
}
