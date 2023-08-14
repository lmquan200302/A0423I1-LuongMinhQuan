package _06_KeThua.ThucHanh;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle(){

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
}
