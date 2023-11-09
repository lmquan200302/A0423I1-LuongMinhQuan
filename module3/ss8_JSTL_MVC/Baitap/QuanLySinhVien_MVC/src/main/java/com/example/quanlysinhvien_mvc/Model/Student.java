package com.example.quanlysinhvien_mvc.Model;

public class Student {
    private int id;
    private String name;
    private String email;
    private String grader;
    private String address;
    private float point;

    public Student() {
    }

    public Student(int id, String name, String email, String grader, String address, float point) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.grader = grader;
        this.address = address;
        this.point = point;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGrader() {
        return grader;
    }

    public void setGrader(String grader) {
        this.grader = grader;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", grader='" + grader + '\'' +
                ", address='" + address + '\'' +
                ", point=" + point +
                '}';
    }
}
