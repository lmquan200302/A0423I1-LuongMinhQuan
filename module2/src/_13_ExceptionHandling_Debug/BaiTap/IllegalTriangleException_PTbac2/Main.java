package _13_ExceptionHandling_Debug.BaiTap.IllegalTriangleException_PTbac2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap he so A: ");
        int a = scanner.nextInt();
        System.out.print("Nhap he so B: ");
        int b = scanner.nextInt();
        System.out.print("Nhap he so C:");
        int c = scanner.nextInt();

        GiaiPT giaipt = new GiaiPT(a, b, c);
        if (giaipt.delta() > 0) {
            System.out.println("Phuong trinh co 2 nghiem rieng biet: ");
            System.out.print("X1 = " + giaipt.x1());
            System.out.print("X2 = " + giaipt.x2());
        } else if (giaipt.delta() == 0) {
            System.out.print("Phuong trinh co nghiem duy nhat: " + giaipt.ngiemduynhat());
        } else {
            System.out.print("Phuong trinh vo nghiem ");
        }
    }catch (Exception e){
            System.err.println("Nhap du lieu khong dung dinh dang");
        }

    }
}
