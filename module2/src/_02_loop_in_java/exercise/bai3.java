package _02_loop_in_java.exercise;

import java.util.Scanner;


public class bai3 {
    public static void main(String[] args) {

        for(int i=2; i<=100; i++){
            if(check(i)){
                System.out.print(i+" ");

            }
        }

    }
    private static  boolean check(int n){
        if(n<2) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }


}
