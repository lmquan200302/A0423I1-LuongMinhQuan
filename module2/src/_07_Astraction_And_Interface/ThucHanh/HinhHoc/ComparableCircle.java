package _07_Astraction_And_Interface.ThucHanh.HinhHoc;


import _05_AccessModifier_StaticMethod_StaticProperty.baigiang.test.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
public ComparableCircle(){
}
    public ComparableCircle(double radius){
    super(radius);
    }

    public ComparableCircle(double radius, String color){
    super(radius);
    }
    @Override
    public int compareTo(ComparableCircle o) {
        if(getRadius() > o.getRadius())
        return 1;
        else if(getRadius() < o.getRadius()) return -1;
        else return 1;
    }

    @Override
    public String toString() {
        return "ComparableCircle{}";
    }
}
