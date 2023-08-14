package _04_OOP_Java.baitap.ptb2;

public class giaipt {
    private double a;
    private double b;
    private double c;
    public giaipt(){}

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public giaipt(double hesoA, double hesoB, double hesoC){
        this.a = hesoA;
        this.b = hesoB;
        this.c = hesoC;
    }

    public double delta(){

        return b * b - 4 * a * c;
    }

    public double nghiem1(){
        if(delta() >= 0){
            return (-b + Math.sqrt(delta())) / (2 * a);
    }
        return 0;
}

    public double nghiem2(){
    if(delta() >= 0){
        return (-b - Math.sqrt(delta())) / (2 * a);
    }
    return 0;
}

    public double nghiemduynhat(){
        if(delta() == 0){
            return  (-b) / (2 * a);
        }
        return  0;
    }
}

