package _18_Bank;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<TaiKhoan_TietKiem> taiKhoanTietKiemList = new ArrayList<>();
    static List<TaiKhoan_TinDung> taiKhoanTinDungList = new ArrayList<>();
    static String path = "D:\\codegym\\A0423I1-LuongMinhQuan\\module2\\src\\_18_Bank\\TaiKhoan.csv";
    static TaiKhoan_Service taiKhoanService = new TaiKhoan_Service();


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);


        System.out.println("=======MENU======");
        System.out.println("1. Thêm mới");
        System.out.println("2. Hiển thị");
        System.out.println("3. Xóa");
        System.out.println("4. Tìm kiếm theo tên");
        System.out.println("5. Lưu file");
        System.out.println("6. Đọc file");
        System.out.println("0. Thoát");
        System.out.println("===================");

        int choice;
        do {
            System.out.println("Mời bạn chọn");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Chọn loại Tài Khoản");
                    System.out.println("1. Tài khoản tiết kiệm");
                    System.out.println("2. Tài khoản tín dụng");
                    int choiceLoaitaikhoan = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    if (choiceLoaitaikhoan == 1) {
                        System.out.println("Nhập tên tài khoản tiết kiệm");
                        String name = scanner.nextLine();

                        System.out.println("Nhập ngày/tháng/năm sinh tài khoản tiết kiệm");
                        String birthday = scanner.nextLine();

                        System.out.println("Nhập số dư tài khoản tiết kiệm");
                        double sodu = Double.parseDouble(scanner.nextLine());

                        System.out.println("Nhập chi nhánh tài khoản tiết kiệm");
                        String chinhanh = scanner.nextLine();

                        System.out.println("Nhập STK tiết kiệm");
                        int stk = Integer.parseInt(scanner.nextLine());

                        System.out.println("Nhập trạng thái");
                        String status = scanner.nextLine();


                        TaiKhoan_TietKiem taiKhoanTietKiem = new TaiKhoan_TietKiem(name, birthday, sodu, chinhanh, stk, status);
                        taiKhoanService.add(taiKhoanTietKiem);
                        taiKhoanTietKiemList.add(taiKhoanTietKiem); // Thêm tài khoản vào danh sách
                    }
                    if (choiceLoaitaikhoan == 2) {
                        System.out.println("Nhập tên tài khoản tín dụng");
                        String name = scanner.nextLine();

                        System.out.println("Nhập ngày/tháng/năm sinh tài khoản tín dụng");
                        String birthday = scanner.nextLine();

                        System.out.println("Nhập số dư tài khoản tín dụng");
                        double sodu = Double.parseDouble(scanner.nextLine());

                        System.out.println("Nhập chi nhánh tài khoản tín dụng");
                        String chinhanh = scanner.nextLine();

                        System.out.println("Nhập số thẻ tín dụng");
                        int sothe = Integer.parseInt(scanner.nextLine());

                        System.out.println("Nhập mã PIN");
                        String mapin = scanner.nextLine();

                        TaiKhoan_TinDung taiKhoanTinDung = new TaiKhoan_TinDung(name, birthday, sodu, chinhanh, sothe, mapin);
                        taiKhoanService.add(taiKhoanTinDung);
                        taiKhoanTinDungList.add(taiKhoanTinDung); // Thêm tài khoản vào danh sách
                    }
                    break;
                case 2:
                    System.out.println("Tài khoản của bạn là:");
                     taiKhoanService.display();
                    break;

                case 3:
                    System.out.println(""" 
                            Chọn loại Tài Khoản để xóa
                            1. Tài khoản tiết kiệm
                            2. Tài khoản tín dụng
                            ---> Mời bạn chọn:
                            """);
                    int choiceDeleteTk = scanner.nextInt();
                    System.out.println("Nhập ID tài khoản cần xóa");
                    int deleteid = scanner.nextInt();
                    scanner.nextLine();
                    if (choiceDeleteTk == 1) {
                        taiKhoanService.delete(true, deleteid);
                        // Xóa tài khoản khỏi danh sách
                        taiKhoanTietKiemList.removeIf(tk -> tk.getId() == deleteid);
                    } else if (choiceDeleteTk == 2) {
                        taiKhoanService.delete(false, deleteid);
                        // Xóa tài khoản khỏi danh sách
                        taiKhoanTinDungList.removeIf(tk -> tk.getId() == deleteid);
                    } else {
                        System.out.println("Nhập sai");
                    }
                    break;
                case 4:
                    System.out.println("Tìm kiếm tài khoản theo tên");
                    System.out.println("Nhập tên");
                    String searchName = scanner.nextLine();
                    taiKhoanService.searchbyName(searchName);
                    break;
                case 5:
                    saveFile();
                    System.out.println("Lưu file thành công");
                    break;
                case 6:
                    readFile();
                    System.out.println("Đọc file thành công");
                    break;
            }
        } while (choice != 0);
    }

    public static void saveFile() throws IOException {
        System.out.println("bat dau luu file");
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(path);
            for(TaiKhoan_TietKiem taiKhoanTietKiem : taiKhoanTietKiemList){
                String line = taiKhoanTietKiem.getFileLine();

                //chuyen string sang byte
                byte[] b = line.getBytes("utf8");
                //save
                fileOutputStream.write(b);


            }
            for (TaiKhoan_TinDung taiKhoanTinDung: taiKhoanTinDungList) {
                String line = taiKhoanTinDung.getFileLine();
                byte[] bytes = line.getBytes("utf8");
                fileOutputStream.write(bytes);


            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            if(fileOutputStream != null){
                fileOutputStream.close();
            }

        }
    }
    public static void readFile() {
        FileInputStream fileInputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileInputStream = new FileInputStream(path);
            inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            bufferedReader = new BufferedReader(inputStreamReader);

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.isEmpty()) {
                    continue; // Bỏ qua các dòng trống
                }
                String[] parts = line.split(","); // Phân chia dữ liệu bằng dấu phẩy (CSV)
                if (parts.length != 7) {
                    System.out.println("Dòng không hợp lệ: " + line);
                    continue; // Bỏ qua các dòng không đủ trường dữ liệu
                }
                try {
                    int type = Integer.parseInt(parts[0]);
                    if (type == 1) {
                        String name = parts[1];
                        String birthday = parts[2];
                        double sodu = Double.parseDouble(parts[3]);
                        String chinhanh = parts[4];
                        int stk = Integer.parseInt(parts[5]);
                        String status = parts[6];

                        TaiKhoan_TietKiem taiKhoanTietKiem = new TaiKhoan_TietKiem(name, birthday, sodu, chinhanh, stk, status);
                        taiKhoanTietKiemList.add(taiKhoanTietKiem);
                    } else if (type == 2) {
                        String name = parts[1];
                        String birthday = parts[2];
                        double sodu = Double.parseDouble(parts[3]);
                        String chinhanh = parts[4];
                        int sothe = Integer.parseInt(parts[5]);
                        String mapin = parts[6];

                        TaiKhoan_TinDung taiKhoanTinDung = new TaiKhoan_TinDung(name, birthday, sodu, chinhanh, sothe, mapin);
                        taiKhoanTinDungList.add(taiKhoanTinDung);
                    } else {
                        System.out.println("Loại tài khoản không hợp lệ: " + parts[0]);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Lỗi định dạng số: " + e.getMessage());
                }
            }

            // Hiển thị thông tin sau khi đọc xong tệp tin
            System.out.println("Danh sách tài khoản đã đọc từ file:");
            taiKhoanService.display();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // Đóng các luồng sau khi đọc xong
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


}






