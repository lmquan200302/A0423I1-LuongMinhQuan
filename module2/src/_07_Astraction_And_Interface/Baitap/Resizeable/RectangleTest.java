package _07_Astraction_And_Interface.Baitap.Resizeable;



public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);



        System.out.println("Before resize:");
        System.out.println(rectangle);

        double percentIncrease = 10;
        rectangle.resize(percentIncrease);

        System.out.println("After resizing the Rectangle by " + percentIncrease + "%:");
        System.out.println(rectangle);
    }



}