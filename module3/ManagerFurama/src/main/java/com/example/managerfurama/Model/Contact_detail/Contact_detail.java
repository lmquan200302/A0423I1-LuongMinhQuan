package com.example.managerfurama.Model.Contact_detail;

public class Contact_detail {
    private int mahdct;
    private int mahd;
    private int madvdikem;
    private int soluong;

    public Contact_detail() {
    }

    public Contact_detail(int mahdct, int mahd, int madvdikem, int soluong) {
        this.mahdct = mahdct;
        this.mahd = mahd;
        this.madvdikem = madvdikem;
        this.soluong = soluong;
    }

    public int getMahdct() {
        return mahdct;
    }

    public void setMahdct(int mahdct) {
        this.mahdct = mahdct;
    }

    public int getMahd() {
        return mahd;
    }

    public void setMahd(int mahd) {
        this.mahd = mahd;
    }

    public int getMadvdikem() {
        return madvdikem;
    }

    public void setMadvdikem(int madvdikem) {
        this.madvdikem = madvdikem;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
}
