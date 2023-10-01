package _14_IO_TextFIle.ThucHanh.Sum_FileText;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {
    public void readungFiletext(String filePath){


       try {
           //doc file theo huong dan
           File file = new File(filePath);

           //kiem tra neu file khong ton tai thi nem ra ngoai le
           if(!file.exists()){
               throw new FileNotFoundException();
           }
           //doc tung dong file va tien hanh cong tong lai
           BufferedReader br = new BufferedReader(new FileReader(file));
           String line = "";
           int sum = 0;
           while ((line = br.readLine()) != null){
               System.out.println(line);
               sum += Integer.parseInt(line);
           }
           br.close();
           //hien thi ra man hinh tong cac so nguyen file
           System.out.println("Tong = " + sum);
       }catch (Exception e){
           System.err.println("File khong ton tai hoac file bi loi");
       };

    }
}
