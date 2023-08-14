package _05_AccessModifier_StaticMethod_StaticProperty.baitap.Student;

public class Student {
    private String name = "JONH";
    private String classes = "A02";
    //tao ham khong co tham so
    public Student(){
        //ham khong co tham so
    }

    //tao phuong thuc co accsec modifer la pulic
    public void setName(String name){
        this.name = name;
    }
    public void setClasses(String classes){
        this.classes = classes;
    }

    //ham tra ve 2 phuong thuoc duoc goi
    public String setName(){
        return name;
    }
    public String setClasses(){
        return classes;
    }

}
