package _06_KeThua.BaiTap.Triangle;

public class Shape {
    private double height = 5.5;

    public Shape(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "height=" + height +
                '}';
    }
}
