package _18_Bank;

public class TaiKhoanValidator {
    public static boolean validateTaiKhoanTietKiem(String name, String birthday, String sodu, String chinhanh, String stk, String status) {
        // Kiểm tra xem tất cả các trường đã được nhập hay chưa
        if (name.isEmpty() || birthday.isEmpty() || sodu.isEmpty() || chinhanh.isEmpty() || stk.isEmpty() || status.isEmpty()) {
            System.out.println("Vui lòng nhập đầy đủ thông tin tài khoản tiết kiệm.");
            return false;
        }

        // Kiểm tra xem các trường số liệu có đúng định dạng hay không
        try {
            double soduValue = Double.parseDouble(sodu);
            int stkValue = Integer.parseInt(stk);
        } catch (NumberFormatException e) {
            System.out.println("Số dư hoặc số tài khoản không hợp lệ.");
            return false;
        }

        // Các kiểm tra khác có thể được thêm ở đây tùy theo yêu cầu cụ thể

        return true;
    }

    public static boolean validateTaiKhoanTinDung(String name, String birthday, String sodu, String chinhanh, String sothe, String mapin) {
        // Kiểm tra xem tất cả các trường đã được nhập hay chưa
        if (name.isEmpty() || birthday.isEmpty() || sodu.isEmpty() || chinhanh.isEmpty() || sothe.isEmpty() || mapin.isEmpty()) {
            System.out.println("Vui lòng nhập đầy đủ thông tin tài khoản tín dụng.");
            return false;
        }

        // Kiểm tra xem các trường số liệu có đúng định dạng hay không
        try {
            double soduValue = Double.parseDouble(sodu);
            int sotheValue = Integer.parseInt(sothe);
        } catch (NumberFormatException e) {
            System.out.println("Số dư hoặc số thẻ không hợp lệ.");
            return false;
        }

        // Các kiểm tra khác có thể được thêm ở đây tùy theo yêu cầu cụ thể

        return true;
    }
}
