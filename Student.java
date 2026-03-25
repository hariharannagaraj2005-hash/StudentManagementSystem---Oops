package org.example;

public class Student {
    private final int id;
    private String name;
    private int age;
    private String Department;

    Student(int id, String name, int age, String Department){
        this.id = id;
        this.name = name;
        this.age = age;
        this.Department = Department;
    }

    public int getId(){
        return id;
    }





    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String toString(){
        return "ID : "+" "+id+" "+"Name : "+" "+name+" "+"Age : "+" "+age+" "+"DepartMent : "+" "+Department;
    }

}
