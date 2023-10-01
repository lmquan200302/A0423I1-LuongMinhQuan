package _15_IO_BinaryFile_Serialization.ThucHanh.BinaryFile_Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    //Tao phuong thuc writeToObject(String path, List<Student> students) de ghi vao trong file nhi phan
    public static void writeToObject(String path, List<Student> students) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.close();
        fileOutputStream.close();


    }

    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Nguyen Van A","Quang Nam"));
        students.add(new Student(2,"Nguyen Van B","Quang Nam"));
        students.add(new Student(3,"Nguyen van C","Da Nang"));
        writeToObject("student.txt", students);
        List<Student> studentDataFromFile = readDataFromFile("student.txt");
        for(Student student : studentDataFromFile){
            System.out.println(student);
        }
    }
    public static List<Student> readDataFromFile(String path) throws IOException {
        List<Student> students = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        fileInputStream.close();
        objectInputStream.close();
        return students;



    }
}
