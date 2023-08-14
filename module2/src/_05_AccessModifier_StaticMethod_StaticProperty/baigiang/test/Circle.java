package _05_AccessModifier_StaticMethod_StaticProperty.baigiang.test;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    public  Circle(){
        //ham khong tham so
    }
    public  Circle(double radius){
        this.radius = radius;
    }

    //tao 2 phuong thuc getRadius va getArea
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
}
