package _11_ThuatToanTimKiem_java.BaiTap.TimKiemNhiPhan_Dequy;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang: ");
        int n = input.nextInt();
        int[] array = new int[n];


        System.out.println("Nhap cac gia tri cho mang");
        for(int i=0; i<n; i++){
            System.out.print("Nhap phan tu thu " + (i+1) + ":");
            array[i] = input.nextInt();
        }

        //sap xep cac phan tu
        Arrays.sort(array);

        System.out.println("Mang cua ban la: " + Arrays.toString(array));
        System.out.println("Vi tri phan tu ban tim: " + binarySearch(array,6));
    }
    public static int binarySearch(int[] array, int value){
        int left = 0;
        int right = array.length - 1;
        int mid = (left + right) / 2;
        if(array[mid] == value){
            return mid;
        } else if (value > array[mid]) {
            return left = mid + 1;

        }else {
          return right = mid -1;
        }

    }

}









