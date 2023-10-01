package EXAM;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    private static final String FILE_SPXK = "D:\\codegym\\A0423I1-LuongMinhQuan\\module2\\src\\EXAM\\SPXK.csv";
    private static final String FILE_SPNK = "D:\\codegym\\A0423I1-LuongMinhQuan\\module2\\src\\EXAM\\SPNK.csv";

    private List<SanPhamXuatKhau> sanPhamXuatKhauList = new ArrayList<>();
    private List<SanPhapNhapKhau> sanPhapNhapKhauList = new ArrayList<>();

    public void add(SanPham sanPham){
       if(sanPham instanceof SanPhamXuatKhau){
           sanPhamXuatKhauList.add((SanPhamXuatKhau) sanPham);
       } else if (sanPham instanceof SanPhapNhapKhau) {
           sanPhapNhapKhauList.add((SanPhapNhapKhau) sanPham);

       }
    }

    public void display(){
        System.out.println("San pham xuat khau:");
        for(SanPham sanPham : sanPhamXuatKhauList){
            System.out.println(sanPham);
        }
        System.out.println("San pham nhap khau:");
        for(SanPham sanPham:sanPhapNhapKhauList){
            System.out.println(sanPham);
        }
    }

    public void deleteByID(boolean spxk, int id){
        if(spxk){
            sanPhamXuatKhauList.removeIf(e -> e.getId() == id);
        }else {
            sanPhapNhapKhauList.removeIf(e -> e.getId() == id);
        }

    }

    public void searchByName(String name){
        for(SanPhamXuatKhau sanPhamXuatKhau : sanPhamXuatKhauList){
            if(sanPhamXuatKhau.getName().contains(name)){
                System.out.println(sanPhamXuatKhau);
            }
        }
        for(SanPhapNhapKhau sanPhapNhapKhau : sanPhapNhapKhauList){
            if(sanPhapNhapKhau.getName().contains(name)){
                System.out.println(sanPhapNhapKhau);
            }
        }

    }

    public void saveFile(){
        System.out.println("bat dau luu file");
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(FILE_SPXK);
            for(SanPhamXuatKhau sanPhamXuatKhau : sanPhamXuatKhauList){
                String line = sanPhamXuatKhau.getFileLine() + "\n";
                byte[] bytes = line.getBytes("utf8");
                fileOutputStream.write(bytes);
            }
            fileOutputStream = new FileOutputStream(FILE_SPNK);
            for(SanPhapNhapKhau sanPhapNhapKhau : sanPhapNhapKhauList){
                String line = sanPhapNhapKhau.getFileLine() + "\n";
                byte[] bytes = line.getBytes("utf8");
                fileOutputStream.write(bytes);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<SanPhamXuatKhau> readFileSPXK() throws IOException {
        List<SanPhamXuatKhau> sanPhamXuatKhaus = new ArrayList<>();

        FileReader fileReader = new FileReader(FILE_SPXK);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String temp[];

        while ((line = bufferedReader.readLine()) != null){
            temp = line.split(",");

            int  id = Integer.parseInt(temp[0]);
            int code = Integer.parseInt(temp[1]);
            String name = temp[2];
            double price = Double.parseDouble(temp[3]);
            String made = temp[4];
            double giaxk = Double.parseDouble(temp[5]);
            String tenspxk = temp[6];

            SanPhamXuatKhau sanPhamXuatKhau = new SanPhamXuatKhau(code,name,price,made,giaxk,tenspxk);
            sanPhamXuatKhaus.add(sanPhamXuatKhau);
        }
        bufferedReader.close(); // Đóng luồng ở cuối vòng lặp
        fileReader.close();

        return sanPhamXuatKhaus;
    }
    public static List<SanPhapNhapKhau> readFileSPNK() throws IOException {
        List<SanPhapNhapKhau> sanPhapNhapKhaus = new ArrayList<>();

        FileReader fileReader = new FileReader(FILE_SPNK);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String temp[];
//        int code, String name, double price, String made, double giank, double thuenk, String masothue
        while ((line = bufferedReader.readLine()) != null){
            temp = line.split(",");

            int  id = Integer.parseInt(temp[0]);

            int code = Integer.parseInt(temp[1]);
            String name = temp[2];
            double price = Double.parseDouble(temp[3]);
            String made = temp[4];
            double giank = Double.parseDouble(temp[5]);
            double thuenk = Double.parseDouble(temp[6]);
            String masothue = temp[7];
            SanPhapNhapKhau sanPhapNhapKhau = new SanPhapNhapKhau(code,name,price,made,giank,thuenk,masothue);

            sanPhapNhapKhaus.add(sanPhapNhapKhau);

        }
        bufferedReader.close();
        fileReader.close();

        return sanPhapNhapKhaus;
    }


}
