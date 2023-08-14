package _09_DSA_Stack_Queue.BaiTap.ThapPhan_NhiPhan;

import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Stack<Integer> stackSoDu = new Stack<>();
        System.out.println("Nhap so n nguyen duong tu ban phim");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        while (input>0){
            int sodu = input % 2;
            stackSoDu.push(sodu);
            input = input / 2;
        }
        int n = stackSoDu.size();
        for(int i=0; i<n; i++){
            System.out.print("So nhi phan la: " + stackSoDu.pop());
        }





    }
}
