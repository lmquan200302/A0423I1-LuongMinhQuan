package com.example.managerfurama.Model.NhanVien;



    public class NhanVien {
        private int manhanvien;
        private String hoten;
        private String ngaysinh;
        private String cccd;
        private double luong;
        private String sdt;
        private String email;
        private String diachi;
        private int mavitri;
        private int matrinhdo;
        private int mabophan;

        public NhanVien() {
        }

        public NhanVien(int manhanvien, String hoten, String ngaysinh, String cccd, double luong, String sdt, String email, String diachi, int mavitri, int matrinhdo, int mabophan) {
            this.manhanvien = manhanvien;
            this.hoten = hoten;
            this.ngaysinh = ngaysinh;
            this.cccd = cccd;
            this.luong = luong;
            this.sdt = sdt;
            this.email = email;
            this.diachi = diachi;
            this.mavitri = mavitri;
            this.matrinhdo = matrinhdo;
            this.mabophan = mabophan;
        }

        public int getManhanvien() {
            return manhanvien;
        }

        public void setManhanvien(int manhanvien) {
            this.manhanvien = manhanvien;
        }

        public String getHoten() {
            return hoten;
        }

        public void setHoten(String hoten) {
            this.hoten = hoten;
        }

        public String getNgaysinh() {
            return ngaysinh;
        }

        public void setNgaysinh(String ngaysinh) {
            this.ngaysinh = ngaysinh;
        }

        public String getCccd() {
            return cccd;
        }

        public void setCccd(String cccd) {
            this.cccd = cccd;
        }

        public double getLuong() {
            return luong;
        }

        public void setLuong(double luong) {
            this.luong = luong;
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

        public int getMavitri() {
            return mavitri;
        }

        public void setMavitri(int mavitri) {
            this.mavitri = mavitri;
        }

        public int getMatrinhdo() {
            return matrinhdo;
        }

        public void setMatrinhdo(int matrinhdo) {
            this.matrinhdo = matrinhdo;
        }

        public int getMabophan() {
            return mabophan;
        }

        public void setMabophan(int mabophan) {
            this.mabophan = mabophan;
        }
    }



