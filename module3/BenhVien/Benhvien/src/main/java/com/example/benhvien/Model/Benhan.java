package com.example.benhvien.Model;

public class Benhan {
    private int mabenhan;
    private int mabenhnhan;
    private String tenbenhnhan;
    private String ngaynhapvien;
    private String ngayravien;
    private String lydo;

    public Benhan() {
    }

    public Benhan(int mabenhan, int mabenhnhan, String tenbenhnhan, String ngaynhapvien, String ngayravien, String lydo) {
        this.mabenhan = mabenhan;
        this.mabenhnhan = mabenhnhan;
        this.tenbenhnhan = tenbenhnhan;
        this.ngaynhapvien = ngaynhapvien;
        this.ngayravien = ngayravien;
        this.lydo = lydo;
    }

    public int getMabenhan() {
        return mabenhan;
    }

    public void setMabenhan(int mabenhan) {
        this.mabenhan = mabenhan;
    }

    public int getMabenhnhan() {
        return mabenhnhan;
    }

    public void setMabenhnhan(int mabenhnhan) {
        this.mabenhnhan = mabenhnhan;
    }

    public String getTenbenhnhan() {
        return tenbenhnhan;
    }

    public void setTenbenhnhan(String tenbenhnhan) {
        this.tenbenhnhan = tenbenhnhan;
    }

    public String getNgaynhapvien() {
        return ngaynhapvien;
    }

    public void setNgaynhapvien(String ngaynhapvien) {
        this.ngaynhapvien = ngaynhapvien;
    }

    public String getNgayravien() {
        return ngayravien;
    }

    public void setNgayravien(String ngayravien) {
        this.ngayravien = ngayravien;
    }

    public String getLydo() {
        return lydo;
    }

    public void setLydo(String lydo) {
        this.lydo = lydo;
    }
}
