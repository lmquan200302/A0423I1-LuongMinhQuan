package JAVAEXAM;

import EXAM.SanPhamXuatKhau;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        DienThoaiDichVu dienThoaiDichVu = new DienThoaiDichVu();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("""
                    Chon chuc nang theo so
                    1.Them moi
                    2.Xoa san pham theo id
                    3.Xem danh sach dien thoai
                    4.Tim kiem theo name
                    5.Luu file
                    6.Doc file Dien Thoai Chinh Hang
                    7.Doc file Dien  Xach Tay
                    ---> moi chon
                    """);

            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("""
                            Chon loai dien thoai de them
                            1.Dien thoai chinh hang
                            2.Dien thoai xach tay""");
//                    String ten, double gia, int soluong, String nhasx
//                    private int thoigianbh;
//                    private String phamvibh;
                  int choiceSP = scanner.nextInt();
                  scanner.nextLine();

                  if(choiceSP ==1){
                      System.out.println("Nhap thong tin dien thoai chinh hang");
                      System.out.println("Nhap ten san pham");
                      String ten = scanner.nextLine();

                      System.out.println("Nhap gia san pham");
                      double giasp = Double.parseDouble(scanner.nextLine());

                      System.out.println("Nhap so luong san pham");
                      int soluong = Integer.parseInt(scanner.nextLine());

                      System.out.println("Nhap nha san xuat dien thoai chinh hang");
                      String nhasx = scanner.nextLine();

                      System.out.println("Nhap thoi gian bao hanh");
                      int thoigianbh = Integer.parseInt(scanner.nextLine());

                      System.out.println("Nhap pham vi bao hanh");
                      String phamvibh = scanner.nextLine();

                      DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang(ten,giasp,soluong,nhasx,thoigianbh,phamvibh);
                      dienThoaiDichVu.add(dienThoaiChinhHang);
                  }

                  if(choiceSP ==2 ){
//                      private String quocgia;
//                      private String trangthai;
                      System.out.println("Nhap thong tin dien thoai xach tay");
                      System.out.println("Nhap ten san pham");
                      String ten = scanner.nextLine();

                      System.out.println("Nhap gia san pham");
                      double giasp = Double.parseDouble(scanner.nextLine());

                      System.out.println("Nhap so luong san pham");
                      int soluong = Integer.parseInt(scanner.nextLine());

                      System.out.println("Nhap nha san xuat dien thoai chinh hang");
                      String nhasx = scanner.nextLine();

                      System.out.println("Nhap quoc gia");
                      String quocgia = scanner.nextLine();

                      System.out.println("Nhap trang thai");
                      String trangtai = scanner.nextLine();

                      DienThoaiXayTay dienThoaiXayTay = new DienThoaiXayTay(ten,giasp,soluong,nhasx,quocgia,trangtai);
                      dienThoaiDichVu.add(dienThoaiXayTay);

                  }

                    break;
                case 2:
                    System.out.println("""
                            Chon loai dien thoai can xoa
                            1.Dien thoai chinh hang
                            2.Dien thoai xach tay
                            ---> moi ban chon:
                            """);
                    int choiceDeleteDT = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhap id san pham can xoa");
                    int idDelete = Integer.parseInt(scanner.nextLine());
                    if(choiceDeleteDT==1){
                        dienThoaiDichVu.deleteById(true,idDelete);
                    } else if (choiceDeleteDT==2) {
                        dienThoaiDichVu.deleteById(false,idDelete);
                    }else {
                        System.out.println("Nhap sai");
                    }


                    break;
                case 3:
                    System.out.println("Xem ds dien thoai");
                    dienThoaiDichVu.display();
                    break;
                case 4:
                    System.out.println("Tim san pham theo ten");
                    System.out.println("Nhap ten san pham can tim");
                    String name = scanner.nextLine();
                    dienThoaiDichVu.searchByName(name);
                    break;
                case 5:
                    System.out.println("Luu file");
                    dienThoaiDichVu.saveFile();
                    break;
                case 6:
                    System.out.println("doc file spxk");
                    List<DienThoaiChinhHang> dienThoaiChinhHangList = null;
                    try {
                        dienThoaiChinhHangList = dienThoaiDichVu.readFileDTCH();
                        System.out.println("danh sach sp doc tu file");
                        for (DienThoaiChinhHang dienThoaiChinhHang : dienThoaiChinhHangList) {
                            System.out.println(dienThoaiChinhHang);
                        }
                    } catch (IOException e) {
                        System.err.println("loi " + e.getMessage());
                    }
                    break;


                case 7:
                    System.out.println("Doc file dien thoai xach tay");

                    List<DienThoaiXayTay> dienThoaiXayTayList = null;
                    try {
                        dienThoaiXayTayList = dienThoaiDichVu.readFileDTXT();
                        System.out.println("danh sach sp doc tu file");
                        for (DienThoaiXayTay dienThoaiXayTay : dienThoaiXayTayList) {
                            System.out.println(dienThoaiXayTay);
                        }
                    } catch (IOException e) {
                        System.err.println("loi " + e.getMessage());
                    }
                    break;
                case 8:
                    System.out.println("THOAT");
                    break;
                default:
                    System.out.println("Nhap khong hop le");
            }

        }while (choice != 8);
    }

}
