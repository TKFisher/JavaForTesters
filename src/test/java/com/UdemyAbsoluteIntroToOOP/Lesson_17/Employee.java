package com.UdemyAbsoluteIntroToOOP.Lesson_17;


abstract public class Employee {

    private int id;
    private String name;
    private String department;
    private boolean working;

    // constructor
    public Employee(int id, String name, String department, boolean working) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.working = working;
    }

    // along with the abstract class is the abstract method.  This will all the HospitalManagement class and other classes to use this.
    public abstract void performDuties();

    // good explanation of this:  https://www.youtube.com/watch?v=i4XDy3fJUSQ
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
