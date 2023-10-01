package _18_Bank;

import java.util.ArrayList;
import java.util.List;

public class TaiKhoan_Service {
    List<TaiKhoan_TietKiem> taiKhoanTietKiems = new ArrayList<>();
    List<TaiKhoan_TinDung> taiKhoanTinDungs = new ArrayList<>();

    public void add(TaiKhoan taiKhoan){
        if(taiKhoan instanceof TaiKhoan_TietKiem){
            taiKhoanTietKiems.add((TaiKhoan_TietKiem) taiKhoan);
        }
        else if(taiKhoan instanceof TaiKhoan_TinDung){
            taiKhoanTinDungs.add((TaiKhoan_TinDung) taiKhoan);
        }
    }
    public void display(){
        System.out.println("Tai khoan tiet kiem");
        for(TaiKhoan taiKhoan : taiKhoanTietKiems){
            System.out.println(taiKhoan);
        }
        System.out.println("Tai khoan tin dung");
        for(TaiKhoan taiKhoan : taiKhoanTinDungs){
            System.out.println(taiKhoan);
        }
    }

    public void delete(boolean tkTietkiem,int id){
        if(tkTietkiem){
            taiKhoanTietKiems.removeIf(e -> e.getId() == id);
        }else {
            taiKhoanTinDungs.removeIf(e -> e.getId() == id);
        }
    }

    public void searchbyName(String name) {
        for (TaiKhoan_TietKiem taikhoantk : taiKhoanTietKiems) {
            if (taikhoantk.getName().contains(name)) {
                System.out.println(taikhoantk);
            }
        }

        for (TaiKhoan_TinDung taikhoantd : taiKhoanTinDungs) {
            if (taikhoantd.getName().contains(name)) {
                System.out.println(taikhoantd);
            }
        }
    }

}

