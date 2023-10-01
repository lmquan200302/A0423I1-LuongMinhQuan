package _17_Phone;

public class Phone_ChinhHang extends Phone {
    private String timebaohanh;
    private int idbaohanh;

    public Phone_ChinhHang(int id, String name, double price, String made, String timebaohanh, int idbaohanh) {
        super(id, name, price, made);
        this.timebaohanh = timebaohanh;
        this.idbaohanh = idbaohanh;
    }

    public String getTimebaohanh() {
        return timebaohanh;
    }

    public void setTimebaohanh(String timebaohanh) {
        this.timebaohanh = timebaohanh;
    }

    public int getIdbaohanh() {
        return idbaohanh;
    }

    public void setIdbaohanh(int idbaohanh) {
        this.idbaohanh = idbaohanh;
    }

    @Override
    public String toString() {
        return "Phone_ChinhHang{" +
                "ID=" + getId() + // Lấy ID từ lớp cơ sở
                ", Name='" + getName() + '\'' + // Lấy Name từ lớp cơ sở
                ", Price=" + getPrice() + // Lấy Price từ lớp cơ sở
                ", Made='" + getMade() +
                "timebaohanh='" + timebaohanh + '\'' +
                ", idbaohanh=" + idbaohanh +
                '}';
    }

}
