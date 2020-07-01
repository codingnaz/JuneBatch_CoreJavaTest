package com.exam.encapsulation;

public class StudentDetails {
    public  static void  main(String args[]){
        Student student= new Student();
        student.setName("Nazmul");
        student.setAge(23.2D);
        student.setDepartment("CS");
        System.out.println(student);

    }
}
