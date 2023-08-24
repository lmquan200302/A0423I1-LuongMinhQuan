package _13_ExceptionHandling_Debug.ThucHanh.IndexOutOfBoundsException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] array = arrayExample.arrayRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chi so phan tu bat ky :");

        int n = scanner.nextInt();

        try {
            System.out.println("gia tri phan tu " + n + "la" + array[n]);
            System.out.println();

        }

        catch (IndexOutOfBoundsException e){
            System.err.println("chi so vuot qua gioi han mang");
        }


    }



}
