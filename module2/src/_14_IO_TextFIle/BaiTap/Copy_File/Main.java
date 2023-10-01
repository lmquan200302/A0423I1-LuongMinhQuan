package _14_IO_TextFIle.BaiTap.Copy_File;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        File fileSource = new File("fileSource.txt");
        File fileTarget = new File("fileTarget.txt");

        try {
            Files.copy(fileSource.toPath(), fileTarget.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully!");
        } catch (Exception e) {
            System.err.println("Error");
        }
    }
}