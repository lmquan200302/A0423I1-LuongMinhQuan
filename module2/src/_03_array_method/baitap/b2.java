package _03_array_method.baitap;

import java.util.Scanner;

public class b2 {
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

        System.out.println("Nhập số bạn muốn thêm vào mảng: ");
        int nhap = scanner.nextInt();
        System.out.println("Nhập vị trí muốn thêm số: ");
        int vitri = scanner.nextInt();
        int newArray[] = new int[array.length + 1];

        for (int i = 0; i < vitri; i++) {
            newArray[i] = array[i];
        }

        newArray[vitri] = nhap;

        for (int i = vitri + 1; i < newArray.length; i++) {
            newArray[i] = array[i - 1];
        }

        // In ra mảng mới sau khi thêm phần tử
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

}}
