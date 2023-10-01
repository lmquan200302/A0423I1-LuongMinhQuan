package Java;

public class SinhVien {
    private int id=1;
    private String tenTruong = "VKU";
    private int khoa = 20;

    public SinhVien(int id, String tenTruong, int khoa) {
        this.id = id;
        this.tenTruong = tenTruong;
        this.khoa = khoa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenTruong() {
        return tenTruong;
    }

    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }

    public int getKhoa() {
        return khoa;
    }

    public void setKhoa(int khoa) {
        this.khoa = khoa;
    }


    @Override
    public String toString() {
        return "SinhVien{" +

                "id=" + id +
                ", tenTruong='" + tenTruong + '\'' +
                ", khoa=" + khoa +
                '}';
    }
}
