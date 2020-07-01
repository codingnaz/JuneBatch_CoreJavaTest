package com.exam.encapsulation;

public class Department {
    String deptName, id, location;
    public Department(){
        System.out.println("Department Object is created \ndeptName "+deptName+"\nid: "+id+"\n location: "+location);
    }
    /*public Department(String dName){
        this.deptName=dName;
        System.out.println("Department Object is created");
    }*/
    public Department(String dname, String id){
        this.deptName=dname;
        this.id= id;

        System.out.println("Department Object is created \ndeptName "+deptName+"\nid: "+id+"\n location: "+location);
    }
    public Department(String dname, String id, String location){
        this.deptName=dname;
        this.id= id;
        this.location= location;

        System.out.println("Department Object is created \ndeptName "+deptName+"\nid: "+id+"\n location: "+location);
    }


}
