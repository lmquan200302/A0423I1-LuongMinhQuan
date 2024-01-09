package com.example.exam_luongminhquan.Model;

public class Sach {
    private int masach;
    private String tensach;
    private String tacgia;
    private String mota;
    private int soluong;

    public Sach() {
    }

    public Sach(int masach, String tensach, String tacgia, String mota, int soluong) {
        this.masach = masach;
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.mota = mota;
        this.soluong = soluong;
    }

    public int getMasach() {
        return masach;
    }

    public void setMasach(int masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
}
