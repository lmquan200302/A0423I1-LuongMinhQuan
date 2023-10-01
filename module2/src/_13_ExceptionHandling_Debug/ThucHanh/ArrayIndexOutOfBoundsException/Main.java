package _13_ExceptionHandling_Debug.ThucHanh.ArrayIndexOutOfBoundsException;

import java.util.Scanner;

public class Main {
    //Chỉ số mảng ngoại lệ ngoài giới hạn
    public static void main(String[] args) {
        try {
            int [] array = {1,3,325,1,2};
            System.out.println(array[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Mang vuot qua gioi han");
            System.err.println(e.getCause());
            System.err.println(e.toString());

        }

    }
}
