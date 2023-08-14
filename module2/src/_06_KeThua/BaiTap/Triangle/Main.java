package _06_KeThua.BaiTap.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape(3.3);
        System.out.println(shape.getHeight());

        Triangle triangle = new Triangle(3.3,14.4,15.3,16.4);
        System.out.println("Dien tich tam giac la: " + triangle.getArea());
        System.out.println("Chu vi tam giac la: " + triangle.getPerimeter());


    }

}
