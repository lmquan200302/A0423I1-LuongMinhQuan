package _16_String_Regex.ThucHanh.CheckEmail_demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       ValidationUtil validationUtil = new ValidationUtil();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Email cua ban");
        System.out.print("Email: ");
        String email = scanner.nextLine();

        if(validationUtil.isEmail(email)){
            System.out.println("Mail dung dinh dang");
        }else {
            System.out.println("Mail sai dinh dang");
        }
    }
}
