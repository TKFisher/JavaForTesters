package com.UdemyAbsoluteIntroToOOP.Lesson_17;



public class HospitalManagement {

    // The callUpon method passes the abstract Employee object as an argument which allow you to
    // target an employee type (ie a Nurse) to perform duties associated to that position.
    public void callUpon(Employee employee) {
        employee.performDuties();
    }


}