package _06_KeThua.BaiTap.Point2D_Point3D;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point2D(){

    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }


    // Method to get XY as a Float array

    public Float[] getXY(float x, float y){
        Float[] xy = new Float[2];
        xy[1] = x;
        xy[2] = y;
        return xy;
    }

    @Override
    public String toString() {
        return "Point [X=" + x + ", Y=" + y + "]";
    }
}
