package Sinhvien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int luachon = 0;
        do{
            System.out.println("MENU");
            System.out.println("---------------------------");
            System.out.println("1.Them sinh vien");
            System.out.println("2.In ra danh sach sinh vien");
            System.out.println("3.Kiem tra danh sach sinh vien co rong hay khong");
            System.out.println("4.Lay ra so luong sinh vien trong danh sach");
            System.out.println("5.Lam rong danh sach sinh bien");
            System.out.println("6.Kiem ttra sinh vien");
            System.out.println("7.Xoa sinh vien");
            System.out.println("8.Tim kiem sinh vien");
            System.out.println("9.Xuat ra danh sach sinh vien co diem tu cao den thap");
            System.out.println("0.Thoat chuong trinh");
            luachon = sc.nextInt();

            switch (luachon){
                case 1:
                    System.out.println("Nhap MSV:"); String maSinhVien = sc.nextLine();
                    System.out.println("Nhap Ho va Ten:"); String hoVaTen = sc.nextLine();
                    System.out.println("Nhap Nam sinh:"); int namSinh = sc.nextInt();
                    System.out.println("Nhap diem trung binh:"); float diemTrungBinh = sc.nextFloat();


                    SinhVien sv = new SinhVien(maSinhVien,hoVaTen,namSinh,diemTrungBinh);
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:


            }
        }while (luachon != 0);
    }
}
