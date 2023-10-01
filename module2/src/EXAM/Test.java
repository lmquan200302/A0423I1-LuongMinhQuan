package EXAM;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws IOException {
        SanPhamService sanPhamService = new SanPhamService();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do{


            System.out.println("""
                   ===MENU===
                   1.add
                   2.xoa theo id
                   3.tim theo ten
                   4.hien thi
                   5.luu file 
                   6.doc file spxk
                   7.doc file spnk
                   8.thoat
                   
       
                   -> moi ban chon chuc nang
                    """);
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("""
                            chon san pham can them
                            1.san pham xuat khau
                            2.san pham nhap khau
                            """);
                    int choicesp = Integer.parseInt(scanner.nextLine());
                    if(choicesp ==1){
                        System.out.println("Nhap thong san pham xuat khau");



                        System.out.println("Nhap code san pham");
                        int code = Integer.parseInt(scanner.nextLine());

                        System.out.println("Nhap ten san pham");
                        String name = scanner.nextLine();

                        System.out.println("Nhap gia san pham ");
                        double price = Double.parseDouble(scanner.nextLine());

                        System.out.println("nhap nha phat hanh");
                        String made = scanner.nextLine();

                        System.out.println("Nhap gia sham xk");
                        double giaxk = Double.parseDouble(scanner.nextLine());

                        System.out.println("Nhap ten sam pham xk");
                        String tenspxk = scanner.nextLine();

                        SanPhamXuatKhau sanPhamXuatKhau = new SanPhamXuatKhau(code,name,price,made,giaxk,tenspxk);
                        sanPhamService.add(sanPhamXuatKhau);
                    }
                    else if (choicesp ==2) {
                        System.out.println("Nhap thong san pham nhap khau");



                        System.out.println("Nhap code san pham");
                        int code = Integer.parseInt(scanner.nextLine());

                        System.out.println("Nhap ten san pham");
                        String name = scanner.nextLine();

                        System.out.println("Nhap gia san pham ");
                        double price = Double.parseDouble(scanner.nextLine());

                        System.out.println("nhap nha phat hanh");
                        String made = scanner.nextLine();
//
                        System.out.println("Nhap gia san pham nk");
                        double giank = Double.parseDouble(scanner.nextLine());

                        System.out.println("Nhap thue nk");
                        double thuenk = Double.parseDouble(scanner.nextLine());

                        System.out.println("Nhap ma so thue");
                        String masothue = scanner.nextLine();

                        SanPhapNhapKhau sanPhapNhapKhau = new SanPhapNhapKhau(code,name,price,made,giank,thuenk,masothue);
                        sanPhamService.add(sanPhapNhapKhau);
                    }
                    else {
                        System.out.println("Nhap khong hop le");
                    }
                    break;
                case 2:
                    System.out.println("xoa san pham");
                    System.out.println("""
                            chon loai sp can xoa
                            1. sp xuat khau
                            2. sp nhap khau
                            => moi ban chon: 
                            """);
                    int choiceDeleteSP = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhap id san pham de xoa: ");
                    int idDelete = Integer.parseInt(scanner.nextLine());
                    if(choiceDeleteSP ==1){
                        sanPhamService.deleteByID(true,idDelete);
                    } else if (choiceDeleteSP ==2) {
                        sanPhamService.deleteByID(false,idDelete);
                    }else {
                        System.out.println("nhap sai");
                    }
                    break;
                case 3:
                    System.out.println("tim theo ten");
                    System.out.println("Nhap ten san pham can tim");
                    String name = scanner.nextLine();
                    sanPhamService.searchByName(name);
                    break;
                case 4:
                    System.out.println("hienthi");
                    sanPhamService.display();
                    break;
                case 5:
                    sanPhamService.saveFile();
                    System.out.println("luu vao file thanh cong");
                    break;
                case 6:
                    System.out.println("doc file spxk");
                    List<SanPhamXuatKhau> sanPhamXuatKhauList = null;
                    try {
                        sanPhamXuatKhauList = sanPhamService.readFileSPXK();
                        System.out.println("danh sach sp doc tu file");
                        for (SanPhamXuatKhau sanPhamXuatKhau : sanPhamXuatKhauList) {
                            System.out.println(sanPhamXuatKhau);
                        }
                    } catch (IOException e) {
                        System.err.println("Lỗi khi đọc tập tin: " + e.getMessage());
                    }
                    break;
                case 7:
                    System.out.println("doc file spnk");
                    List<SanPhapNhapKhau> sanPhapNhapKhauList = null;
                    sanPhapNhapKhauList = sanPhamService.readFileSPNK();
                    System.out.println("sach sach san pham doc tu tep");
                    for(SanPhapNhapKhau sanPhapNhapKhau:sanPhapNhapKhauList){
                        System.out.println(sanPhapNhapKhau);
                    }

                case 8:
                    System.out.println("thoat thanh cong");
                    break;
                default:
                    System.out.println("Nhap khong hop le");
                    break;
            }
        }
        while (choice != 8);
    }
}
