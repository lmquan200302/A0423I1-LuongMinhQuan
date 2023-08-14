package _06_KeThua.BaiTap.Circle_and_Cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getV(){
      return getRadius() * Math.PI;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
