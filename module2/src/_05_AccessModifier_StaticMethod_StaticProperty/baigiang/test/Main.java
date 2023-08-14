package _05_AccessModifier_StaticMethod_StaticProperty.baigiang.test;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.5);

        System.out.println("ban kinh hinh tron 1 la" + circle1.getRadius());
        System.out.println("dien tich hinh tron 1 la" + circle1.getArea());

        System.out.println();
    }
}
