package _03_array_method.thuchanh;

import java.util.Scanner;

public class demoarr2chieu {
    public static void main(String[] args) {
        // khoi tao mang 2 chieu
        int[][] arr = new int[10][10];

        //nhap gia tri vao mang
        Scanner input = new Scanner(System.in);
        System.out.print("Enter" + arr.length + "row" + arr[0].length + "coloum: ");
        for(int row=0; row< arr.length; row++){
            for(int colum=0; colum< arr[row].length; colum++){
                arr[row][colum] = input.nextInt();

            }
        }


    }
}
