package com.example.thuvien.Model;

public class Themuonsach {
    private int mamuonsach;
    private int masach;
    private String tensach;
    private int mahocsinh;
    private String tenhocsinh;
    private boolean trangthai;
    private String ngaymuon;
    private String ngaytra;

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTenhocsinh() {
        return tenhocsinh;
    }

    public void setTenhocsinh(String tenhocsinh) {
        this.tenhocsinh = tenhocsinh;
    }

    public Themuonsach() {
    }

    public Themuonsach(int mamuonsach, int masach, String tensach, int mahocsinh,String tenhocsinh, boolean trangthai, String ngaymuon, String ngaytra) {
        this.mamuonsach = mamuonsach;
        this.masach = masach;
        this.tensach = tensach;
        this.mahocsinh = mahocsinh;
        this.tenhocsinh = tenhocsinh;
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
