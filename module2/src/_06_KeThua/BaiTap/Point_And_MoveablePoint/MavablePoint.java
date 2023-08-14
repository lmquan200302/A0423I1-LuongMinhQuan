package _06_KeThua.BaiTap.Point_And_MoveablePoint;

public class MavablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    //contructor MavablePoint
    public MavablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public Float[] getSpeed(float xSpeed, float ySpeed) {
        Float[] getSpeed = new Float[2];

        getSpeed[0] = xSpeed;
        getSpeed[1] = ySpeed;

        return getSpeed;


    }

    @Override
    public String toString() {
        return "MavablePoint{" +
                "x=" + getX() +
                "y" + getY() +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';

    }

    public void move() {
        float x = getX();
        float y = getY();

        x += xSpeed;
        y += ySpeed;
        this.setX(x);
        this.setY(y);


//        double[] res = new double[2];
//        res[0] = x;
//        res[1] = y;
//        return res;

      //  return new double[]{x,y};
    }
}