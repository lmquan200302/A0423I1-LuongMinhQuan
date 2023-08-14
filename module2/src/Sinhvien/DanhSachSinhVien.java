package Sinhvien;

import java.util.ArrayList;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhsach;

    public DanhSachSinhVien(ArrayList<SinhVien> danhsach) {
        this.danhsach = danhsach;
    }

    public DanhSachSinhVien() {
        this.danhsach = new ArrayList<SinhVien>();
    }
    public void themSinhVien(SinhVien sv){
        this.danhsach.add(sv);
    }
}
