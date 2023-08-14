package _06_KeThua.BaiTap.Point_And_MoveablePoint;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Diem xuat phat ban dau la");
        Point point = new Point(3.3f,4.4f);
        System.out.println(point);

        MavablePoint mavablePoint = new MavablePoint(3.3f,4.4f,1.1f,2.2f);
        mavablePoint.move();
        System.out.println("after move:");
        System.out.println("x:" + mavablePoint.getX());
        System.out.println("y:" + mavablePoint.getY());

//        System.out.println(Arrays.toString(mavablePoint.move()));
    }
}
