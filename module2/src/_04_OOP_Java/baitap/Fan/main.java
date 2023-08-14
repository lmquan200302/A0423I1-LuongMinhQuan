package _04_OOP_Java.baitap.Fan;

public class main {
    public static void main(String[] args) {
        fan fan1 = new fan(fan.FAST, true, 10, "yellow");
        fan fan2 = new fan(fan.MEDIUM, false, 5, "blue");

        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }
}

