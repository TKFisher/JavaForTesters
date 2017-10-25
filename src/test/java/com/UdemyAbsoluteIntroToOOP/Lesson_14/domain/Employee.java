package com.UdemyAbsoluteIntroToOOP.Lesson_14.domain;


public class Employee {

    private int id;
    private String name;
    private String department;
    private boolean working;

    public Employee(int id, String name, String department, boolean working) {

        this.name = name;
        this.id = id;
        this.department = department;
        this.working = working;
    }

    // This is a best practice is to override the toString method so that we can print an instance of the Employee class in
    // a more readable form.  (by selecting Generate toString method from Code menu)
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", working=" + working +
                '}';
    }
}
