package com.UdemyAbsoluteIntroToOOP.Lesson_17;



public class Doctor extends Employee {


    // a constructor that passed in arguments via the extended Employee object.
    public Doctor(int id, String name, String department, boolean working) {
        super(id, name, department, working);

        System.out.println("Doctor in action ...");
    }

    // Doctor Duties:
    private void prescribeDrugs() {
        System.out.println("Prescribe Drugs");
    }
    private void diagnosePatients() {
        System.out.println("Diagnose Patient.");
    }


    // This comes from the Employee class as an abstract method and can be used
    // to perform duties associated to this class.
    @Override
    public void performDuties() {
        prescribeDrugs();
        diagnosePatients();

    }
}
