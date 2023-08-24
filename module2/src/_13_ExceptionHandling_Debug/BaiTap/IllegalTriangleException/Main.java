package _13_ExceptionHandling_Debug.BaiTap.IllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {


            System.out.printf("Nhap he so canh A: ");
            double canhA = scanner.nextDouble();
            System.out.printf("Nhap he so canh B: ");
            double canhB = scanner.nextDouble();
            System.out.printf("Nhap he so canh C: ");
            double canhC = scanner.nextDouble();

            IllegalTriangleException.TamGiac tamGiac = new IllegalTriangleException.TamGiac(canhA,canhB,canhC);
            System.out.println("He so cac canh cua hinh tam giac la: " + canhA + canhB + canhC);

        }catch (IllegalTriangleException exception){
            System.err.println(exception.getMessage());
        }


    }
}
