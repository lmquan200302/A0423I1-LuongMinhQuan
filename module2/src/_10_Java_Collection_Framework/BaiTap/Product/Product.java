package _10_Java_Collection_Framework.BaiTap.Product;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id) {
        this.id = id;
    }

//contructor

    public Product(int id, String name,double price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public void setPrice(float price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return "listProduct{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
