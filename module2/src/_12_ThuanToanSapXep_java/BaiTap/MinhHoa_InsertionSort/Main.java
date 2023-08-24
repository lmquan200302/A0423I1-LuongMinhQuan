package _12_ThuanToanSapXep_java.BaiTap.MinhHoa_InsertionSort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + " :");
            array[i] = scanner.nextInt();
        }
        System.out.println("Mang ban dau la: ");
        for(int i=0; i< array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Mang sau khi duoc sap xep chen: ");
        insertionSort(array);
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void insertionSort(int[] array){
        int temp,x;
        for(int i=1; i< array.length; i++){
            x = array[i];
            System.out.println("tai vi tri " + i + " lay ra " + x);
            temp = i;
            while(temp > 0 && x < array[temp-1]){
                System.out.println("temp la: " + temp);
                System.out.println(temp + "<" + array[temp-1]);;
                array[temp] = array[temp-1]; //swap
                temp--;
            }
            System.out.println("tim duoc vi tri chen la: " + (temp+1));
            array[temp] = x;
        }


        


    }
}
