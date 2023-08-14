package _09_DSA_Stack_Queue.BaiTap.DaoNguocMang;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Stack<String> stack = new Stack<>();
//
//        System.out.println("Nhap chuoi:");
//        String s = sc.nextLine();
//
//        for(int i=0; i<s.length(); i++){
//            stack.push(s.charAt(i) + "");
//        }
//
//        System.out.println("chuoi dao nguoc:");
//        for(int i=0; i<s.length(); i++){
//            System.out.print(stack.pop());
//        }


        Stack<Integer> stack = new Stack<>();
        int[] array = {1,2,3,4,5,6};
        for(int i=0; i<array.length; i++){
            stack.push(array[i]);
        }
        System.out.print("Mang dao nguoc la: ");
        for(int i= 0; i<array.length; i++){
            System.out.print(stack.pop());
        }
    }
}
