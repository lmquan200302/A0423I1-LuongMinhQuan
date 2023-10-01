package _17_Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phone_Service phoneService = new Phone_Service();
        Scanner scanner = new Scanner(System.in);
        System.out.println(""" 
                ========MENU========
                1.add
                2.update
                3.delete
                4.display
                5.search by price 
                6.search by name
                ====================
                """

        );
        int input;
        do {
            System.out.print("INPUT:");
             input = scanner.nextInt();
            switch (input){
                case 1:
                    System.out.println("1.dien thoai chinh hang");
                    System.out.println("2.Dien thoai xach tay");



                    int choice = 0;
                    System.out.println("moi ban chon");
                    choice = scanner.nextInt();
                    if(choice == 1 ){
                        System.out.println("Nhap thong tin Dien thoai chinh hang");
                        System.out.print("ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("NAME: ");
                        String name = scanner.nextLine();
                        System.out.print("PRICE: ");
                        Double price = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("MADE: ");
                        String made = scanner.nextLine();
                        System.out.print("thoi gian bao hanh");
                        String time = scanner.nextLine();
                        System.out.print("ID bao hanh: ");
                        int idbaohanh = scanner.nextInt();
                        Phone_ChinhHang phoneChinhHang = new Phone_ChinhHang(id,name,price,made,time,idbaohanh);
                        phoneService.add(phoneChinhHang);

                    } else if (choice == 2) {
                        System.out.println("Nhap thong tin Dien thoai xach tay");
                        System.out.print("ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("NAME: ");
                        String name = scanner.nextLine();
                        System.out.print("PRICE: ");
                        Double price = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("MADE: ");
                        String made = scanner.nextLine();
                        System.out.println("Country:");
                        String country = scanner.nextLine();
                        System.out.println("status");
                        String status = scanner.nextLine();
                        Phone_XachTay phoneXachTay = new Phone_XachTay(id,name,price,made,country,status);
                        phoneService.add(phoneXachTay);

                    }

                    break;
                case 2:
                    System.out.println("1. Cập nhật điện thoại chính hãng");
                    System.out.println("2. Cập nhật điện thoại xách tay");
                    System.out.print("Mời bạn chọn loại điện thoại để cập nhật: ");
                    int updateChoice = scanner.nextInt();
                    scanner.nextLine(); // Đọc dòng mới sau khi nhập lựa chọn

                    System.out.print("Nhập ID điện thoại cần cập nhật: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Đọc dòng mới sau khi nhập ID

                    System.out.print("Nhập tên điện thoại mới: ");
                    String newName = scanner.nextLine();
                    System.out.print("Nhập giá điện thoại mới: ");
                    double newPrice = scanner.nextDouble();
                    scanner.nextLine(); // Đọc dòng mới sau khi nhập giá
                    System.out.print("Nhập nơi sản xuất điện thoại mới: ");
                    String newMade = scanner.nextLine();
                    Phone phoneToUpdate;
                    if (updateChoice == 1) {
                        System.out.print("Nhập thời gian bảo hành mới: ");
                        String newTimeBaoHanh = scanner.nextLine();
                        System.out.print("Nhập ID bảo hành mới: ");
                        int newIdBaoHanh = scanner.nextInt();
                        phoneToUpdate = new Phone_ChinhHang(updateId, newName, newPrice, newMade, newTimeBaoHanh, newIdBaoHanh);
                    } else if (updateChoice == 2) {
                        System.out.print("Nhập quốc gia mới: ");
                        String newCountry = scanner.nextLine();
                        System.out.print("Nhập trạng thái mới: ");
                        String newStatus = scanner.nextLine();
                        phoneToUpdate = new Phone_XachTay(updateId, newName, newPrice, newMade, newCountry, newStatus);
                    } else {
                        System.out.println("Lựa chọn không hợp lệ.");
                        continue; // Quay lại vòng lặp để chọn lại
                    }

                    phoneService.update(updateChoice == 1, phoneToUpdate); // Cập nhật điện thoại
                    break;
                case 3:
                    System.out.println("1. Xóa điện thoại chính hãng");
                    System.out.println("2. Xóa điện thoại xách tay");
                    System.out.print("Mời bạn chọn loại điện thoại để xóa: ");
                    int deleteChoice = scanner.nextInt();
                    System.out.print("Nhập ID điện thoại cần xóa: ");
                    int deleteId = scanner.nextInt();

                    if (deleteChoice == 1) {
                        phoneService.delete(true, deleteId); // Xóa điện thoại chính hãng
                    } else if (deleteChoice == 2) {
                        phoneService.delete(false, deleteId); // Xóa điện thoại xách tay
                    } else {
                        System.out.println("Lựa chọn không hợp lệ.");
                    }
                    break;
                case 4:
                    System.out.println("Danh sach dien thoai");
                    phoneService.display();
                    break;
                case 5: System.out.print("Bạn muốn tìm kiếm theo giá. Nhập giá cần tìm kiếm: ");
                    double priceToSearch = scanner.nextDouble();
                    scanner.nextLine(); // Đọc dòng mới sau khi nhập giá

                    System.out.print("Bạn muốn tìm kiếm trong danh sách điện thoại chính hãng (1) hay xách tay (2): ");
                    boolean isChinhHang = (scanner.nextInt() == 1);
                    scanner.nextLine(); // Đọc dòng mới sau khi nhập lựa chọn

                    List<Phone> searchResult = phoneService.searchbyPrice(isChinhHang, priceToSearch);
                    if (searchResult.isEmpty()) {
                        System.out.println("Không tìm thấy điện thoại phù hợp.");
                    } else {
                        System.out.println("Các điện thoại phù hợp:");
                        for (Phone phone : searchResult) {
                            System.out.println(phone);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Search by name");
                    System.out.print("Nhap ten: ");
                    String searchname = scanner.nextLine();
                    phoneService.searchByName(searchname);
                    break;
                default:
                    System.out.println("Gia tri khong hop le");
            }

        }while (input != 0);


    }

}
