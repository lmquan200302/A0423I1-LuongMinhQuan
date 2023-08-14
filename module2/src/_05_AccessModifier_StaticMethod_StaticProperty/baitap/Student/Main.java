package _05_AccessModifier_StaticMethod_StaticProperty.baitap.Student;

public class Main {
    public static void main(String[] args) {
        //Khoi tao doi tuong student 1 va 2
        Student student1 = new Student();
        Student student2 = new Student();


        System.out.println("Ten hoc vien 1: " + student1.setName());
        System.out.println("Lop hoc vien 1: " + student2.setClasses());

        //Truy cập phương thức setName và setClasses cho student2
        student2.setName("Luong Minh quan");
        System.out.println("Ten hoc vien 2: " + student2.setName());
        System.out.println("Lop hoc vien 2: " + student2.setClasses());

    }
    // Neu ta thay doi Access Modifier cho 2 phuong thuc setName va setClasses la private, vi private chi co pham vi truy cap trong 1 class nen class Main se khong tuy cap vao duoc

}

