package _13_ExceptionHandling_Debug.BaiTap.IllegalTriangleException_PTbac2;


public class GiaiPT {
    private double a;
    private double b;
    private double c;

    public GiaiPT(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double delta(){
        return b * b - 4 * a * c;
    }
    public double x1(){
        return (-b + Math.sqrt(delta())) / (2 * a);
    }
    public double x2(){
        return (-b - Math.sqrt(delta())) / (2 * a);
    }

    public double ngiemduynhat(){
        return -b * (2 * a);
    }
}
