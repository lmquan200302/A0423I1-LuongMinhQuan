package com.example.furama.Model;

import java.util.Date;

public class Customer {
    private int MaKhachHang;
    private int MaLoaiKhach;
    private String HoTen;
    private Date NgaySinh;
    private boolean GioiTinh;
    private String CCCD;
    private String SDT;
    private String Email;
    private String DiaChi;



    public Customer(int maKhachHang, int maLoaiKhach, String hoTen, Date ngaySinh, boolean gioiTinh, String CCCD, String SDT, String email, String diaChi) {
        MaKhachHang = maKhachHang;
        MaLoaiKhach = maLoaiKhach;
        HoTen = hoTen;
        NgaySinh = ngaySinh;
        GioiTinh = gioiTinh;
        this.CCCD = CCCD;
        this.SDT = SDT;
        Email = email;
        DiaChi = diaChi;
    }

    public Customer() {

    }



    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public int getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        MaKhachHang = maKhachHang;
    }

    public int getMaLoaiKhach() {
        return MaLoaiKhach;
    }

    public void setMaLoaiKhach(int maLoaiKhach) {
        MaLoaiKhach = maLoaiKhach;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
