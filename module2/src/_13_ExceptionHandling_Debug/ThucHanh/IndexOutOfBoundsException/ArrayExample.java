package _13_ExceptionHandling_Debug.ThucHanh.IndexOutOfBoundsException;

import java.util.Random;

public class ArrayExample {
    public Integer[] arrayRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sach phan tu ngau nhien");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}
