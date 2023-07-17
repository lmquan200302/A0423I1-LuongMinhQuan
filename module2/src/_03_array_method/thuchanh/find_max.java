package _03_array_method.thuchanh;

import java.util.Scanner;

public class find_max {
    public static void main(String[] args) {
        int size;
        int[]  arr;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Nhap kich thuong cua mang");
            size = scanner.nextInt();
            if(size>20){
                System.out.println("Kich thuoc khong duoc vuot qua 20");
            }
        }
        while (size>20);

        //Nhap gia tri cho cac phan tu cua mang
        arr = new int[size];
        int i=0;
        while (i<arr.length){
            System.out.print("Nhap phan tu " + (i+1) + " ");
            arr[i] = scanner.nextInt();
            i++;
        }
        // in ra dach sach mang
        System.out.print("Danh sach mang: ");
        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j] + "\t");

        }

        //duyet cac phan tu de tim ra GTLN
        int max = arr[0];
        int index = 1;
        for(int j=0; j<arr.length; j++){
            if(arr[j] > max){
                max = arr[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);

    }
}
