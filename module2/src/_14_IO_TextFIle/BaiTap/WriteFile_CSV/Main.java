package _14_IO_TextFIle.BaiTap.WriteFile_CSV;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String LINK_FILE = "D:\\codegym\\A0423I1-LuongMinhQuan\\module2\\src\\_14_IO_TextFIle\\BaiTap\\ReadFile_CSV\\country.csv";
    public static List<Datnuoc> writeFile_CSV() throws IOException {

        List<Datnuoc> datnuocList = new ArrayList<>();
        FileReader fileReader = new FileReader(LINK_FILE);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        String temp[];
        while ((line = bufferedReader.readLine()) != null){
            temp = line.split(",");
            int id = Integer.parseInt(temp[0]);
            String code = temp[1];
            String name = temp[2];
        }
        bufferedReader.close();
        return datnuocList;
    }

    public static void writeCSV(Datnuoc datnuoc) throws IOException {
        FileWriter fileWriter = new FileWriter(LINK_FILE,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(datnuoc.getId() + "," + datnuoc.getCode() + "," + datnuoc.getName() + "\n");
        bufferedWriter.close();
    }

    public static void main(String[] args) throws IOException {
        writeCSV(new Datnuoc(9,"VN","VetNam"));
        writeCSV(new Datnuoc(10,"CAM","CamPuChia"));

    }

}
