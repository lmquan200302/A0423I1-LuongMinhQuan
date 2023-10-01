package _14_IO_TextFIle.ThucHanh.Sum_FileText;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Nhap duong dan file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readungFiletext(path);
    }
}
