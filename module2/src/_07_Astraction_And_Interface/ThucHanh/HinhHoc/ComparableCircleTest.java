package _07_Astraction_And_Interface.ThucHanh.HinhHoc;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6,"Yellow");
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(2.9,"Red");

        for(ComparableCircle circle : circles){
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("After-sorted");
        for(ComparableCircle circle : circles){
            System.out.println(circle);
        }
    }
}
