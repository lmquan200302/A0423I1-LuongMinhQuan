package _15_IO_BinaryFile_Serialization.ThucHanh.Demo1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\codegym\\A0423I1-LuongMinhQuan\\module2\\src\\_15_IO_BinaryFile_Serialization\\ThucHanh\\Demo1\\student.data");

        try{
            Student student1 = new Student(1,"Luong Minh Quan",21,"20AD","Quang Nam");
            Student student2 = new Student(2,"Nguyen Van A", 21,"20AD","Da Nang");
            Student student3 = new Student(3,"Nguyen Van C", 22,"20AD","Da Nang");
            Student student4 = new Student(4,"Nguyen Van D",20,"20AD","Quang Binh");
            List<Student> students = new ArrayList<>();
            students.add(student1);
            students.add(student2);
            students.add(student3);
            students.add(student4);



            //Ghi toi duong vao file nhi phan
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            //tien hanh ghi fille nhi phan
            objectOutputStream.writeObject(students);

            fileOutputStream.close();
            objectOutputStream.close();


        }catch (FileNotFoundException e){
            e.printStackTrace();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }




        //tien hanh doc file nhi phan
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Student> students = (List<Student>) objectInputStream.readObject(); //// Đọc danh sách Student từ tệp

            //in ra thong tin student
            for(Student student : students){
                System.out.println(student);
            }
            fileInputStream.close();
            objectInputStream.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
