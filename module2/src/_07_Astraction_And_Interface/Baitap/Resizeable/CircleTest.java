package _07_Astraction_And_Interface.Baitap.Resizeable;



public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

        double percent = 10;
        circle.resize(percent);

        System.out.println("Dien tich hinh tron " + circle.getArea());
    }
}