package _14_IO_TextFIle.ThucHanh.TimGiaTriLonNhat_File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAndWriteFile {
    public void TimGiaTriLonNhat(String path) {
        try {
            // Đọc file
            File file = new File(path);

            // Kiểm tra file
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int MaxNumber = 0;

            while ((line = br.readLine()) != null) {
                int number = Integer.parseInt(line);
                if (number > MaxNumber) {
                    MaxNumber = number;
                }
            }
            br.close();

            // Hiển thị kết quả
            System.out.println("Số lớn nhất trong File là: " + MaxNumber);

        } catch (FileNotFoundException e) {
            System.err.println("Không tìm thấy file hoặc file bị lỗi");
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file");
        }
    }

}
