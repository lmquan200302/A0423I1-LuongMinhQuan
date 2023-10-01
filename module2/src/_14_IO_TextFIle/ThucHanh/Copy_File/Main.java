package _14_IO_TextFIle.ThucHanh.Copy_File;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) {
        File fileSource = new File("D:\\codegym\\A0423I1-LuongMinhQuan\\module2\\src\\_14_IO_TextFIle\\ThucHanh\\Copy_File\\File_src");
        File fileTarget = new File("D:\\codegym\\A0423I1-LuongMinhQuan\\module2\\src\\_14_IO_TextFIle\\ThucHanh\\Copy_File\\File_target");

        try {
            Files.copy(fileSource.toPath(), fileTarget.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e){
            e.printStackTrace();
        };
    }
}
