package com.example.exam_luongminhquan.Model;

public class Muonsach {
    private int mamuonsach;
    private int masach;
    private int mahocsinh;
    private boolean trangthai;
    private String ngaymuon;
    private String ngaytra;

    public Muonsach() {
    }

    public Muonsach(int mamuonsach, int masach, int mahocsinh, boolean trangthai, String ngaymuon, String ngaytra) {
        this.mamuonsach = mamuonsach;
        this.masach = masach;
        this.mahocsinh = mahocsinh;
        this.trangthai = trangthai;
        this.ngaymuon = ngaymuon;
        this.ngaytra = ngaytra;
    }

    public int getMamuonsach() {
        return mamuonsach;
    }

    public void setMamuonsach(int mamuonsach) {
        this.mamuonsach = mamuonsach;
    }

    public int getMasach() {
        return masach;
    }

    public void setMasach(int masach) {
        this.masach = masach;
    }

    public int getMahocsinh() {
        return mahocsinh;
    }

    public void setMahocsinh(int mahocsinh) {
        this.mahocsinh = mahocsinh;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }

    public String getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(String ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public String getNgaytra() {
        return ngaytra;
    }

    public void setNgaytra(String ngaytra) {
        this.ngaytra = ngaytra;
    }
}
