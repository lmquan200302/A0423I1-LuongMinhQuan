package _17_Phone;

public class Phone {
    private int id;
    private String name;
    private double price;
    private String made;

    public Phone(int id, String name, double price, String made) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.made = made;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", made='" + made + '\'' +
                '}';
    }
}
