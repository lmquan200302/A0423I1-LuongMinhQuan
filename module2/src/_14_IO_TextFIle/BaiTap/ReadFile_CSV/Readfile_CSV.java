package _14_IO_TextFIle.BaiTap.ReadFile_CSV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Readfile_CSV {
    private static final String LINK_FILE = "D:\\codegym\\A0423I1-LuongMinhQuan\\module2\\src\\_14_IO_TextFIle\\BaiTap\\ReadFile_CSV\\country.csv";
   public static List<Country> readCSV() throws IOException {
       List<Country> countryList = new ArrayList<>();
       FileReader fileReader = new FileReader(LINK_FILE);
       BufferedReader bufferedReader = new BufferedReader(fileReader);

       String line;
       String temp[];


       while ((line = bufferedReader.readLine()) != null){
           temp = line.split(",");
           int id = Integer.parseInt(temp[0]);
           String code = temp[1];
           String name = temp[2];

           Country country = new Country(id,code,name);
           countryList.add(country);
       }
       bufferedReader.close();

       return countryList;

   };

    public static void main(String[] args) throws IOException {
        List<Country> countryList = readCSV();
        for (Country country: countryList) {
            System.out.println(country);
            
        }
    }
}
