package JAVAEXAM;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DienThoaiDichVu {

    private static final String FILE_DTCH = "D:\\codegym\\A0423I1-LuongMinhQuan\\module2\\src\\JAVAEXAM\\DienThoaiChinhHang.csv";
    private static final String FILE_DTXT = "D:\\codegym\\A0423I1-LuongMinhQuan\\module2\\src\\JAVAEXAM\\DienThoaiXachTay.csv";
    private List<DienThoaiChinhHang> dienThoaiChinhHangList = new ArrayList<>();
    private List<DienThoaiXayTay> dienThoaiXayTayList = new ArrayList<>();
    public void add(DienThoai dienThoai){
        if(dienThoai instanceof  DienThoaiChinhHang){
            dienThoaiChinhHangList.add((DienThoaiChinhHang) dienThoai);
        } else if (dienThoai instanceof DienThoaiXayTay) {
            dienThoaiXayTayList.add((DienThoaiXayTay) dienThoai);
        }
    }

    public void display(){
        System.out.println("Dien thoai chinh hang");
        for(DienThoai dienThoai : dienThoaiChinhHangList){
            System.out.println(dienThoai);
        }
        System.out.println("Dien thoai xach tay");
        for(DienThoai dienThoai : dienThoaiXayTayList){
            System.out.println(dienThoai);
        }
    }
    public void deleteById(boolean dienthoaichinhhang, int id){
        if(dienthoaichinhhang){
            dienThoaiChinhHangList.removeIf(e -> e.getId() == id);
        }
        else {
            dienThoaiXayTayList.removeIf(e -> e.getId() == id);
        }

    }

    public void searchByName(String name){
        for(DienThoaiChinhHang dienThoaiChinhHang : dienThoaiChinhHangList){
            if(dienThoaiChinhHang.getTen().contains(name)){
                System.out.println(dienThoaiChinhHang);
            }
        }
        for (DienThoaiXayTay dienThoaiXayTay : dienThoaiXayTayList){
            if(dienThoaiXayTay.getTen().contains(name)){
                System.out.println(dienThoaiXayTay);
            }
        }
    }

    public void saveFile() throws IOException {
        System.out.println("Bat dau luu file");
        FileOutputStream fileOutputStream = null;

        fileOutputStream = new FileOutputStream(FILE_DTCH);
        for(DienThoaiChinhHang dienThoaiChinhHang : dienThoaiChinhHangList){
            String line = dienThoaiChinhHang.getFileLine() + "\n";
            byte[] bytes = line.getBytes("utf8");
            fileOutputStream.write(bytes);
        }

        fileOutputStream = new FileOutputStream(FILE_DTXT);
        for(DienThoaiXayTay dienThoaiXayTay : dienThoaiXayTayList){
            String line = dienThoaiXayTay.getFileLine() + "\n";
            byte[] bytes = line.getBytes("utf8");
            fileOutputStream.write(bytes);
        }
    }

    public static List<DienThoaiChinhHang> readFileDTCH() throws IOException {
        List<DienThoaiChinhHang> dienThoaiChinhHangs = new ArrayList<>();

        FileReader fileReader = new FileReader(FILE_DTCH);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String temp[];

        while ((line = bufferedReader.readLine()) != null){
            temp = line.split(",");
//            String ten, double gia, int soluong, String nhasx, int thoigianbh, String phamvibh
            int id = Integer.parseInt(temp[0]);
            String ten = temp[1];
            double gia = Double.parseDouble(temp[2]);
            int soluong = Integer.parseInt(temp[3]);
            String nhasx = temp[4];
            int thoigianbh = Integer.parseInt(temp[5]);
            String phamvibh = temp[6];

            DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang(ten,gia,soluong,nhasx,thoigianbh,phamvibh);
            dienThoaiChinhHangs.add(dienThoaiChinhHang);

        }
        bufferedReader.close(); //ketthuc
        fileReader.close();

        return dienThoaiChinhHangs;

    }

    public static List<DienThoaiXayTay> readFileDTXT() throws IOException {
        List<DienThoaiXayTay> dienThoaiXayTays = new ArrayList<>();

        FileReader fileReader = new FileReader(FILE_DTXT);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String temp[];

        while ((line = bufferedReader.readLine()) != null){
            temp = line.split(",");
//            String ten, double gia, int soluong, String nhasx, String quocgia, String trangthai
            int id = Integer.parseInt(temp[0]);
            String ten = temp[1];
            double gia = Double.parseDouble(temp[2]);
            int soluong = Integer.parseInt(temp[3]);
            String nhasx = temp[4];
           String quocgia = temp[5];
           String trangthai = temp[6];

            DienThoaiXayTay dienThoaiXayTay = new DienThoaiXayTay(ten,gia,soluong,nhasx,quocgia,trangthai);
            dienThoaiXayTays.add(dienThoaiXayTay);

        }
        bufferedReader.close(); //ketthuc
        fileReader.close();

        return dienThoaiXayTays;

    }
}
