package _06_KeThua.BaiTap.Circle_and_Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0,"Red");
        System.out.println("Hinh tron: ");
        System.out.println("Radius: "+circle.getRadius());
        System.out.println("Color: "+circle.getColor());



        Cylinder cylinder = new Cylinder(5.0,"yello",5);
        System.out.println("The tich hinh tru la" + cylinder.getV());
    }
}
