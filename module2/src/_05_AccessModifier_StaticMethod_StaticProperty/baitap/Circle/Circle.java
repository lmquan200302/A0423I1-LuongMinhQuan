package _05_AccessModifier_StaticMethod_StaticProperty.baitap.Circle;

public class Circle {
    private double radius = 1.0;

    private String color = "red";

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }



    //ham Circle khong tham so
    public  Circle(){
        this.radius = radius;
    }
    // ham co tham so
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
}


