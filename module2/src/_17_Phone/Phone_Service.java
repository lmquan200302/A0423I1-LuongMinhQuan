package _17_Phone;

import java.util.ArrayList;
import java.util.List;

public class Phone_Service {
   private List<Phone_ChinhHang> phoneChinhHangs = new ArrayList<>();
   private List<Phone_XachTay> phoneXachTays = new ArrayList<>();

    public void add(Phone phone){
        if(phone instanceof Phone_ChinhHang){
            phoneChinhHangs.add((Phone_ChinhHang) phone);
        } else if (phone instanceof Phone_XachTay) {
            phoneXachTays.add((Phone_XachTay) phone);
            
        }
    }
    public void display(){
        System.out.println("Dien thoai chinh hang");
        for (Phone phonechinhhang: phoneChinhHangs) {
            System.out.println(phonechinhhang);
        }
        System.out.println("Dien thoai xach tay");
        for (Phone phonexachtay: phoneXachTays) {
            System.out.println(phonexachtay);
        }
    }
     public void delete(boolean phoneChinhHang, int id){
        if(phoneChinhHang){
            phoneChinhHangs.removeIf(e -> e.getId() == id);
        }else
        {
            phoneXachTays.removeIf(e -> e.getId() == id);
        }

     }
    public void update(boolean isChinhHang, Phone phoneToUpdate) {
        if (isChinhHang) {
            // Cập nhật điện thoại chính hãng
            for (int i = 0; i < phoneChinhHangs.size(); i++) {
                if (phoneChinhHangs.get(i).getId() == phoneToUpdate.getId()) {
                    phoneChinhHangs.set(i, (Phone_ChinhHang) phoneToUpdate);
                    break;
                }
            }
        } else {
            // Cập nhật điện thoại xách tay
            for (int i = 0; i < phoneXachTays.size(); i++) {
                if (phoneXachTays.get(i).getId() == phoneToUpdate.getId()) {
                    phoneXachTays.set(i, (Phone_XachTay) phoneToUpdate);
                    break;
                }
            }
        }
    }

    public List<Phone> searchbyPrice(boolean phoneChinhHang, double price) {
        List<Phone> result = new ArrayList<>();
        if (phoneChinhHang) {
            for (int i = 0; i < phoneChinhHangs.size(); i++) {
                // So sánh giá với một ngưỡng chấp nhận được (ví dụ: 0.01) để tránh vấn đề với số thực
                if (Math.abs(phoneChinhHangs.get(i).getPrice() - price) < 0.01) {
                    result.add(phoneChinhHangs.get(i));
                }
            }
        } else {
            // Xử lý tương tự cho danh sách điện thoại xách tay
            for (int i = 0; i < phoneXachTays.size(); i++) {
                if (Math.abs(phoneXachTays.get(i).getPrice() - price) < 0.01) {
                    result.add(phoneXachTays.get(i));
                }
            }
        }
        return result;
    }

    public void searchByName(String name) {


        // Tìm kiếm trong danh sách điện thoại chính hãng
        for (Phone_ChinhHang phone : phoneChinhHangs) {
            if (phone.getName().indexOf(name) >=0) {
                System.out.println(phone);
            }
        }

        // Tìm kiếm trong danh sách điện thoại xách tay
        for (Phone_XachTay phone : phoneXachTays) {
            if (phone.getName().indexOf(name) >= 0) {
                System.out.println(phone);
            }
        }
    }





}
