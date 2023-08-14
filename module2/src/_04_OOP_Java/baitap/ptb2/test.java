package _04_OOP_Java.baitap.ptb2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap he so a");
        double a = sc.nextDouble();
        System.out.print("Nhap he so b");
        double b = sc.nextDouble();
        System.out.print("Nhap he so c");
        double c = sc.nextDouble();
        giaipt ptbac2 = new giaipt(a,b,c);



        if(ptbac2.delta() > 0){
            System.out.println("Phuong trinh co 2 nghiem rieng biet" + "\n" + ptbac2.nghiem1() + "\n" + ptbac2.nghiem2());
        } else if (ptbac2.delta() == 0) {
            System.out.println("Phuong trinh co nghiem duy nhat " + ptbac2.nghiemduynhat());

        }
        else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
