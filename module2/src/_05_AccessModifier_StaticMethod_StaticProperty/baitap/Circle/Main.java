package _05_AccessModifier_StaticMethod_StaticProperty.baitap.Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.5);
        System.out.println("Ban kinh hinh tron 1: " + circle1.getRadius());
        System.out.println("Dien tich hinh tron 1 la: " + circle1.getArea());

        System.out.println("Ban kinh hinh tron 2:" + circle2.getRadius());
        System.out.println("Dien tich hinh tron 2:" + circle2.getArea());
    }
}
