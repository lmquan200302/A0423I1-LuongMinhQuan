package _03_array_method.thuchanh;

import java.util.Scanner;

public class timgiatri {
    public static void main(String[] args) {
        String[] student = {"Quan","Long","Hai","Hieu"};
        Scanner  scaner = new Scanner(System.in);
        String input_name = scaner.nextLine();

        boolean isExist = false;
        for(int i=0; i<student.length; i++){
            if(input_name.equals(student[i])){
                System.out.println("Ten duoc thay trong mang"+input_name);
                isExist = true;
                break;
            }
        }
        if(!isExist){
            System.out.println("Ten khong hop le");
        }

    }
}
