package _03_array_method.baitap;

import java.util.Scanner;

public class min_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] array = new int[10];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Mảng của bạn là:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int min = array[0];
        for (int i = 1; i < array.length ; i++) {
            if(array[i] < min){
                min = array[i];
            }

        }

        System.out.println("Phan tu nho nhat trong mang la: "+min);

}}
