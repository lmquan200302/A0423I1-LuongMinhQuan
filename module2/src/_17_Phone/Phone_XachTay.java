package _17_Phone;

public class Phone_XachTay extends Phone{
    private String country;
    private String status;

    public Phone_XachTay(int id, String name, double price, String made, String country, String status) {
        super(id, name, price, made);
        this.country = country;
        this.status = status;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Phone_XachTay{" +
                "ID=" + getId() + // Lấy ID từ lớp cơ sở
                ", Name='" + getName() + '\'' + // Lấy Name từ lớp cơ sở
                ", Price=" + getPrice() + // Lấy Price từ lớp cơ sở
                ", Made='" + getMade() +
                "country='" + country + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
