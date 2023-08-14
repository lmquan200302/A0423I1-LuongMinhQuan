package _04_OOP_Java.baitap.Fan;

public class fan {

    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;


    private int speed;
    private boolean on;
    private double radius;
    private String color;


    public fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on) {
            return "Speed: " + speed + ", Color: " + color + ", Radius: " + radius + ", Fan is on";
        } else {
            return "Speed: " + speed + ", Color: " + color + ", Radius: " + radius + ", Fan is on";
        }
    }
}
