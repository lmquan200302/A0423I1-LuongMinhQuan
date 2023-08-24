package _11_ThuatToanTimKiem_java.BaiTap.ChuoiTangDan;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi cua ban");
        String string = sc.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        //tim chuoi
        for(int i=0; i<string.length(); i++){
            //kiem tra ky tu
            LinkedList<Character> list = new LinkedList<>();

            //them ky tu i vao list
            list.add(string.charAt(i));
            for(int j=i+1; j<string.length(); j++){
                if(string.charAt(j) > list.getLast()){
                    //them vao list neu tim thay
                    list.add(string.charAt(j));
                }
            }
            if(list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        //hien thi chuoi tang dan
        for(Character ch: max){
            System.out.println(ch);
        }
        System.out.println();
    }
}
