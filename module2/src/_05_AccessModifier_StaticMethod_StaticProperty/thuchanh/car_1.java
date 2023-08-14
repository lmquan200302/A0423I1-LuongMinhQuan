package _05_AccessModifier_StaticMethod_StaticProperty.thuchanh;

public class car_1 {
    private String name;
    private String engine;
    public static int stt;

    //contructor

    public car_1(String name, String engine) {
        this.name = name;
        this.engine = engine;
        stt++;

    }
    //getter setter

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
    void display(){
        System.out.println(name + engine + stt);
    }
}
