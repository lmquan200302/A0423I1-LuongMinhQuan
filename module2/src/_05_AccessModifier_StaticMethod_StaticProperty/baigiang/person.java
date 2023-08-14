package _05_AccessModifier_StaticMethod_StaticProperty.baigiang;

public class person {
    private String name;
    public void setName(String name){
        this.name = name; //gan gia tri cua tham so name vao thuoc tinh name cua doi tuong hien tai
    // tu this dung de truy cap cac thuoc tinh cua doi tuong
    }

    public String getName(){
        return this.name; // tra ve gia tri cua thuoc tinh name cua doi tuong hien tai
    }
}
