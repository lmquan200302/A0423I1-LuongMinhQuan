package EXAM;

public class SanPhapNhapKhau extends SanPham{
    private double giank;
    private double thuenk;
    private String masothue;

    public SanPhapNhapKhau( int code, String name, double price, String made, double giank, double thuenk, String masothue) {
        super(code,name, price, made);
        this.giank = giank;
        this.thuenk = thuenk;
        this.masothue = masothue;
    }

    public double getGiank() {
        return giank;
    }

    public void setGiank(double giank) {
        this.giank = giank;
    }

    public double getThuenk() {
        return thuenk;
    }

    public void setThuenk(double thuenk) {
        this.thuenk = thuenk;
    }

    public String getMasothue() {
        return masothue;
    }

    public void setMasothue(String masothue) {
        this.masothue = masothue;
    }
    public String getFileLine(){
        return getId() + "," + getCode() + "," +getName() + "," + getPrice() + "," + getMade() + "," + giank + "," + thuenk + "," + masothue;
    }

    @Override
    public String toString() {
        return "SanPhapNhapKhau{" +
                "id=" + getId() + '\'' +
                ", code=" + getCode() + '\'' +
                ", name=" + getName() + '\'' +
                ", price=" + getMade() + '\'' +
                ", made=" + getMade() + '\'' +
                ", giank=" + giank +
                ", thuenk=" + thuenk +
                ", masothue='" + masothue + '\'' +
                '}';
    }
}
