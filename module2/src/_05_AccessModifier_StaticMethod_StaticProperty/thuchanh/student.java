package _05_AccessModifier_StaticMethod_StaticProperty.thuchanh;

public class student {
    private  int stt;
    private String name;
    private static String lop = "A04";

    //contructor


    public student(int stt, String name) {
        this.stt = stt;
        this.name = name;
    }

    public int getStt() {
        return stt;
    }

    public String getName() {
        return name;
    }

    public static String getLop() {
        return lop;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setLop(String lop) {
        student.lop = lop;
    }

    void display(){
        System.out.println(stt + name + lop);
    }
}
