package com.example.thuvien.Model;

public class Hocsinh {
    private int mahocsinh;
    private String hoten;
    private String lop;

    public Hocsinh() {
    }

    public Hocsinh(int mahocsinh, String hoten, String lop) {
        this.mahocsinh = mahocsinh;
        this.hoten = hoten;
        this.lop = lop;
    }

    public int getMahocsinh() {
        return mahocsinh;
    }

    public void setMahocsinh(int mahocsinh) {
        this.mahocsinh = mahocsinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
}
