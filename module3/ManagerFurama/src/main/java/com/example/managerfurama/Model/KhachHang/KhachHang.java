package com.example.managerfurama.Model.KhachHang;

public class KhachHang {
    private int makhachhang;
    private int maloaikhach;
    private String hoten;
    private String ngaysinh;
    private Boolean gioitinh;
    private String cccd;
    private String sdt;


    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    private String email;
    private String diachi;

    public KhachHang() {
    }

    public KhachHang(int makhachhang, int maloaikhach, String hoten,String ngaysinh, Boolean gioitinh, String cccd, String sdt, String email, String diachi) {
        this.makhachhang = makhachhang;
        this.maloaikhach = maloaikhach;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.cccd = cccd;
        this.sdt = sdt;
        this.email = email;
        this.diachi = diachi;
    }

    public int getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(int makhachhang) {
        this.makhachhang = makhachhang;
    }

    public int getMaloaikhach() {
        return maloaikhach;
    }

    public void setMaloaikhach(int maloaikhach) {
        this.maloaikhach = maloaikhach;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public Boolean getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(Boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
}
