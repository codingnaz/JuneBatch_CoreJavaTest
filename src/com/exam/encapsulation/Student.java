package com.exam.encapsulation;

public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    private String name, department ;
    private double age;
    public String toString(){
        return "name: "+name+". Age: "+age+". department: "+ department;
    }
}
