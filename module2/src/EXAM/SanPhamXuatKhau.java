package EXAM;

public class SanPhamXuatKhau extends SanPham{
    private double giaxk;
    private String tenspxk;


    public SanPhamXuatKhau(int code, String name, double price, String made, double giaxk, String tenspxk) {
        super(code, name, price, made);
        this.giaxk = giaxk;
        this.tenspxk = tenspxk;
    }

    public double getGiaxk() {
        return giaxk;
    }

    public void setGiaxk(double giaxk) {
        this.giaxk = giaxk;
    }

    public String getTenspxk() {
        return tenspxk;
    }

    public void setTenspxk(String tenspxk) {
        this.tenspxk = tenspxk;
    }

    public String getFileLine(){
        return getId() + "," + getCode() + "," +getName() + "," + getPrice() + "," + getMade() + "," + giaxk + "," + tenspxk;
    }
    @Override
    public String toString() {
        return "SanPhamXuatKhau{" +
                "id=" + getId() + '\'' +
                ", code=" + getCode() + '\'' +
                ", name=" + getName() + '\'' +
                ", price=" + getPrice() + '\'' +
                ", made=" + getMade() + '\'' +
                ", giaxk=" + giaxk + '\'' +
                ", tenspxk='" + tenspxk + '\'' +
                '}';
    }
}
