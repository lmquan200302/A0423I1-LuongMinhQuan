package com.example.managerfurama.Model.Contact;

import java.util.Date;

public class Contact {
    private int mahopdong;
    private Date ngaylenhopdong;
    private Date ngayketthuchopdong;
    private double tiendatcoc;
    private int manhanvien;
    private int makhachhang;
    private int madichvu;

    public Contact() {
    }

    public Contact(int mahopdong, Date ngaylenhopdong, Date ngayketthuchopdong, double tiendatcoc, int manhanvien, int makhachhang, int madichvu) {
        this.mahopdong = mahopdong;
        this.ngaylenhopdong = ngaylenhopdong;
        this.ngayketthuchopdong = ngayketthuchopdong;
        this.tiendatcoc = tiendatcoc;
        this.manhanvien = manhanvien;
        this.makhachhang = makhachhang;
        this.madichvu = madichvu;
    }

    public int getMahopdong() {
        return mahopdong;
    }

    public void setMahopdong(int mahopdong) {
        this.mahopdong = mahopdong;
    }

    public Date getNgaylenhopdong() {
        return ngaylenhopdong;
    }

    public void setNgaylenhopdong(Date ngaylenhopdong) {
        this.ngaylenhopdong = ngaylenhopdong;
    }

    public Date getNgayketthuchopdong() {
        return ngayketthuchopdong;
    }

    public void setNgayketthuchopdong(Date ngayketthuchopdong) {
        this.ngayketthuchopdong = ngayketthuchopdong;
    }

    public double getTiendatcoc() {
        return tiendatcoc;
    }

    public void setTiendatcoc(double tiendatcoc) {
        this.tiendatcoc = tiendatcoc;
    }

    public int getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(int manhanvien) {
        this.manhanvien = manhanvien;
    }

    public int getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(int makhachhang) {
        this.makhachhang = makhachhang;
    }

    public int getMadichvu() {
        return madichvu;
    }

    public void setMadichvu(int madichvu) {
        this.madichvu = madichvu;
    }
}
