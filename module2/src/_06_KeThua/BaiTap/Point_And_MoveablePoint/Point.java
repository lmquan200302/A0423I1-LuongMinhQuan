package _06_KeThua.BaiTap.Point_And_MoveablePoint;

public class Point {
    private float x;
    private float y;
    //contructor Point
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    //get & set Point


    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        float[] xy = new float[2];
        xy[0] = x;
        xy[1] = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
