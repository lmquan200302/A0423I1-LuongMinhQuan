package _06_KeThua.BaiTap.Point2D_Point3D;

public class Point3D extends Point2D {
private Float z = 0.0f;

    public Point3D(float x, float y, Float z) {
        super(x,y);
        this.z = z;
    }



    public Float getZ() {
        return z;
    }

    public void setZ(Float z) {
        this.z = z;
    }
    public Float[] setXYZ(float x, float y, float z){
        Float[] xyz = new Float[3];

        xyz[0] = x;
        xyz[1] = y;
        xyz[2] = z;
        return xyz;

}

    @Override
    public String toString() {
        return "Point3D [X=" + getX() + ", Y=" + getY() + ", Z=" + getZ() + "]";
    }
}
